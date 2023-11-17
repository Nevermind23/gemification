package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import com.bumptech.glide.C2379b;
import g91.C32289b0;
import g91.C32335t0;
import g91.C32355x0;
import java.io.File;
import p050d4.C5817c;
import p063e4.C6032d;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.TextTypeView */
public class TextTypeView extends FrameLayout implements IProviderTypeView {
    public static final int NO_SEPARATOR = 402;
    public static final int SEPARATOR_BEFORE_ICON = 401;
    public static final int SEPARATOR_FULL = 400;
    private ImageView iconImage;
    /* access modifiers changed from: private */
    public BogInputLayout mBogInputLayout;
    public boolean mClickEnabled;
    private boolean mEditable;
    private View mHoleView;
    private String mInputType = "";
    private int mLayoutColor;
    private int mPosition;
    private int mSeparator;
    private String mTitleText;
    private String mValueText;
    /* access modifiers changed from: private */
    public View mViewSelector;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.TextTypeView$a */
    class C35761a implements ViewTreeObserver.OnGlobalLayoutListener {
        C35761a() {
        }

        public void onGlobalLayout() {
            TextTypeView.this.mViewSelector.getLayoutParams().height = TextTypeView.this.mBogInputLayout.getHeight();
            C32355x0.m95523n(TextTypeView.this.mBogInputLayout, this);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.TextTypeView$b */
    class C35762b implements Runnable {
        C35762b() {
        }

        public void run() {
            TextTypeView.this.getBogInputLayout().setUnderLineColor(0);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.TextTypeView$c */
    class C35763c extends C5817c {
        C35763c() {
        }

        /* renamed from: c */
        public void mo7276b(Drawable drawable, C6032d dVar) {
            TextTypeView.this.mBogInputLayout.setLeftDrawable(drawable, 0);
        }

        /* renamed from: i */
        public void mo7284i(Drawable drawable) {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.TextTypeView$d */
    class C35764d implements ViewTreeObserver.OnGlobalLayoutListener {
        C35764d() {
        }

        public void onGlobalLayout() {
            TextTypeView.this.mViewSelector.getLayoutParams().width = TextTypeView.this.mBogInputLayout.getWidth() - TextTypeView.this.mBogInputLayout.getRightImage().getWidth();
            C32355x0.m95523n(TextTypeView.this.mBogInputLayout, this);
        }
    }

    public TextTypeView(Context context) {
        super(context);
        View.inflate(getContext(), C10324m.layout_text_type_view, this);
        setupViews();
    }

    private void setupViews() {
        this.mBogInputLayout = (BogInputLayout) findViewById(C10322k.bog_input_view);
        this.mHoleView = findViewById(C10322k.hole_item);
        this.mViewSelector = findViewById(C10322k.view_selector);
        this.iconImage = (ImageView) findViewById(C10322k.extra_icon);
        this.mViewSelector.setTag(this);
    }

    public void clearIcon() {
        this.mBogInputLayout.setRightDrawable((Drawable) null, false);
        setSelectorSize();
    }

    public void clearInputDrawableEnd() {
        setInputDrawableEnd(-1);
    }

    public void disable(boolean z) {
        if (z) {
            setVisibility(8);
        } else {
            setClickEnabled(false);
            this.mBogInputLayout.setValueTextColor(C0767a.m2893c(getContext(), C10318g.disabled_color));
        }
        setEditable(false);
    }

    public void enable() {
        enable(true);
    }

    public void fetchLeftImageWithGlide(String str) {
        this.mBogInputLayout.setVisibility(0);
        C2379b.m9211u(this.mBogInputLayout.leftImage).mo7741l().mo7722Q0(Uri.parse(C32289b0.m95091c(str))).mo7716I0(new C35763c());
    }

    public BogInputLayout getBogInputLayout() {
        return this.mBogInputLayout;
    }

    public ImageView getIconImageView() {
        return this.iconImage;
    }

    public String getInputType() {
        return this.mInputType;
    }

    public int getPosition() {
        return this.mPosition;
    }

    public ImageView getRightImage() {
        return this.mBogInputLayout.getRightImage();
    }

    public String getValueText() {
        return this.mBogInputLayout.getValue();
    }

    public View getViewSelector() {
        return this.mViewSelector;
    }

    public void hideLayout() {
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
        setVisibility(4);
    }

    public boolean isEditable() {
        return this.mEditable;
    }

    public void loadRightPhotoFromFile(File file, int i, int i2) {
        this.mBogInputLayout.setFilledRightImage();
        this.mBogInputLayout.getRightImage().setVisibility(0);
        C32289b0.m95104p(this.mBogInputLayout.getRightImage(), (String) null, (Uri) null, file, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i2), true);
        this.mBogInputLayout.getRightImage().setColorFilter(C32335t0.m95357b());
    }

    public void loadRightPhotoFromURL(String str, int i, int i2) {
        this.mBogInputLayout.setFilledRightImage();
        this.mBogInputLayout.getRightImage().setVisibility(0);
        C32289b0.m95107s(this.mBogInputLayout.getRightImage(), str, Integer.valueOf(i), Integer.valueOf(i2), true, false);
        this.mBogInputLayout.getRightImage().setColorFilter(C32335t0.m95357b());
    }

    public void removeLeftDrawable() {
        this.mBogInputLayout.setLeftDrawable((Drawable) null, -1);
    }

    public void setClickEnabled(boolean z) {
        this.mClickEnabled = z;
        if (z) {
            this.mViewSelector.setVisibility(0);
        } else {
            this.mViewSelector.setVisibility(4);
        }
    }

    public void setDefaultUnderLineColor() {
        this.mBogInputLayout.setUnderLineColor(C0767a.m2893c(getContext(), C10318g.f28629P0));
    }

    public void setEditable(boolean z) {
        this.mEditable = z;
    }

    public void setIconByUrl(String str) {
        this.mBogInputLayout.loadRightPhotoFromURL(str);
    }

    public void setIconClickListener(View.OnClickListener onClickListener) {
        setSelectorSize();
        this.mBogInputLayout.getRightImage().setOnClickListener(onClickListener);
    }

    public void setIconFile(File file) {
        setSelectorSize();
        ImageView imageView = this.mBogInputLayout.rightImage;
        int i = C10320i.f28688dc;
        C32289b0.m95099k(imageView, file, Integer.valueOf(i), Integer.valueOf(i), true);
    }

    public void setIconImageResource(int i) {
        this.iconImage.setImageResource(i);
    }

    public void setIconImageVisibility(boolean z) {
        this.iconImage.setVisibility(z ? 0 : 8);
    }

    public void setIconResource(int i, View.OnClickListener onClickListener) {
        setSelectorSize();
        this.mBogInputLayout.setRightDrawable(i, onClickListener);
    }

    public void setInputDrawableEnd(int i) {
        Drawable drawable;
        if (i != -1) {
            drawable = C0767a.m2895e(getContext(), i);
        } else {
            drawable = null;
        }
        this.mBogInputLayout.getEditText().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }

    public void setInputType(String str) {
        this.mInputType = str;
    }

    public void setLayoutColor(int i) {
        this.mBogInputLayout.setHintColor(i);
        this.mBogInputLayout.setUnderLineColor(i);
    }

    public void setLeftDrawable(int i) {
        this.mBogInputLayout.setLeftDrawable(i);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mViewSelector.setOnClickListener(onClickListener);
    }

    public void setPosition(int i) {
        this.mPosition = i;
    }

    public void setSelectorSize() {
        if (this.mClickEnabled) {
            this.mBogInputLayout.getViewTreeObserver().addOnGlobalLayoutListener(new C35764d());
        }
    }

    public void setSeparator(int i) {
        if (i == 402) {
            post(new C35762b());
        }
    }

    public void setTitleColor(int i) {
        this.mBogInputLayout.setHintColor(i);
    }

    public void setTitleText(String str) {
        this.mBogInputLayout.setHintText(str);
    }

    public void setUnderLineColor(int i) {
        this.mBogInputLayout.setUnderLineColor(i);
    }

    public void setValueColor(int i) {
        this.mBogInputLayout.setValueTextColor(i);
    }

    public void setValueText(String str) {
        if (str != null) {
            this.mBogInputLayout.setValue(str);
        }
    }

    public void setValueTextIgnoringEmpty(String str) {
        this.mBogInputLayout.getEditText().setText(str);
        if (str == null || str.isEmpty()) {
            BogInputLayout bogInputLayout = this.mBogInputLayout;
            if (bogInputLayout.hintCollapsed) {
                bogInputLayout.expandHint();
                return;
            }
        }
        if (str != null && !str.isEmpty()) {
            this.mBogInputLayout.collapseHint();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            Resources resources = getResources();
            int i2 = C10319h.text_type_view_default_height;
            layoutParams.height = resources.getDimensionPixelSize(i2);
            View view = this.mViewSelector;
            if (!(view == null || view.getLayoutParams() == null)) {
                this.mViewSelector.getLayoutParams().height = getResources().getDimensionPixelSize(i2);
            }
            requestLayout();
            if (getBogInputLayout() != null) {
                getBogInputLayout().showLayout();
                return;
            }
            return;
        }
        getLayoutParams().height = 0;
        requestLayout();
        getBogInputLayout().showLayout();
    }

    public void setupAttrs(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29381n8);
        if (obtainStyledAttributes != null) {
            String string = obtainStyledAttributes.getString(C10330s.f29431s8);
            this.mTitleText = string;
            setTitleText(string);
            String string2 = obtainStyledAttributes.getString(C10330s.f29441t8);
            this.mValueText = string2;
            setValueText(string2);
            int i = obtainStyledAttributes.getInt(C10330s.f29421r8, -1);
            this.mSeparator = i;
            setSeparator(i);
            this.mBogInputLayout.setEditable(obtainStyledAttributes.getBoolean(C10330s.f29391o8, false));
            int color = obtainStyledAttributes.getColor(C10330s.f29451u8, C0767a.m2893c(getContext(), C10318g.bog_default_text_color));
            this.mLayoutColor = color;
            setLayoutColor(color);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C10330s.f29411q8, -1);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(C10330s.f29401p8, -1);
            if (!(dimensionPixelSize2 == -1 || dimensionPixelSize == -1)) {
                this.mBogInputLayout.getLeftImage().getLayoutParams().height = dimensionPixelSize2;
                this.mBogInputLayout.getLeftImage().getLayoutParams().width = dimensionPixelSize;
            }
            this.mBogInputLayout.getViewTreeObserver().addOnGlobalLayoutListener(new C35761a());
            obtainStyledAttributes.recycle();
        }
        setClickEnabled(true);
    }

    public void showLayout() {
        ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = C32355x0.m95516g(C10319h.item_default_margin);
        setVisibility(0);
    }

    public void enable(boolean z) {
        if (z) {
            setVisibility(0);
        }
        setClickEnabled(true);
        this.mBogInputLayout.setValueTextColor(C0767a.m2893c(getContext(), C10318g.f28630R0));
        setEditable(true);
    }

    public void setTitleText(Spannable spannable) {
        this.mBogInputLayout.setHintText(spannable);
    }

    public void setIconResource(String str, View.OnClickListener onClickListener) {
        setSelectorSize();
        this.mBogInputLayout.loadRightPhotoFromURL(str, onClickListener);
    }

    public TextTypeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), C10324m.layout_text_type_view, this);
        if (!isInEditMode()) {
            setupViews();
            if (attributeSet != null) {
                setupAttrs(attributeSet);
            }
        }
    }
}
