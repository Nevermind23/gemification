package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import com.bumptech.glide.load.engine.GlideException;
import com.github.mikephil.charting.utils.Utils;
import g91.C32289b0;
import g91.C32290b1;
import g91.C32335t0;
import g91.C32355x0;
import g91.C32359z0;
import l81.C37105b;
import m81.C37247b;
import p035c4.C2255g;
import p050d4.C5825i;
import p166m3.C7079a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.TooltipLayout;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10323l;
import p366bk.C10324m;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.BogInputLayout */
public class BogInputLayout extends LinearLayout implements View.OnFocusChangeListener {
    public static final int HINT_ERROR_STATE = 101;
    public static final int HINT_INVISIBLE_STATE = 102;
    public static final int HINT_NORMAL_STATE = 100;
    public static final int INPUT_ERROR_STATE = 201;
    public static final int INPUT_NORMAL_STATE = 200;
    public static final int INPUT_TYPE_EMAIL = 307;
    public static final int INPUT_TYPE_NUMBER_SIGNED = 306;
    public static final int INPUT_TYPE_NUM_DIGIT = 303;
    public static final int INPUT_TYPE_NUM_PASSWORD = 301;
    public static final int INPUT_TYPE_NUM_PHONE = 305;
    public static final int INPUT_TYPE_NUM_REAL = 302;
    public static final int INPUT_TYPE_TEXT_NO_SUGGESTIONS = 304;
    public static final int INPUT_TYPE_TEXT_PASSWORD = 300;
    public static int layoutHeight = -1;
    private boolean animateTextSize;
    private boolean backgroundLightColor;
    private boolean changeColorOnFocus;
    ViewPropertyAnimator collapseAnimator;
    /* access modifiers changed from: private */
    public float collapsedTextHeigt;
    private String editTextFocusedHintText;
    private String editTextUnfocusedHintText;
    private InputFocusListener focusChangeListener;
    /* access modifiers changed from: private */
    public View focusMeView;
    private boolean focusMeViewIgnored;
    private boolean hasFocus;
    private HideLayoutListener hideLayoutListener;
    boolean hintCollapsed;
    private boolean ignoreAnimatedCollapse;
    /* access modifiers changed from: private */
    public boolean initiallyFocused;
    private FrameLayout inputContainer;
    /* access modifiers changed from: private */
    public BogEditText inputET;
    private BogTextView inputNote;
    private int lastInputType;
    /* access modifiers changed from: private */
    public BogTextView layoutBigHintTV;
    private int layoutColor;
    protected ImageView leftImage;
    private int leftImageViewMargin;
    /* access modifiers changed from: private */
    public int originalInputType;
    private boolean preserveText;
    private float requiredWeight;
    protected ImageView rightImage;
    private TooltipLayout rightImageTooltipLayout;
    /* access modifiers changed from: private */
    public ShowLayoutListener showLayoutListener;
    private C37105b threeStepInputFocusListener;
    private BogTextView underHintTV;
    private String underHintText;
    private boolean underHintVisible;
    private View underLine;
    private BogEditText unmaskedET;
    private boolean visible;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.BogInputLayout$HideLayoutListener */
    public interface HideLayoutListener {
        void onLayoutHide();
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.BogInputLayout$InputFocusListener */
    public interface InputFocusListener {
        void onFocusChanged(BogInputLayout bogInputLayout, boolean z);
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.BogInputLayout$ShowLayoutListener */
    public interface ShowLayoutListener {
        void onLayoutShow();
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.BogInputLayout$a */
    class C35716a implements Runnable {
        C35716a() {
        }

        public void run() {
            BogInputLayout.this.leftImage.setVisibility(8);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.BogInputLayout$b */
    class C35717b implements InputFilter {
        C35717b() {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            while (i < i2) {
                if (!Character.isDigit(charSequence.charAt(i))) {
                    return "";
                }
                i++;
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.BogInputLayout$c */
    class C35718c implements View.OnClickListener {
        C35718c() {
        }

        public void onClick(View view) {
            if (!view.isSelected()) {
                BogInputLayout bogInputLayout = BogInputLayout.this;
                bogInputLayout.setInputType(bogInputLayout.originalInputType);
                view.setSelected(true);
            } else {
                if (BogInputLayout.this.originalInputType == 301) {
                    BogInputLayout.this.setInputType(BogInputLayout.INPUT_TYPE_NUM_DIGIT);
                } else if (BogInputLayout.this.originalInputType == 300) {
                    BogInputLayout.this.setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS);
                }
                view.setSelected(false);
            }
            BogInputLayout.this.inputET.setSelection(BogInputLayout.this.getText().length());
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.BogInputLayout$d */
    class C35719d implements View.OnClickListener {
        C35719d() {
        }

        public void onClick(View view) {
            C32290b1.m95115e(BogInputLayout.this.inputET);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.BogInputLayout$e */
    class C35720e implements ViewTreeObserver.OnGlobalLayoutListener {
        C35720e() {
        }

        public void onGlobalLayout() {
            BogInputLayout.this.focusMeView.getLayoutParams().height = BogInputLayout.this.inputET.getHeight();
            BogInputLayout.this.focusMeView.requestLayout();
            C32355x0.m95523n(BogInputLayout.this.inputET, this);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.BogInputLayout$f */
    class C35721f implements TextWatcher {
        C35721f() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.toString().length() > 0) {
                BogInputLayout bogInputLayout = BogInputLayout.this;
                if (!bogInputLayout.hintCollapsed) {
                    bogInputLayout.collapseHint();
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.BogInputLayout$g */
    class C35722g implements Animation.AnimationListener {
        C35722g() {
        }

        public void onAnimationEnd(Animation animation) {
            if (BogInputLayout.this.showLayoutListener != null) {
                BogInputLayout.this.showLayoutListener.onLayoutShow();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            if (!BogInputLayout.this.initiallyFocused) {
                BogInputLayout.this.collapseWithoutAnimation();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.BogInputLayout$h */
    class C35723h implements Runnable {
        C35723h() {
        }

        public void run() {
            C32290b1.m95126p(BogInputLayout.this.layoutBigHintTV, C32355x0.m95521l(BogInputLayout.this.getContext()));
            BogInputLayout.this.layoutBigHintTV.setY(Utils.FLOAT_EPSILON);
            BogInputLayout.this.layoutBigHintTV.setPivotX(Utils.FLOAT_EPSILON);
            BogInputLayout.this.layoutBigHintTV.setScaleX(BogInputLayout.this.collapsedTextHeigt);
            BogInputLayout.this.layoutBigHintTV.setScaleY(BogInputLayout.this.collapsedTextHeigt);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.BogInputLayout$i */
    class C35724i implements Animation.AnimationListener {
        C35724i() {
        }

        public void onAnimationEnd(Animation animation) {
            BogInputLayout.this.finishHide();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.BogInputLayout$j */
    class C35725j implements C2255g {
        C35725j() {
        }

        /* renamed from: a */
        public boolean onResourceReady(Drawable drawable, Object obj, C5825i iVar, C7079a aVar, boolean z) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.leftMargin = drawable.getIntrinsicWidth() + C32355x0.m95516g(C10319h.margin_small);
            BogInputLayout.this.getEditText().setLayoutParams(layoutParams);
            return false;
        }

        public boolean onLoadFailed(GlideException glideException, Object obj, C5825i iVar, boolean z) {
            return false;
        }
    }

    public BogInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public void finishHide() {
        if (!this.preserveText) {
            getEditText().setText("");
        }
        setVisibility(8);
        HideLayoutListener hideLayoutListener2 = this.hideLayoutListener;
        if (hideLayoutListener2 != null) {
            hideLayoutListener2.onLayoutHide();
        }
    }

    private InputFilter getDigitFilter() {
        return new C35717b();
    }

    private void inflateLayout(int i) {
        View.inflate(getContext(), i, this);
    }

    private void initPasswordVisibilityToggle() {
        Drawable drawable;
        if (this.backgroundLightColor) {
            drawable = C32359z0.m95561c0(getContext(), C10320i.password_visibility_toggle_selector, 17170432);
        } else {
            drawable = C0767a.m2895e(getContext(), C10320i.password_visibility_toggle_selector).mutate();
        }
        setDefaultRightImagePadding();
        setRightDrawable(drawable, true);
        this.rightImage.setSelected(true);
        this.rightImage.setOnClickListener(new C35718c());
    }

    private void setDefaultRightImagePadding() {
        int g = C32355x0.m95516g(C10319h.bog_input_layout_right_image_padding) * 3;
        this.rightImage.setPadding(g, 0, g, 0);
    }

    private void setLeftImageNoMarginParams() {
        this.leftImage.setVisibility(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 3;
        layoutParams.setMargins(0, 0, 0, 0);
        this.leftImage.setLayoutParams(layoutParams);
        setFilledLeftImage();
    }

    private void setUpAttrs(AttributeSet attributeSet) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29313h0);
        if (obtainStyledAttributes != null) {
            setUpInput(obtainStyledAttributes.getResourceId(C10330s.f29343k0, C10324m.layout_bog_input_normal_et));
            this.changeColorOnFocus = obtainStyledAttributes.getBoolean(C10330s.f29333j0, true);
            this.backgroundLightColor = obtainStyledAttributes.getBoolean(C10330s.f29323i0, true);
            int color = obtainStyledAttributes.getColor(C10330s.f29423s0, C32335t0.m95358c(getContext()));
            this.layoutColor = color;
            setInputLayoutColor(color);
            String string = obtainStyledAttributes.getString(C10330s.f29443u0);
            this.underHintText = string;
            this.underHintTV.setText(string);
            boolean z2 = obtainStyledAttributes.getBoolean(C10330s.f29453v0, true);
            this.underHintVisible = z2;
            if (z2) {
                showUnderHintWithColor(C10318g.bog_default_text_color);
            } else {
                setUnderHintState(102);
            }
            this.editTextUnfocusedHintText = obtainStyledAttributes.getString(C10330s.f29363m0);
            String string2 = obtainStyledAttributes.getString(C10330s.f29353l0);
            this.editTextFocusedHintText = string2;
            setHintText(string2);
            this.requiredWeight = obtainStyledAttributes.getFloat(C10330s.f29433t0, 1.0f);
            if (getVisibility() != 8) {
                z = true;
            } else {
                z = false;
            }
            this.visible = z;
            int i = obtainStyledAttributes.getInt(C10330s.f29393p0, -1);
            if (i > -1) {
                getEditText().setImeOptions(i);
            }
            this.originalInputType = obtainStyledAttributes.getInt(C10330s.f29413r0, INPUT_TYPE_TEXT_NO_SUGGESTIONS);
            showPasswordVisibilityIfPossible();
            this.focusMeViewIgnored = obtainStyledAttributes.getBoolean(C10330s.f29383o0, false);
            this.initiallyFocused = obtainStyledAttributes.getBoolean(C10330s.f29403q0, true);
            if (!obtainStyledAttributes.getBoolean(C10330s.f29373n0, true)) {
                setEditable(false);
            }
            obtainStyledAttributes.recycle();
        }
    }

    private void setUpInput(int i) {
        View.inflate(getContext(), i, this.inputContainer);
        BogEditText bogEditText = (BogEditText) findViewById(C10322k.bog_input_layout_et_maskable);
        this.inputET = bogEditText;
        bogEditText.getViewTreeObserver().addOnGlobalLayoutListener(new C35720e());
        this.inputET.setOnFocusChangeListener(this);
        this.inputET.addTextChangedListener(new C35721f());
    }

    private void setUpViews() {
        this.layoutBigHintTV = (BogTextView) findViewById(C10322k.bog_input_layout_hint_big);
        this.inputContainer = (FrameLayout) findViewById(C10322k.bog_input_layout_input_container);
        this.unmaskedET = (BogEditText) findViewById(C10322k.bog_input_layout_tv_unmasked);
        this.underHintTV = (BogTextView) findViewById(C10322k.layout_text_input_underhint);
        this.underLine = findViewById(C10322k.bog_input_layout_underline);
        this.focusMeView = findViewById(C10322k.bog_input_layout_focus_me);
        this.leftImage = (ImageView) findViewById(C10322k.bog_input_layout_et_left_drawable);
        this.rightImage = (ImageView) findViewById(C10322k.bog_input_layout_et_right_drawable);
        this.inputNote = (BogTextView) findViewById(C10322k.input_note);
        this.rightImageTooltipLayout = (TooltipLayout) findViewById(C10322k.tooltip_anchor_layout);
        this.focusMeView.setOnClickListener(new C35719d());
    }

    private void showPasswordVisibilityIfPossible() {
        int i = this.originalInputType;
        if (i > -1) {
            setInputType(i);
            int i2 = this.originalInputType;
            if (i2 == 300 || i2 == 301) {
                initPasswordVisibilityToggle();
            }
        }
    }

    private void showUnderHintWithColor(int i) {
        if (!TextUtils.isEmpty(this.underHintText)) {
            this.underHintTV.setTextColor(C0767a.m2893c(getContext(), i));
            this.underHintTV.setText(this.underHintText);
        }
    }

    public void collapseHint() {
        if (getEditText().getText().length() <= 0 || this.ignoreAnimatedCollapse) {
            collapseHint((Animator.AnimatorListener) null);
        } else {
            collapseWithoutAnimation();
        }
    }

    public void collapseWithoutAnimation() {
        this.hintCollapsed = true;
        ViewPropertyAnimator viewPropertyAnimator = this.collapseAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        post(new C35723h());
    }

    public void disableEditText() {
        this.inputET.setFocusable(false);
        this.inputET.setInputType(0);
    }

    public boolean doAnimateTextSize() {
        return this.animateTextSize;
    }

    public void expandHint() {
        this.hintCollapsed = false;
        if (this.layoutBigHintTV.getVisibility() == 4) {
            this.layoutBigHintTV.setVisibility(0);
        }
        if (getText() == null || getText().length() == 0) {
            this.layoutBigHintTV.getLayoutParams().width = -1;
            this.layoutBigHintTV.requestLayout();
            this.layoutBigHintTV.animate().scaleX(1.0f).scaleY(1.0f).y((float) ((C32355x0.m95516g(C10319h.bog_input_layout_height) - this.layoutBigHintTV.getHeight()) / 2)).setListener((Animator.AnimatorListener) null);
        }
    }

    public String getCleanText() {
        return getEditText().getText().toString().replaceAll(" ", "");
    }

    public BogEditText getEditText() {
        return this.inputET;
    }

    public String getHint() {
        return this.layoutBigHintTV.getText().toString();
    }

    public int getLastInputType() {
        return this.lastInputType;
    }

    public BogInputLayout getLayout() {
        return this;
    }

    public ImageView getLeftImage() {
        return this.leftImage;
    }

    public int getOriginalInputType() {
        return this.originalInputType;
    }

    public ImageView getRightImage() {
        return this.rightImage;
    }

    public String getText() {
        return getEditText().getText().toString();
    }

    public View getUnderLine() {
        return this.underLine;
    }

    public String getValue() {
        return this.inputET.getText().toString();
    }

    public boolean hasFocus() {
        return this.hasFocus;
    }

    public void hideLayout(boolean z) {
        if (!this.visible) {
            return;
        }
        if (z) {
            C37247b bVar = new C37247b(this, this.requiredWeight, Utils.FLOAT_EPSILON);
            bVar.setAnimationListener(new C35724i());
            startAnimation(bVar);
            return;
        }
        C32290b1.m95125o(this, Utils.FLOAT_EPSILON);
        finishHide();
    }

    public void hideUnderHint() {
        this.underHintTV.setVisibility(8);
    }

    public boolean isInitiallyFocused() {
        return this.initiallyFocused;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void loadLeftPhotoFromURL(String str, boolean z) {
        if (str != null) {
            setLeftImageNoMarginParams();
            C32289b0.m95108t(this.leftImage, str, (Integer) null, (Integer) null, z, false, new C35725j());
            return;
        }
        this.leftImage.setVisibility(8);
    }

    public void loadRightPhotoDrawable(int i) {
        if (i != -1) {
            setFilledRightImage();
            this.rightImage.setVisibility(0);
            C32289b0.m95102n(this.rightImage, Integer.valueOf(i), true);
            return;
        }
        this.rightImage.setVisibility(8);
    }

    public void loadRightPhotoFromURL(String str, View.OnClickListener onClickListener) {
        loadRightPhotoFromURL(str);
        if (onClickListener != null) {
            this.rightImage.setOnClickListener(onClickListener);
        }
    }

    public void onFocusChange(View view, boolean z) {
        InputFocusListener inputFocusListener = this.focusChangeListener;
        if (inputFocusListener != null) {
            inputFocusListener.onFocusChanged(this, z);
        }
        String str = this.editTextUnfocusedHintText;
        if (str != null) {
            if (z) {
                str = this.editTextFocusedHintText;
            }
            setHintText(str);
        }
        if (this.animateTextSize) {
            if (layoutHeight < 0 && getEditText().getHeight() > 0) {
                layoutHeight = getEditText().getHeight();
            }
            if (!z) {
                float H = C32359z0.m95537H(C10323l.bog_input_layout_small_hint_scale, getContext());
                getEditText().setPivotX(Utils.FLOAT_EPSILON);
                getEditText().setPivotY((float) (getEditText().getHeight() / 2));
                getEditText().animate().scaleX(H).scaleY(H);
                if (this.unmaskedET.getText().length() > 0) {
                    this.unmaskedET.setPivotX(Utils.FLOAT_EPSILON);
                    this.unmaskedET.setPivotY((float) (getEditText().getHeight() / 2));
                    this.unmaskedET.animate().scaleX(H).scaleY(H);
                }
            } else {
                getEditText().animate().scaleX(1.0f).scaleY(1.0f);
                if (this.unmaskedET.getText().length() > 0) {
                    this.unmaskedET.animate().scaleX(1.0f).scaleY(1.0f);
                }
            }
        }
        if (!z) {
            expandHint();
            if (this.changeColorOnFocus) {
                setInputLayoutColor(C0767a.m2893c(getContext(), C10318g.bog_default_text_color));
            }
            setPasswordVisibilityToggleEnabled(false);
            this.hasFocus = false;
            if (layoutHeight > -1) {
                this.focusMeView.getLayoutParams().height = layoutHeight;
            }
            if (!this.focusMeViewIgnored) {
                this.focusMeView.setVisibility(0);
                return;
            }
            return;
        }
        setPasswordVisibilityToggleEnabled(true);
        if (this.changeColorOnFocus) {
            setInputLayoutColor(this.layoutColor);
        }
        collapseHint();
        this.hasFocus = true;
        this.focusMeView.setVisibility(8);
    }

    public void removeUnmasked() {
        this.inputET.animate().alpha(1.0f);
        this.inputET.animate().alpha(1.0f);
        this.unmaskedET.animate().alpha(Utils.FLOAT_EPSILON).setStartDelay(50);
    }

    public void reset() {
        if (!this.preserveText) {
            getEditText().setText("");
        }
        setInputLayoutState(INPUT_NORMAL_STATE);
        int i = 100;
        setUnderHintState(100);
        if (!this.underHintVisible) {
            i = 102;
        }
        setUnderHintState(i);
        this.focusMeView.setVisibility(8);
        removeUnmasked();
    }

    public void resetValue() {
        collapseWithoutAnimation();
        this.inputET.setText("");
    }

    public void setAnimateTextSize(boolean z) {
        this.animateTextSize = z;
    }

    public void setEditTextHintFocused(String str) {
        String str2;
        this.editTextFocusedHintText = str;
        if (isFocused()) {
            str2 = this.editTextFocusedHintText;
        } else {
            str2 = this.editTextUnfocusedHintText;
        }
        setHintText(str2);
    }

    public void setEditTextUnfocusedHintText(String str) {
        String str2;
        this.editTextUnfocusedHintText = str;
        if (isFocused()) {
            str2 = this.editTextFocusedHintText;
        } else {
            str2 = this.editTextUnfocusedHintText;
        }
        setHintText(str2);
    }

    public void setEditable(boolean z) {
        this.inputET.setClickable(z);
        this.inputET.setFocusable(z);
        this.inputET.setEnabled(z);
        this.inputET.setFocusableInTouchMode(z);
        Context context = getContext();
        int i = C10318g.bog_default_text_color;
        setHintColor(C0767a.m2893c(context, i));
        this.underLine.setBackgroundColor(C0767a.m2893c(getContext(), i));
    }

    public void setFilledLeftImage() {
        getLeftImage().setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    public void setFilledRightImage() {
        getRightImage().setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    public void setFilter(InputFilter inputFilter) {
        this.inputET.setFilters(new InputFilter[]{inputFilter});
    }

    public void setHideLayoutListener(HideLayoutListener hideLayoutListener2) {
        this.hideLayoutListener = hideLayoutListener2;
    }

    public void setHintColor(int i) {
        this.layoutBigHintTV.setTextColor(i);
    }

    public void setHintText(String str) {
        this.layoutBigHintTV.setText(str);
    }

    public void setIgnoreAnimatedCollapse(boolean z) {
        this.ignoreAnimatedCollapse = z;
    }

    public void setInitiallyFocused(boolean z) {
        this.initiallyFocused = z;
    }

    public void setInputFocusListener(InputFocusListener inputFocusListener) {
        this.focusChangeListener = inputFocusListener;
    }

    public void setInputLayoutColor(int i) {
        setHintColor(i);
        this.underLine.setBackgroundColor(i);
    }

    public void setInputLayoutState(int i) {
        if (i == 200) {
            setInputLayoutColor(this.layoutColor);
        } else if (i == 201) {
            this.underLine.setBackgroundColor(C0767a.m2893c(getContext(), C10318g.bog_error_red));
            setUnderHintState(101);
        }
    }

    public void setInputType(int i) {
        this.lastInputType = i;
        switch (i) {
            case INPUT_TYPE_TEXT_PASSWORD /*300*/:
                getEditText().setInputType(129);
                getEditText().setTransformationMethod(PasswordTransformationMethod.getInstance());
                return;
            case INPUT_TYPE_NUM_PASSWORD /*301*/:
                getEditText().setInputType(18);
                getEditText().setTransformationMethod(PasswordTransformationMethod.getInstance());
                getEditText().setFilters(new InputFilter[]{getDigitFilter()});
                getEditText().resetFont();
                return;
            case INPUT_TYPE_NUM_REAL /*302*/:
                getEditText().setInputType(8194);
                getEditText().resetFont();
                return;
            case INPUT_TYPE_NUM_DIGIT /*303*/:
                getEditText().setInputType(2);
                getEditText().resetFont();
                return;
            case INPUT_TYPE_TEXT_NO_SUGGESTIONS /*304*/:
                getEditText().setInputType(524289);
                getEditText().resetFont();
                return;
            case INPUT_TYPE_NUM_PHONE /*305*/:
                getEditText().setInputType(3);
                getEditText().resetFont();
                return;
            case INPUT_TYPE_NUMBER_SIGNED /*306*/:
                getEditText().setInputType(4098);
                getEditText().resetFont();
                return;
            case INPUT_TYPE_EMAIL /*307*/:
                getEditText().setInputType(33);
                getEditText().resetFont();
                return;
            default:
                return;
        }
    }

    public void setLeftDrawable(int i) {
        setLeftDrawable(C0767a.m2895e(getContext(), i), i);
    }

    public void setLeftImageViewMargin(int i) {
        this.leftImageViewMargin = getContext().getResources().getDimensionPixelSize(i);
        ((FrameLayout.LayoutParams) this.leftImage.getLayoutParams()).setMargins(0, 0, this.leftImageViewMargin, 0);
    }

    public void setLeftImageWithNoMargin(int i) {
        setLeftImageNoMarginParams();
        Drawable e = C0767a.m2895e(getContext(), i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = e.getIntrinsicWidth() + C32355x0.m95516g(C10319h.margin_small);
        getEditText().setLayoutParams(layoutParams);
        this.leftImage.setImageDrawable(e);
    }

    public void setMaxLines(int i) {
        this.inputET.setMaxLines(i);
    }

    public void setNoteText(String str) {
        this.inputNote.setText(str);
    }

    public void setNoteVisibility(boolean z) {
        this.inputNote.setVisibility(z ? 0 : 8);
    }

    public void setOriginalInputType(int i) {
        this.originalInputType = i;
        showPasswordVisibilityIfPossible();
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        int i = this.originalInputType;
        if (i != 301 && i != 300) {
            return;
        }
        if (z) {
            this.rightImage.setVisibility(0);
        } else {
            this.rightImage.setVisibility(8);
        }
    }

    public void setPreserveText(boolean z) {
        this.preserveText = z;
    }

    public void setRightDrawable(int i) {
        setRightDrawable(i, (View.OnClickListener) null);
    }

    public void setShowLayoutListener(ShowLayoutListener showLayoutListener2) {
        this.showLayoutListener = showLayoutListener2;
    }

    public void setThreeStepInputFocusListener(C37105b bVar) {
    }

    public void setUnderHintState(int i) {
        switch (i) {
            case 100:
                showUnderHintWithColor(C10318g.bog_default_text_color);
                return;
            case 101:
                showUnderHintWithColor(C10318g.bog_error_red);
                return;
            case 102:
                this.underHintTV.setText("");
                return;
            default:
                return;
        }
    }

    public void setUnderHintText(String str) {
        this.underHintText = str;
        setUnderHintState(100);
    }

    public void setUnderLineColor(int i) {
        this.underLine.setBackgroundColor(i);
    }

    public void setUnmaskedString(String str) {
        this.unmaskedET.setX((float) (this.leftImage.getWidth() + this.leftImageViewMargin));
        this.inputET.animate().alpha(Utils.FLOAT_EPSILON);
        this.unmaskedET.setVisibility(0);
        this.unmaskedET.setText(str);
        this.unmaskedET.animate().alpha(1.0f);
    }

    public void setValue(String str) {
        if (str != null && str.length() > 0) {
            collapseWithoutAnimation();
            this.inputET.setText(str);
            this.inputET.setSelection(str.length());
        }
    }

    public void setValueTextColor(int i) {
        this.inputET.setTextColor(i);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.visible = z;
    }

    public void showLayout(boolean z) {
        if (!this.visible) {
            setVisibility(0);
            if (!this.initiallyFocused) {
                collapseWithoutAnimation();
            }
            if (z) {
                C37247b bVar = new C37247b(this, Utils.FLOAT_EPSILON, this.requiredWeight);
                bVar.setAnimationListener(new C35722g());
                startAnimation(bVar);
                return;
            }
            C32290b1.m95125o(this, this.requiredWeight);
        }
    }

    public void showRightImageTooltip(String str, long j) {
        this.rightImageTooltipLayout.mo53695g(str, j);
    }

    public BogInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.collapsedTextHeigt = 0.7f;
        inflateLayout(C10324m.layout_text_input_dialog);
        if (!isInEditMode()) {
            this.leftImageViewMargin = context.getResources().getDimensionPixelSize(C10319h.bog_input_layout_image_margin);
            setUpViews();
            if (attributeSet != null) {
                setUpAttrs(attributeSet);
            }
        }
    }

    public void setHintText(Spannable spannable) {
        this.layoutBigHintTV.setText(spannable);
    }

    public void setLeftDrawable(Drawable drawable, int i) {
        if (drawable != null) {
            if (this.leftImage.getTag() == null || ((Integer) this.leftImage.getTag()).intValue() != i) {
                this.leftImage.setTag(Integer.valueOf(i));
                this.leftImage.setImageDrawable(drawable);
                this.leftImage.setVisibility(0);
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (this.leftImage.getLayoutParams().width > 0 && this.leftImage.getLayoutParams().height > 0) {
                    intrinsicHeight = this.leftImage.getLayoutParams().height;
                    intrinsicWidth = this.leftImage.getLayoutParams().width;
                }
                this.leftImage.setScaleX(Utils.FLOAT_EPSILON);
                this.leftImage.setScaleY(Utils.FLOAT_EPSILON);
                this.leftImage.setPivotX(Utils.FLOAT_EPSILON);
                this.leftImage.setPivotY((float) (intrinsicHeight / 2));
                this.leftImage.animate().scaleY(1.0f).scaleX(1.0f).setListener((Animator.AnimatorListener) null);
                this.inputET.animate().x((float) (intrinsicWidth + this.leftImageViewMargin)).setDuration(100);
            }
        } else if (this.leftImage.getTag() != null) {
            this.leftImage.setTag((Object) null);
            this.inputET.animate().x(Utils.FLOAT_EPSILON).setDuration(200);
            this.leftImage.animate().scaleX(Utils.FLOAT_EPSILON).scaleY(Utils.FLOAT_EPSILON).withEndAction(new C35716a());
        }
    }

    public void setRightDrawable(int i, View.OnClickListener onClickListener) {
        setRightDrawable(i, onClickListener, false);
    }

    public void loadRightPhotoFromURL(String str) {
        if (str != null) {
            setFilledRightImage();
            this.rightImage.setVisibility(0);
            C32289b0.m95107s(this.rightImage, str, (Integer) null, (Integer) null, true, false);
            return;
        }
        this.rightImage.setVisibility(8);
    }

    public void setRightDrawable(int i, View.OnClickListener onClickListener, boolean z) {
        setRightDrawable(C0767a.m2895e(getContext(), i), z);
        if (onClickListener != null) {
            this.rightImage.setOnClickListener(onClickListener);
        }
    }

    public void collapseHint(Animator.AnimatorListener animatorListener) {
        if (!this.hintCollapsed) {
            this.hintCollapsed = true;
            this.layoutBigHintTV.setPivotX(Utils.FLOAT_EPSILON);
            C32290b1.m95126p(this.layoutBigHintTV, C32355x0.m95521l(getContext()) * 2);
            this.collapseAnimator = this.layoutBigHintTV.animate().scaleX(this.collapsedTextHeigt).scaleY(this.collapsedTextHeigt).y(Utils.FLOAT_EPSILON).setListener(animatorListener);
        }
    }

    public void setRightDrawable(Drawable drawable, boolean z) {
        if (z) {
            setDefaultRightImagePadding();
        }
        if (drawable != null) {
            this.rightImage.setImageDrawable(drawable);
            this.rightImage.setVisibility(0);
            return;
        }
        this.rightImage.setVisibility(8);
    }

    public void hideLayout() {
        hideLayout(true);
    }

    public void showLayout() {
        showLayout(true);
    }
}
