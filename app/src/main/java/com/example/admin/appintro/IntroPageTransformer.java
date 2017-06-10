package com.example.admin.appintro;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by admin on 6/10/2017.
 */
public class IntroPageTransformer implements ViewPager.PageTransformer {

    @Override
    public void transformPage(View page, float position) {


        int pagePosition = (int) page.getTag();

        int pageWidth = page.getWidth();
        float pageWidthTimesPosition = pageWidth * position;
        float absPosition = Math.abs(position);

        if (position <= -1.0f || position >= 1.0f) {


        } else if (position == 0.0f) {

        } else {

            View title = page.findViewById(R.id.title);
            title.setAlpha(1.0f - absPosition);

            View description = page.findViewById(R.id.description);
            description.setTranslationY(pageWidthTimesPosition / 2f);
            description.setAlpha(1.0f + absPosition);

            View image = page.findViewById(R.id.image);

            if (pagePosition == 0 && image != null) {
                image.setAlpha(1.0f - absPosition);
                image.setTranslationX(-pageWidthTimesPosition * 1.5f);
            }

            else if(pagePosition == 1 && image != null){
                image.setAlpha(1.0f - absPosition);
                image.setTranslationX(-pageWidthTimesPosition * 1.5f);

            }else if(pagePosition == 2 && image != null){
                image.setAlpha(1.0f - absPosition);
                image.setTranslationX(-pageWidthTimesPosition * 1.5f);
            }else if(pagePosition == 3 && image != null){
                image.setAlpha(1.0f - absPosition);
                image.setTranslationX(-pageWidthTimesPosition * 1.5f);
            }
        }
    }
}