package chetan.com.customeviewdemo.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;

/**
 * Created by chetan on 24/11/16.
 */

public class CustomTrangle   extends View
{
    public CustomTrangle(Context context)
    {
        super(context);
    }

    public CustomTrangle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTrangle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomTrangle(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {

        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);
        paint.setStrokeWidth(10);
        paint.setColor(android.graphics.Color.RED);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);

        Point a = new Point(500, 100);
        Point b = new Point(200, 800);
        Point c = new Point(800, 800);

        Path path = new Path();
        //path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(b.x, b.y);
        path.lineTo(c.x, c.y);
        path.lineTo(a.x, a.y);
        path.close();
        canvas.drawPath(path, paint);
    }



}
