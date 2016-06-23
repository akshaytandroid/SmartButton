# SmartButton
Smart Button with Height, Shadow and a lot more options...


Usage: 

```XML
  <com.akshay.smartbutton.Utils.SmartButton
            xmlns:livebutton="http://schemas.android.com/apk/res-auto"
            android:id="@+id/button"
            android:layout_gravity="center_horizontal"
            android:layout_margin="100dp"
            android:layout_height="60dp"
            android:layout_width="300dp"
            android:text="Button"
            android:textColor="#ffffff"
            android:textStyle="bold"
            android:textSize="26sp"
            livebutton:corners="4dp"
            livebutton:normalHeight="4dp"
            livebutton:pressedHeight="2dp"
            livebutton:backgroundColor="#F57F76"
            livebutton:shadowColor="#b16262" />
```

<b>OR</b>

```JAVA
SmartButton smartBtn = (SmartButton) findViewById(R.id.btn);
smartBtn.setPressedHeight(2);
smartBtn.setNormalHeight(8);
smartBtn.setCorners(12);
smartBtn.setBackgroundColor(0xffF57F76);
smartBtn.setShadowColor(0xffb16262);
```
