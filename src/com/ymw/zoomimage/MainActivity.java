package com.ymw.zoomimage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

public class MainActivity extends Activity {

	private ZoomImageView zoomImg;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		zoomImg = (ZoomImageView) findViewById(R.id.image);
		Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),
				R.drawable.a);
		zoomImg.setImage(bitmap);

	}
}