package p642vh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import com.bumptech.glide.C2396k;
import com.bumptech.glide.load.engine.GlideException;
import com.salesforce.marketingcloud.UrlHandler;
import he1.C41224m;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p035c4.C2255g;
import p045d.C5769a;
import p050d4.C5817c;
import p050d4.C5825i;
import p050d4.C5826j;
import p063e4.C6032d;
import p166m3.C7079a;
import p244s3.C8175h;
import p244s3.C8176i;
import p341ge.bog.designsystem.components.common.Image;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: vh.l */
public abstract class C18368l {

    /* renamed from: vh.l$a */
    public static final class C18369a extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ LottieAnimationView f51823d;

        /* renamed from: e */
        final /* synthetic */ Image.Animation.AnimationConfig f51824e;

        C18369a(LottieAnimationView lottieAnimationView, Image.Animation.AnimationConfig animationConfig) {
            this.f51823d = lottieAnimationView;
            this.f51824e = animationConfig;
        }

        public void onAnimationEnd(Animator animator) {
            int i;
            C41536l.m120489i(animator, "animation");
            LottieAnimationView lottieAnimationView = this.f51823d;
            Image.Animation.AnimationConfig animationConfig = this.f51824e;
            Integer a = animationConfig.mo35315a();
            if (a != null) {
                i = a.intValue();
            } else {
                i = 0;
            }
            lottieAnimationView.setMinFrame(i);
            lottieAnimationView.setRepeatCount(animationConfig.mo35316b());
            lottieAnimationView.mo7438w();
            lottieAnimationView.mo7440y(this);
        }
    }

    /* renamed from: vh.l$b */
    public static final class C18370b implements C2255g {

        /* renamed from: d */
        final /* synthetic */ C43064a f51825d;

        C18370b(C43064a aVar) {
            this.f51825d = aVar;
        }

        /* renamed from: a */
        public boolean onResourceReady(Drawable drawable, Object obj, C5825i iVar, C7079a aVar, boolean z) {
            return false;
        }

        public boolean onLoadFailed(GlideException glideException, Object obj, C5825i iVar, boolean z) {
            return ((Boolean) this.f51825d.invoke()).booleanValue();
        }
    }

    /* renamed from: vh.l$c */
    static final class C18371c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C18371c f51826d = new C18371c();

        C18371c() {
            super(1);
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$null");
            return jVar;
        }
    }

    /* renamed from: vh.l$d */
    public static final class C18372d extends C5817c {

        /* renamed from: g */
        final /* synthetic */ View f51827g;

        C18372d(View view) {
            this.f51827g = view;
        }

        /* renamed from: c */
        public void mo7276b(Drawable drawable, C6032d dVar) {
            C41536l.m120489i(drawable, "resource");
            this.f51827g.setBackground(drawable);
        }

        /* renamed from: i */
        public void mo7284i(Drawable drawable) {
            this.f51827g.setBackground((Drawable) null);
        }
    }

    /* renamed from: vh.l$e */
    static final class C18373e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C18373e f51828d = new C18373e();

        C18373e() {
            super(1);
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$null");
            return jVar;
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m62746A(ImageView imageView, Image image, C43075l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = C18373e.f51828d;
        }
        m62777z(imageView, image, lVar);
    }

    /* renamed from: B */
    public static final void m62747B(EditText editText, CharSequence charSequence) {
        boolean z;
        C41536l.m120489i(editText, "<this>");
        editText.setText(charSequence);
        Editable text = editText.getText();
        C41536l.m120488h(text, "this.text");
        if (text.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            editText.setSelection(editText.getText().length());
        }
    }

    /* renamed from: C */
    public static final void m62748C(View view) {
        C41536l.m120489i(view, "<this>");
        m62751F(view, true, false, 2, (Object) null);
    }

    /* renamed from: D */
    public static final void m62749D(EditText editText) {
        C41536l.m120489i(editText, "<this>");
        InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
    }

    /* renamed from: E */
    public static final void m62750E(View view, boolean z, boolean z2) {
        int i;
        C41536l.m120489i(view, "<this>");
        if (z) {
            i = 0;
        } else if (z2) {
            i = 4;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: F */
    public static /* synthetic */ void m62751F(View view, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        m62750E(view, z, z2);
    }

    /* renamed from: c */
    private static final void m62754c(LottieAnimationView lottieAnimationView, Image.Animation.AnimationConfig animationConfig) {
        int i;
        lottieAnimationView.setSpeed(animationConfig.mo35319e());
        Integer d = animationConfig.mo35317d();
        if (d != null) {
            i = d.intValue();
        } else {
            i = Integer.MAX_VALUE;
        }
        lottieAnimationView.setMaxFrame(i);
        lottieAnimationView.mo7391i(new C18369a(lottieAnimationView, animationConfig));
    }

    /* renamed from: d */
    public static final int m62755d(Context context, int i) {
        C41536l.m120489i(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    /* renamed from: e */
    public static final Integer m62756e(TypedArray typedArray, int i, int i2) {
        C41536l.m120489i(typedArray, "<this>");
        if (typedArray.hasValue(i)) {
            return Integer.valueOf(typedArray.getColor(i, i2));
        }
        return null;
    }

    /* renamed from: f */
    public static /* synthetic */ Integer m62757f(TypedArray typedArray, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m62756e(typedArray, i, i2);
    }

    /* renamed from: g */
    public static final int m62758g(Context context, int i) {
        C41536l.m120489i(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: h */
    public static final Locale m62759h(View view) {
        C41536l.m120489i(view, "<this>");
        if (Build.VERSION.SDK_INT >= 24) {
            Locale a = view.getContext().getResources().getConfiguration().getLocales().get(0);
            C41536l.m120488h(a, "{\n        context.resour…guration.locales[0]\n    }");
            return a;
        }
        Locale locale = view.getContext().getResources().getConfiguration().locale;
        C41536l.m120488h(locale, "{\n        context.resour…onfiguration.locale\n    }");
        return locale;
    }

    /* renamed from: i */
    public static final int m62760i(Activity activity) {
        C41536l.m120489i(activity, "<this>");
        return ((Number) m62761j(activity).mo95680f()).intValue();
    }

    /* renamed from: j */
    public static final C41224m m62761j(Activity activity) {
        C41536l.m120489i(activity, "<this>");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return new C41224m(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
    }

    /* renamed from: k */
    public static final int m62762k(int i) {
        return (int) (((float) i) * Resources.getSystem().getDisplayMetrics().density);
    }

    /* renamed from: l */
    public static final Drawable m62763l(Context context, int i) {
        C41536l.m120489i(context, "<this>");
        try {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(i, typedValue, true);
            return C0767a.m2895e(context, typedValue.resourceId);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static final int m62764m(int i) {
        return (int) (((float) i) / Resources.getSystem().getDisplayMetrics().density);
    }

    /* renamed from: n */
    public static final void m62765n(View view, boolean z) {
        C41536l.m120489i(view, "<this>");
        m62750E(view, false, z);
    }

    /* renamed from: o */
    public static /* synthetic */ void m62766o(View view, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        m62765n(view, z);
    }

    /* renamed from: p */
    public static final void m62767p(EditText editText) {
        C41536l.m120489i(editText, "<this>");
        InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    /* renamed from: q */
    private static final C5826j m62768q(ImageView imageView, Drawable drawable, C43075l lVar) {
        C2394j t = C2379b.m9210t(imageView.getContext()).mo7751t(drawable);
        C41536l.m120488h(t, "with(context)\n    .load(drawable)");
        C5826j L0 = ((C2394j) lVar.invoke(t)).mo7718L0(imageView);
        C41536l.m120488h(L0, "with(context)\n    .load(…RequestBuild().into(this)");
        return L0;
    }

    /* renamed from: r */
    private static final C5826j m62769r(ImageView imageView, Image.Url url, C43075l lVar) {
        boolean z;
        Object obj;
        Object obj2;
        Drawable drawable;
        Object obj3;
        Drawable f;
        Drawable j;
        C2396k t = C2379b.m9210t(imageView.getContext());
        if (url.mo35411k().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            obj = new C8175h(url.mo35411k(), (C8176i) new C18364j(url));
        } else {
            obj = url.mo35411k();
        }
        C2394j x = t.mo7756x(obj);
        C41536l.m120488h(x, "with(context)\n    .load(…   } else image.url\n    )");
        C2394j jVar = (C2394j) lVar.invoke(x);
        Image.Placeholder i = url.mo35409i();
        Drawable drawable2 = null;
        if (i != null) {
            Context context = imageView.getContext();
            C41536l.m120488h(context, "context");
            obj2 = C18380s.m62796a(i, context);
        } else {
            obj2 = null;
        }
        if (obj2 instanceof Drawable) {
            drawable = (Drawable) obj2;
        } else {
            drawable = null;
        }
        if ((drawable == null || ((C2394j) jVar.mo7223d0(drawable)) == null) && (j = url.mo35410j()) != null) {
            C2394j jVar2 = (C2394j) jVar.mo7223d0(j);
        }
        Image.Placeholder e = url.mo35403e();
        if (e != null) {
            Context context2 = imageView.getContext();
            C41536l.m120488h(context2, "context");
            obj3 = C18380s.m62796a(e, context2);
        } else {
            obj3 = null;
        }
        if (obj3 instanceof Drawable) {
            drawable2 = (Drawable) obj3;
        }
        if ((drawable2 == null || ((C2394j) jVar.mo7233k(drawable2)) == null) && (f = url.mo35405f()) != null) {
            C2394j jVar3 = (C2394j) jVar.mo7233k(f);
        }
        C5826j L0 = jVar.mo7718L0(imageView);
        C41536l.m120488h(L0, "with(context)\n    .load(…::error)\n    }.into(this)");
        return L0;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final Map m62770s(Image.Url url) {
        C41536l.m120489i(url, "$image");
        return url.mo35407h();
    }

    /* renamed from: t */
    public static final C2394j m62771t(C2394j jVar, C43064a aVar) {
        C41536l.m120489i(jVar, "<this>");
        C41536l.m120489i(aVar, UrlHandler.ACTION);
        C2394j N0 = jVar.mo7719N0(new C18370b(aVar));
        C41536l.m120488h(N0, "action: () -> Boolean\n) …    ): Boolean = false\n})");
        return N0;
    }

    /* renamed from: u */
    public static final void m62772u(ImageView imageView, Image.Animation animation) {
        C41536l.m120489i(imageView, "<this>");
        C41536l.m120489i(animation, "animation");
        if (!(imageView instanceof LottieAnimationView)) {
            imageView.setImageDrawable((Drawable) null);
            return;
        }
        if (animation instanceof Image.Animation.Asset) {
            ((LottieAnimationView) imageView).setAnimation(((Image.Animation.Asset) animation).mo35328d());
        } else if (animation instanceof Image.Animation.Raw) {
            ((LottieAnimationView) imageView).setAnimation(((Image.Animation.Raw) animation).mo35349d());
        } else if (animation instanceof Image.Animation.Json) {
            Image.Animation.Json json = (Image.Animation.Json) animation;
            ((LottieAnimationView) imageView).mo7375A(json.mo35340e(), json.mo35338d());
        } else if (animation instanceof Image.Animation.Url) {
            Image.Animation.Url url = (Image.Animation.Url) animation;
            ((LottieAnimationView) imageView).mo7376B(url.mo35361e(), url.mo35359d());
        }
        if (animation.mo35314b().mo35315a() != null) {
            m62754c((LottieAnimationView) imageView, animation.mo35314b());
        } else {
            ((LottieAnimationView) imageView).setRepeatCount(animation.mo35314b().mo35316b());
        }
        ((LottieAnimationView) imageView).mo7438w();
    }

    /* renamed from: v */
    public static final void m62773v(View view, Image image, C43075l lVar) {
        C41536l.m120489i(view, "<this>");
        C41536l.m120489i(lVar, "onGlideRequestBuild");
        if (image == null) {
            view.setBackground((Drawable) null);
        } else if (image instanceof Image.Resource) {
            view.setBackground(C0767a.m2895e(view.getContext(), ((Image.Resource) image).mo35391d()));
        } else if (image instanceof Image.Attribute) {
            Context context = view.getContext();
            C41536l.m120488h(context, "context");
            view.setBackground(m62763l(context, ((Image.Attribute) image).mo35371d()));
        } else if (image instanceof Image.Drawable) {
            view.setBackground(((Image.Drawable) image).mo35381d());
        } else if (image instanceof Image.Url) {
            C2394j x = C2379b.m9210t(view.getContext()).mo7756x(new C8175h(((Image.Url) image).mo35411k(), (C8176i) new C18366k(image)));
            C41536l.m120488h(x, "with(context)\n          …  }\n                    )");
            C41536l.m120488h(((C2394j) lVar.invoke(x)).mo7716I0(new C18372d(view)), "View.setBackgroundImage(…         })\n            }");
        } else if (image instanceof Image.Animation) {
            view.setBackground((Drawable) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: w */
    public static /* synthetic */ void m62774w(View view, Image image, C43075l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = C18371c.f51826d;
        }
        m62773v(view, image, lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final Map m62775x(Image image) {
        return ((Image.Url) image).mo35407h();
    }

    /* renamed from: y */
    public static final void m62776y(EditText editText, boolean z) {
        C41536l.m120489i(editText, "<this>");
        if (editText.isFocused() && !z) {
            m62767p(editText);
        }
        editText.setFocusableInTouchMode(z);
        editText.setFocusable(z);
        editText.setLongClickable(z);
        editText.setClickable(z);
    }

    /* renamed from: z */
    public static final void m62777z(ImageView imageView, Image image, C43075l lVar) {
        C41536l.m120489i(imageView, "<this>");
        C41536l.m120489i(lVar, "onGlideRequestBuild");
        if (image instanceof Image.Attribute) {
            Context context = imageView.getContext();
            C41536l.m120488h(context, "context");
            m62768q(imageView, m62763l(context, ((Image.Attribute) image).mo35371d()), lVar);
        } else if (image instanceof Image.Drawable) {
            m62768q(imageView, ((Image.Drawable) image).mo35381d(), lVar);
        } else if (image instanceof Image.Resource) {
            m62768q(imageView, C5769a.m23210b(imageView.getContext(), ((Image.Resource) image).mo35391d()), lVar);
        } else if (image instanceof Image.Url) {
            m62769r(imageView, (Image.Url) image, lVar);
        } else if (image instanceof Image.Animation) {
            m62772u(imageView, (Image.Animation) image);
        } else if (image == null) {
            imageView.setImageDrawable((Drawable) null);
        }
    }
}
