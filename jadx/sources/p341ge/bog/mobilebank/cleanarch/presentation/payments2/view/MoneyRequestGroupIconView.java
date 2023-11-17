package p341ge.bog.mobilebank.cleanarch.presentation.payments2.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0767a;
import com.github.mikephil.charting.utils.Utils;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import g91.C32289b0;
import g91.C32343x;
import he1.C41217g;
import he1.C41224m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.payments2.view.C22015a;
import p366bk.C10318g;
import p366bk.C10330s;
import t30.C28303a;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.view.MoneyRequestGroupIconView */
public final class MoneyRequestGroupIconView extends FrameLayout {

    /* renamed from: g */
    public static final C22008a f58556g = new C22008a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C22009b f58557d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C22010c f58558e;

    /* renamed from: f */
    private final C41217g f58559f;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.view.MoneyRequestGroupIconView$a */
    public static final class C22008a {
        private C22008a() {
        }

        public /* synthetic */ C22008a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.view.MoneyRequestGroupIconView$c */
    public enum C22010c {
        ;
        

        /* renamed from: f */
        public static final C22012b f58562f = null;

        /* renamed from: d */
        private final int f58566d;

        /* renamed from: e */
        private C22015a f58567e;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.view.MoneyRequestGroupIconView$c$a */
        static final class C22011a extends C22010c {
            C22011a(String str, int i) {
                super(str, i, 52, (DefaultConstructorMarker) null);
            }

            /* renamed from: b */
            public void mo54704b(C22009b bVar) {
                C22015a aVar;
                C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
                int b = bVar.mo54698b();
                if (b != 1) {
                    if (b == 2) {
                        aVar = C22015a.C22018c.f58574c;
                    } else if (b != 3) {
                        aVar = null;
                    } else {
                        aVar = C22015a.C22019d.f58577c;
                    }
                } else if (bVar.mo54697a()) {
                    aVar = new C22015a.C22017b(mo54705c());
                } else {
                    aVar = new C22015a.C22016a(mo54705c());
                }
                mo54707f(aVar);
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.view.MoneyRequestGroupIconView$c$b */
        public static final class C22012b {
            private C22012b() {
            }

            public /* synthetic */ C22012b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C22010c mo54708a(int i) {
                if (i == 0) {
                    return C22010c.f58563g;
                }
                return C22010c.f58564h;
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.view.MoneyRequestGroupIconView$c$c */
        static final class C22013c extends C22010c {
            C22013c(String str, int i) {
                super(str, i, 44, (DefaultConstructorMarker) null);
            }

            /* renamed from: b */
            public void mo54704b(C22009b bVar) {
                C22015a aVar;
                C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
                int b = bVar.mo54698b();
                if (b != 1) {
                    if (b == 2) {
                        aVar = C22015a.C22018c.f58574c;
                    } else if (b != 3) {
                        aVar = null;
                    } else {
                        aVar = C22015a.C22020e.f58581c;
                    }
                } else if (bVar.mo54697a()) {
                    aVar = new C22015a.C22017b(mo54705c());
                } else {
                    aVar = new C22015a.C22016a(mo54705c());
                }
                mo54707f(aVar);
            }
        }

        static {
            f58562f = new C22012b((DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public abstract void mo54704b(C22009b bVar);

        /* renamed from: c */
        public final int mo54705c() {
            return this.f58566d;
        }

        /* renamed from: e */
        public final C22015a mo54706e() {
            return this.f58567e;
        }

        /* renamed from: f */
        public final void mo54707f(C22015a aVar) {
            this.f58567e = aVar;
        }

        private C22010c(int i) {
            this.f58566d = i;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.view.MoneyRequestGroupIconView$d */
    static final class C22014d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Context f58568d;

        /* renamed from: e */
        final /* synthetic */ MoneyRequestGroupIconView f58569e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22014d(Context context, MoneyRequestGroupIconView moneyRequestGroupIconView) {
            super(0);
            this.f58568d = context;
            this.f58569e = moneyRequestGroupIconView;
        }

        /* renamed from: b */
        public final CircularProgressBar invoke() {
            CircularProgressBar circularProgressBar = new CircularProgressBar(this.f58568d, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
            MoneyRequestGroupIconView moneyRequestGroupIconView = this.f58569e;
            Context context = this.f58568d;
            circularProgressBar.setProgress(moneyRequestGroupIconView.getValue().mo54700d());
            circularProgressBar.setProgressBarColor(C0767a.m2893c(context, C10318g.f28641c1));
            circularProgressBar.setBackgroundProgressBarColor(C0767a.m2893c(context, C10318g.f28629P0));
            circularProgressBar.setRoundBorder(true);
            circularProgressBar.setProgressBarWidth(4.0f);
            circularProgressBar.setBackgroundProgressBarWidth(4.0f);
            int I = C32343x.m95394I(moneyRequestGroupIconView.f58558e.mo54705c());
            circularProgressBar.setLayoutParams(new FrameLayout.LayoutParams(I, I, 17));
            return circularProgressBar;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MoneyRequestGroupIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: b */
    private final ImageView m71262b(C28303a aVar) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        int I = C32343x.m95394I(aVar.mo67955g());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(I, I, aVar.mo67949b());
        layoutParams.setMarginEnd(C32343x.m95394I(aVar.mo67950c()));
        layoutParams.setMarginStart(C32343x.m95394I(aVar.mo67951d()));
        layoutParams.topMargin = C32343x.m95394I(aVar.mo67952e());
        appCompatImageView.setLayoutParams(layoutParams);
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        appCompatImageView.setAdjustViewBounds(true);
        if (aVar.mo67948a() != 0) {
            appCompatImageView.setBackgroundResource(aVar.mo67948a());
        }
        int I2 = C32343x.m95394I(aVar.mo67954f());
        appCompatImageView.setPadding(I2, I2, I2, I2);
        return appCompatImageView;
    }

    /* renamed from: c */
    private final void m71263c() {
        List<View> list;
        removeAllViews();
        if (this.f58557d.mo54697a()) {
            getProgressView().setProgress(this.f58557d.mo54700d());
            addView(getProgressView());
        }
        C22015a e = this.f58558e.mo54706e();
        if (e != null) {
            List<C28303a> o = C41341q.m119912o(e.mo54710a(), e.mo54711b(), e.mo54712c());
            list = new ArrayList<>(C41343r.m119925u(o, 10));
            for (C28303a b : o) {
                list.add(m71262b(b));
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = C41341q.m119907j();
        }
        for (View addView : list) {
            addView(addView);
        }
        setIcons(list);
    }

    private final void setIcons(List<? extends ImageView> list) {
        boolean z;
        for (C41224m mVar : C41358y.m119996G0(this.f58557d.mo54699c(), list)) {
            C41224m mVar2 = (C41224m) mVar.mo95675a();
            ImageView imageView = (ImageView) mVar.mo95676b();
            String str = (String) mVar2.mo95675a();
            int intValue = ((Number) mVar2.mo95676b()).intValue();
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C32289b0.m95097i(imageView, str);
            } else {
                imageView.setImageDrawable(C0767a.m2895e(getContext(), intValue));
            }
        }
    }

    public final CircularProgressBar getProgressView() {
        return (CircularProgressBar) this.f58559f.getValue();
    }

    public final C22009b getValue() {
        return this.f58557d;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C32343x.m95394I(this.f58558e.mo54705c()), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void setValue(C22009b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        this.f58557d = bVar;
        this.f58558e.mo54704b(bVar);
        m71263c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneyRequestGroupIconView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.view.MoneyRequestGroupIconView$b */
    public static final class C22009b {

        /* renamed from: a */
        private final List f58560a;

        /* renamed from: b */
        private final float f58561b;

        public C22009b(List list, float f) {
            C41536l.m120489i(list, "profilePictures");
            this.f58560a = list;
            this.f58561b = f;
        }

        /* renamed from: a */
        public final boolean mo54697a() {
            return !Float.isNaN(this.f58561b);
        }

        /* renamed from: b */
        public final int mo54698b() {
            return this.f58560a.size();
        }

        /* renamed from: c */
        public final List mo54699c() {
            return this.f58560a;
        }

        /* renamed from: d */
        public final float mo54700d() {
            return this.f58561b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22009b)) {
                return false;
            }
            C22009b bVar = (C22009b) obj;
            return C41536l.m120484d(this.f58560a, bVar.f58560a) && Float.compare(this.f58561b, bVar.f58561b) == 0;
        }

        public int hashCode() {
            return (this.f58560a.hashCode() * 31) + Float.floatToIntBits(this.f58561b);
        }

        public String toString() {
            List list = this.f58560a;
            float f = this.f58561b;
            return "Value(profilePictures=" + list + ", progress=" + f + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C22009b(List list, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C41341q.m119907j() : list, (i & 2) != 0 ? Float.NaN : f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoneyRequestGroupIconView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C41536l.m120489i(context, "context");
        this.f58557d = new C22009b((List) null, Utils.FLOAT_EPSILON, 3, (DefaultConstructorMarker) null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10330s.f29298f5);
        C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…oneyRequestGroupIconView)");
        this.f58558e = C22010c.f58562f.mo54708a(obtainStyledAttributes.getInt(C10330s.f29308g5, 0));
        obtainStyledAttributes.recycle();
        this.f58559f = C41219i.m119470b(new C22014d(context, this));
    }
}
