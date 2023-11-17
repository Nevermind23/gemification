package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.load.resource.bitmap.C2520l;
import com.github.mikephil.charting.utils.Utils;
import g91.C32289b0;
import g91.C32335t0;
import g91.C32359z0;
import l81.C37111g;
import p035c4.C2256h;
import p060e1.C5958l0;
import p166m3.C7092l;
import p296w3.C8761k;
import p341ge.bog.mobilebank.model.account.ProductProperties;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.ArrowLayout */
public class ArrowLayout extends FrameLayout {
    public static final int FRAME_STATE_HIDDEN = 12;
    public static final int FRAME_STATE_SHOWN_DISABLED = 10;
    public static final int FRAME_STATE_SHOWN_ENABLED = 11;
    public static final int FRAME_STATE_SHOWN_WHITE = 13;
    private ImageView bankLogoIV;
    private BogTextView leftAmountTV;
    private Drawable leftDrawable;
    private ImageView leftFrame;
    private int leftFrameState;
    private ImageView leftIV;
    private int leftImageId;
    private FrameLayout leftLayout;
    private BogTextView leftNameTV;
    private BogTextView rightAmountTV;
    private Drawable rightDrawable;
    private ImageView rightFrame;
    private int rightFrameState;
    private ImageView rightIV;
    private int rightImageId;
    private FrameLayout rightLayout;
    private BogTextView rightNameTV;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.ArrowLayout$a */
    class C35715a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ FrameLayout f86338d;

        C35715a(FrameLayout frameLayout) {
            this.f86338d = frameLayout;
        }

        public void run() {
            this.f86338d.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).setInterpolator(new AccelerateDecelerateInterpolator());
        }
    }

    public ArrowLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void animateFrame(FrameLayout frameLayout) {
        frameLayout.animate().scaleX(1.05f).scaleY(1.05f).setDuration(100).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new C35715a(frameLayout));
    }

    private Boolean contextIsValid(Context context) {
        boolean z;
        if (context == null) {
            return Boolean.FALSE;
        }
        if (!(context instanceof Activity)) {
            return Boolean.TRUE;
        }
        Activity activity = (Activity) context;
        if (activity.isDestroyed() || activity.isFinishing()) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private void findViews() {
        this.leftIV = (ImageView) findViewById(C10322k.f28841hj);
        this.rightIV = (ImageView) findViewById(C10322k.f28810Ys);
        this.leftFrame = (ImageView) findViewById(C10322k.left_frame);
        this.rightFrame = (ImageView) findViewById(C10322k.right_frame);
        this.leftLayout = (FrameLayout) findViewById(C10322k.left_layout);
        this.rightLayout = (FrameLayout) findViewById(C10322k.right_layout);
        this.leftAmountTV = (BogTextView) findViewById(C10322k.left_amount_tv);
        this.leftNameTV = (BogTextView) findViewById(C10322k.left_name_tv);
        this.rightAmountTV = (BogTextView) findViewById(C10322k.right_amount_tv);
        this.rightNameTV = (BogTextView) findViewById(C10322k.right_name_tv);
        this.bankLogoIV = (ImageView) findViewById(C10322k.arrow_layout_other_bank_logo);
    }

    private void invalidateFrames() {
        int i = C10318g.arrow_disabled_stroke_color;
        switch (this.leftFrameState) {
            case 10:
                this.leftFrame.setImageDrawable(C32359z0.m95561c0(getContext(), C10320i.vector_left_frame, i));
                showLeftFrame(true);
                break;
            case 11:
                this.leftFrame.setImageDrawable(C32359z0.m95561c0(getContext(), C10320i.vector_left_frame, C32335t0.m95359d(getContext(), true)));
                showLeftFrame(true);
                break;
            case 12:
                showLeftFrame(false);
                break;
            case 13:
                this.leftFrame.setImageDrawable(C32359z0.m95561c0(getContext(), C10320i.vector_left_frame, C10318g.f28629P0));
                showLeftFrame(true);
                break;
        }
        switch (this.rightFrameState) {
            case 10:
                this.rightFrame.setImageDrawable(C32359z0.m95561c0(getContext(), C10320i.vector_right_frame, i));
                showRightFrame(true);
                return;
            case 11:
                this.rightFrame.setImageDrawable(C32359z0.m95561c0(getContext(), C10320i.vector_right_frame, C32335t0.m95359d(getContext(), true)));
                showRightFrame(true);
                return;
            case 12:
                showRightFrame(false);
                return;
            case 13:
                this.rightFrame.setImageDrawable(C32359z0.m95561c0(getContext(), C10320i.vector_right_frame, C10318g.f28629P0));
                showRightFrame(true);
                return;
            default:
                return;
        }
    }

    private void setImage(Drawable drawable, ImageView imageView, boolean z) {
        int i;
        FrameLayout frameLayout;
        C2256h hVar = new C2256h();
        C7092l[] lVarArr = new C7092l[2];
        lVarArr[0] = new C2520l();
        Context context = getContext();
        if (imageView == this.leftIV) {
            i = C10320i.left_mask;
        } else {
            i = C10320i.right_mask;
        }
        lVarArr[1] = new C37111g(context, i);
        C2256h hVar2 = (C2256h) hVar.mo7255x0(lVarArr);
        Context context2 = imageView.getContext();
        if (contextIsValid(context2).booleanValue()) {
            C2379b.m9210t(context2).mo7751t(drawable).mo7215a(hVar2).mo7731c1(C8761k.m32594h()).mo7718L0(imageView);
            if (z) {
                if (imageView == this.leftIV) {
                    frameLayout = this.leftLayout;
                } else {
                    frameLayout = this.rightLayout;
                }
                animateFrame(frameLayout);
            }
        }
    }

    private void setTexts(String str, String str2, boolean z, boolean z2) {
        BogTextView bogTextView;
        BogTextView bogTextView2;
        FrameLayout frameLayout;
        String str3;
        if (z) {
            bogTextView = this.leftAmountTV;
        } else {
            bogTextView = this.rightAmountTV;
        }
        if (z) {
            bogTextView2 = this.leftNameTV;
        } else {
            bogTextView2 = this.rightNameTV;
        }
        if (z) {
            frameLayout = this.leftLayout;
        } else {
            frameLayout = this.rightLayout;
        }
        if (z) {
            str3 = getContext().getString(C10328q.transfer_from);
        } else {
            str3 = getContext().getString(C10328q.transfer_to);
        }
        try {
            C5958l0.m23910a(frameLayout);
        } catch (Exception unused) {
        }
        if (str2 != null) {
            bogTextView.setVisibility(0);
            bogTextView.setText(str2);
            bogTextView2.setText(str);
        } else if (z2) {
            bogTextView2.setText(str3);
            bogTextView.setVisibility(8);
        } else {
            bogTextView2.setText(str);
            bogTextView.setVisibility(8);
        }
    }

    public String getAccountName() {
        return this.rightNameTV.getText().toString();
    }

    public int getAlphaColor(int i) {
        return Color.argb(BogInputLayout.INPUT_NORMAL_STATE, Color.red(i), Color.green(i), Color.blue(i));
    }

    public Drawable getLeftDrawable() {
        return this.leftIV.getDrawable();
    }

    public Drawable getRightDrawable() {
        return this.rightIV.getDrawable();
    }

    public void resetLeft() {
        resetLeft(13);
    }

    public void resetRight() {
        setRight((Drawable) null, false, (String) null, (String) null, true);
        setTextColorIds(C10318g.f28628O0, false);
        setRightFrameState(13);
    }

    public void setBankLogo(int i) {
        setBankLogo(i, (String) null, true);
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt, boolean z) {
        if (z) {
            this.leftNameTV.setEllipsize(truncateAt);
        } else {
            this.rightNameTV.setEllipsize(truncateAt);
        }
    }

    public void setLeft(Drawable drawable, boolean z, String str, String str2, boolean z2) {
        if (this.leftDrawable != drawable) {
            setImage(drawable, this.leftIV, z);
        }
        setTexts(str, str2, true, z2);
        this.leftDrawable = drawable;
        if (drawable == null) {
            this.leftImageId = -2;
        }
    }

    public void setLeftClickListener(View.OnClickListener onClickListener) {
        this.leftFrame.setOnClickListener(onClickListener);
    }

    public void setLeftColor(int i, boolean z, boolean z2) {
        this.leftImageId = -1;
        setLeft((Drawable) new ColorDrawable(getAlphaColor(C0767a.m2893c(getContext(), i))), z, (String) null, (String) null, z2);
    }

    public void setLeftFrameState(int i) {
        this.leftFrameState = i;
        invalidateFrames();
    }

    public void setRight(int i, boolean z, String str, String str2, boolean z2) {
        Drawable drawable;
        if (i != this.rightImageId) {
            this.rightImageId = i;
            try {
                drawable = C0767a.m2895e(getContext(), i);
            } catch (Exception unused) {
                drawable = new ColorDrawable(C0767a.m2893c(getContext(), ProductProperties.invertWhiteColor));
            }
            setRight(drawable, z, str, str2, z2);
            return;
        }
        setRight(this.rightDrawable, z, str, str2, z2);
    }

    public void setRightClickListener(View.OnClickListener onClickListener) {
        this.rightFrame.setOnClickListener(onClickListener);
    }

    public void setRightColor(int i, boolean z, boolean z2) {
        this.rightImageId = -1;
        setRight((Drawable) new ColorDrawable(getAlphaColor(C0767a.m2893c(getContext(), i))), z, (String) null, (String) null, z2);
    }

    public void setRightFrameState(int i) {
        this.rightFrameState = i;
        invalidateFrames();
    }

    public void setTextColorIds(int i, boolean z) {
        BogTextView bogTextView;
        BogTextView bogTextView2;
        if (z) {
            bogTextView = this.leftNameTV;
        } else {
            bogTextView = this.rightNameTV;
        }
        if (z) {
            bogTextView2 = this.leftAmountTV;
        } else {
            bogTextView2 = this.rightAmountTV;
        }
        bogTextView.setTextColor(C0767a.m2893c(getContext(), i));
        if (i != ProductProperties.invertBlackColor) {
            bogTextView2.setTextColor(C0767a.m2893c(getContext(), i));
        } else {
            bogTextView2.setTextColor(C0767a.m2893c(getContext(), C10318g.arrow_layout_bottom_gray_color));
        }
    }

    public void showLeftFrame(boolean z) {
        if (z) {
            if (this.leftFrame.getAlpha() < 1.0f) {
                this.leftFrame.animate().alpha(1.0f);
            }
        } else if (this.leftFrame.getAlpha() > Utils.FLOAT_EPSILON) {
            this.leftFrame.animate().alpha(Utils.FLOAT_EPSILON);
        }
    }

    public void showRightFrame(boolean z) {
        if (z) {
            if (this.rightFrame.getAlpha() < 1.0f) {
                this.rightFrame.animate().alpha(1.0f);
            }
        } else if (this.rightFrame.getAlpha() > Utils.FLOAT_EPSILON) {
            this.rightFrame.animate().alpha(Utils.FLOAT_EPSILON);
        }
    }

    public ArrowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public void resetLeft(int i) {
        setLeft((Drawable) null, false, (String) null, (String) null, true);
        setTextColorIds(C10318g.f28628O0, true);
        setLeftFrameState(i);
    }

    public void setBankLogo(int i, String str, boolean z) {
        try {
            C5958l0.m23910a(this.rightLayout);
        } catch (Exception unused) {
        }
        if (i != -1 || !TextUtils.isEmpty(str)) {
            this.bankLogoIV.setVisibility(0);
            if (!TextUtils.isEmpty(str)) {
                if (i == -1) {
                    i = C10320i.f28688dc;
                }
                Integer valueOf = Integer.valueOf(i);
                C32289b0.m95107s(this.bankLogoIV, str, valueOf, valueOf, true, false);
            } else if (i == -1) {
            } else {
                if (z) {
                    C32289b0.m95095g(this.bankLogoIV, Integer.valueOf(i));
                } else {
                    this.bankLogoIV.setImageResource(i);
                }
            }
        } else {
            this.bankLogoIV.setImageDrawable((Drawable) null);
            this.bankLogoIV.setVisibility(8);
        }
    }

    public ArrowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.leftFrameState = 10;
        this.rightFrameState = 10;
        setClipChildren(false);
        View.inflate(context, C10324m.arrow_layout, this);
        findViews();
        invalidateFrames();
    }

    public void setLeft(int i, boolean z, String str, String str2, boolean z2) {
        Drawable drawable;
        if (i != this.leftImageId) {
            this.leftImageId = i;
            try {
                drawable = C0767a.m2895e(getContext(), i);
            } catch (Exception unused) {
                drawable = new ColorDrawable(C0767a.m2893c(getContext(), ProductProperties.invertWhiteColor));
            }
            setLeft(drawable, z, str, str2, z2);
            return;
        }
        setLeft(this.leftDrawable, z, str, str2, z2);
    }

    public void setRight(Drawable drawable, boolean z, String str, String str2, boolean z2) {
        if (this.rightDrawable != drawable) {
            setImage(drawable, this.rightIV, z);
        }
        setTexts(str, str2, false, z2);
        this.rightDrawable = drawable;
        if (drawable == null) {
            this.rightImageId = -2;
        }
    }
}
