package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mT1;
    Button mRed;
    Button mBlue;


    int mStoryIndex=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mT1 = (TextView) findViewById(R.id.storyTextView);
        mRed = (Button) findViewById(R.id.buttonTop);
        mBlue = (Button) findViewById(R.id.buttonBottom);






        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex==1){
                    mT1.setText(R.string.T3_Story);
                    mRed.setText(R.string.T3_Ans1);
                    mBlue.setText(R.string.T3_Ans2);
                    mStoryIndex=3;

                }

                else if (mStoryIndex == 3) {
                    mT1.setText(R.string.T6_End);
                    mRed.setVisibility(View.GONE);
                    mBlue.setVisibility(View.GONE);

                }
                else if (mStoryIndex == 2)
                {
                    mT1.setText(R.string.T3_Story);
                    mRed.setText(R.string.T3_Ans1);
                    mBlue.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }
            }
        });





        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex==1){
                mT1.setText(R.string.T2_Story);
                mRed.setText(R.string.T2_Ans1);
                mBlue.setText(R.string.T2_Ans2);
                mStoryIndex=2;


            }

            else if (mStoryIndex == 2) {
                    mT1.setText(R.string.T4_End);
                    mRed.setVisibility(View.GONE);
                    mBlue.setVisibility(View.GONE);

                    }
                    else if (mStoryIndex == 3)
                {
                    mT1.setText(R.string.T5_End);
                    mRed.setVisibility(View.GONE);
                    mBlue.setVisibility(View.GONE);
                }


                }


        });



    }
}
