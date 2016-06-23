package com.akshay.smartbutton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;

import com.akshay.smartbutton.Utils.SmartButton;


public class MainActivity extends Activity {

    private final int PRESSED_HEIGHT = 0;
    private final int NORMAL_HEIGHT = 1;
    private final int CORNERS = 2;
    private SmartButton button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (SmartButton) findViewById(R.id.button);
        SeekBar seekPressedHeight = (SeekBar) findViewById(R.id.seekPressedHeight);
        SeekBar seekNormalHeight = (SeekBar) findViewById(R.id.seekNormalHeight);
        SeekBar seekCorners = (SeekBar) findViewById(R.id.seekCorners);

        setOnSeekBarChangeListener(seekPressedHeight, PRESSED_HEIGHT);
        setOnSeekBarChangeListener(seekNormalHeight, NORMAL_HEIGHT);
        setOnSeekBarChangeListener(seekCorners, CORNERS);
    }

    public void setOnSeekBarChangeListener(SeekBar seekBar, final int id) {
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                switch (id) {
                    case PRESSED_HEIGHT:
                        button.setPressedHeight(seekBar.getProgress());
                        break;
                    case NORMAL_HEIGHT:
                        button.setNormalHeight(seekBar.getProgress());
                        break;
                    case CORNERS:
                        button.setCorners(seekBar.getProgress());
                        break;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
}
