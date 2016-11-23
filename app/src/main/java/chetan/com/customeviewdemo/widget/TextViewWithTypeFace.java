package chetan.com.customeviewdemo.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

import chetan.com.customeviewdemo.R;
import chetan.com.customeviewdemo.util.FontUtil;

public class TextViewWithTypeFace extends TextView
{

    public TextViewWithTypeFace(Context context)
    {
        super(context);
        init(this,context,null,0);
    }

    public TextViewWithTypeFace(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init( this,context,attrs,0);
    }

    public TextViewWithTypeFace(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init(this,context,attrs,defStyleAttr);
    }


    public void setTypeface( String typeface )
    {
        FontUtil.setTypeface( this, typeface);
    }


    protected static void init(TextView view, Context context,
                               AttributeSet attrs, int defStyle)
    {
        if (attrs != null)
        {

            int[] set = {
                   // idx 0
                    android.R.attr.text        // idx 1
            };
            TypedArray attributes = context.obtainStyledAttributes(attrs, set);

            CharSequence text = attributes.getText(0);



            final TypedArray a = context.obtainStyledAttributes(
                    attrs, R.styleable.TextViewWithTypeFace, defStyle, 0);
            final String typeface =
                    a.getString(R.styleable.TextViewWithTypeFace_typeface);

            final boolean isUnderline = a.getBoolean( R.styleable.TextViewWithTypeFace_underline, false);


            a.recycle();

            FontUtil.setTypeface(view, typeface);
            FontUtil.setUnderLine(view ,text.toString(), isUnderline );
        }
    }
}
