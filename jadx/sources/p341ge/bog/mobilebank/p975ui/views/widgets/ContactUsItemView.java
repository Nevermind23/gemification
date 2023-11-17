package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g91.C32289b0;
import p366bk.C10316e;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10330s;
import p642vh.C18368l;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.ContactUsItemView */
public class ContactUsItemView extends LinearLayout {
    public static final int CONTACT_TYPE_EMAIL = 1;
    public static final int CONTACT_TYPE_PHONE = 0;
    private String contact;
    private int contactType = 0;
    private ImageView icon;
    private ImageView rightIcon;
    private String title;

    public ContactUsItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        setOrientation(1);
        setClickable(true);
        View.inflate(context, C10324m.contact_us_item, this);
        this.icon = (ImageView) findViewById(C10322k.f28786R8);
        this.rightIcon = (ImageView) findViewById(C10322k.f28825ct);
        TextView textView = (TextView) findViewById(C10322k.contact_title);
        TextView textView2 = (TextView) findViewById(C10322k.contact_number);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29365m2);
        if (obtainStyledAttributes != null) {
            int resourceId = obtainStyledAttributes.getResourceId(C10330s.f29395p2, -1);
            boolean z = obtainStyledAttributes.getBoolean(C10330s.f29385o2, false);
            this.icon.setImageResource(resourceId);
            if (z) {
                this.icon.setImageTintList(ColorStateList.valueOf(C18368l.m62755d(context, C10316e.f28605g)));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(C10330s.f29435t2, -1);
            if (resourceId2 != -1) {
                ImageView imageView = this.rightIcon;
                Integer valueOf = Integer.valueOf(resourceId2);
                int i2 = C10320i.f28688dc;
                C32289b0.m95109u(imageView, valueOf, Integer.valueOf(i2), Integer.valueOf(i2), false, true);
            }
            String string = obtainStyledAttributes.getString(C10330s.f29415r2);
            this.title = string;
            textView.setText(string);
            String string2 = obtainStyledAttributes.getString(C10330s.f29405q2);
            this.contact = string2;
            textView2.setText(string2);
            boolean z2 = obtainStyledAttributes.getBoolean(C10330s.f29375n2, false);
            View.inflate(context, C10324m.contact_us_item_divider_view, this);
            View findViewById = findViewById(C10322k.f28850jc);
            if (z2) {
                i = 0;
            } else {
                i = 4;
            }
            findViewById.setVisibility(i);
            this.contactType = obtainStyledAttributes.getInt(C10330s.f29425s2, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public String getContact() {
        return this.contact;
    }

    public int getContactType() {
        return this.contactType;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContactNumber(String str) {
        ((TextView) findViewById(C10322k.contact_number)).setText(str);
        this.contact = str;
    }

    public void setDivider(boolean z) {
        findViewById(C10322k.f28850jc).setVisibility(z ? 0 : 4);
    }

    public void setIcon(int i) {
        this.icon.setImageResource(i);
    }

    public void setImage(int i, boolean z) {
        ImageView imageView = this.rightIcon;
        if (imageView != null) {
            Integer valueOf = Integer.valueOf(i);
            int i2 = C10320i.f28688dc;
            C32289b0.m95109u(imageView, valueOf, Integer.valueOf(i2), Integer.valueOf(i2), false, z);
        }
    }

    public void setTitle(String str) {
        ((TextView) findViewById(C10322k.contact_title)).setText(str);
        this.title = str;
    }
}
