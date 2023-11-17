package p519mi;

import af1.C40303i;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C1314o;
import com.bumptech.glide.C2394j;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p035c4.C2247a;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10033v3;
import p352ak.C9920g4;
import p352ak.C9966m2;
import p352ak.C9991p3;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17786k;
import p642vh.C18355e0;
import p642vh.C18361h0;
import p642vh.C18365j0;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: mi.b */
public abstract class C16687b {

    /* renamed from: a */
    private final C6201a f46894a;

    /* renamed from: b */
    private View.OnClickListener f46895b;

    /* renamed from: c */
    private View.OnClickListener f46896c;

    /* renamed from: mi.b$a */
    public static class C16688a extends C16687b {

        /* renamed from: j */
        static final /* synthetic */ C40303i[] f46897j;

        /* renamed from: d */
        private C16686a f46898d;

        /* renamed from: e */
        private final C18355e0 f46899e;

        /* renamed from: f */
        private final C18355e0 f46900f;

        /* renamed from: g */
        private final C18361h0 f46901g = new C18361h0(C16691c.f46906d);

        /* renamed from: h */
        private final C18361h0 f46902h = new C18361h0(C16689a.f46904d);

        /* renamed from: i */
        private final C41555e f46903i;

        /* renamed from: mi.b$a$a */
        static final class C16689a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16689a f46904d = new C16689a();

            C16689a() {
                super(0);
            }

            public final Object invoke() {
                return "Caption inline feedback doesn't support close button";
            }
        }

        /* renamed from: mi.b$a$b */
        static final class C16690b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C16690b f46905d = new C16690b();

            C16690b() {
                super(1);
            }

            /* renamed from: a */
            public final C2394j invoke(C2394j jVar) {
                C41536l.m120489i(jVar, "$this$setImage");
                C2247a c0 = ((C2394j) jVar.mo7222d()).mo7220c0(C17780e.f49668q1);
                C41536l.m120488h(c0, "circleCrop().placeholder…rawable.thumbnail_circle)");
                return (C2394j) c0;
            }
        }

        /* renamed from: mi.b$a$c */
        static final class C16691c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16691c f46906d = new C16691c();

            C16691c() {
                super(0);
            }

            public final Object invoke() {
                return "Caption inline feedback doesn't support spanned text";
            }
        }

        /* renamed from: mi.b$a$d */
        public static final class C16692d extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C9991p3 f46907a;

            /* renamed from: b */
            final /* synthetic */ C16688a f46908b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16692d(Object obj, C9991p3 p3Var, C16688a aVar) {
                super(obj);
                this.f46907a = p3Var;
                this.f46908b = aVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                Image image = (Image) obj2;
                if (!C41536l.m120484d((Image) obj, image)) {
                    AppCompatImageView appCompatImageView = this.f46907a.f27400g;
                    C41536l.m120488h(appCompatImageView, "binding.inlineFeedbackImage");
                    C18368l.m62777z(appCompatImageView, image, C16690b.f46905d);
                    this.f46908b.mo43828o();
                }
            }
        }

        static {
            Class<C16688a> cls = C16688a.class;
            f46897j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "captionText", "getCaptionText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "titleText", "getTitleText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "interactiveButtonText", "getInteractiveButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "closeButtonVisibility", "getCloseButtonVisibility()Z", 0)), C41520a0.m120439e(new C41539o(cls, "feedbackImage", "getFeedbackImage()Lge/bog/designsystem/components/common/Image;", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16688a(C16686a aVar, C9991p3 p3Var) {
            super(p3Var);
            C41536l.m120489i(aVar, "state");
            C41536l.m120489i(p3Var, "binding");
            this.f46898d = aVar;
            AppCompatTextView appCompatTextView = p3Var.f27398e;
            C41536l.m120488h(appCompatTextView, "binding.feedbackCaption");
            this.f46899e = new C18355e0(appCompatTextView, true, (C43064a) null, 4, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView2 = p3Var.f27399f;
            C41536l.m120488h(appCompatTextView2, "binding.feedbackTitle");
            this.f46900f = new C18355e0(appCompatTextView2, true, (C43064a) null, 4, (DefaultConstructorMarker) null);
            C41551a aVar2 = C41551a.f97718a;
            this.f46903i = new C16692d((Object) null, p3Var, this);
            mo43814a(this.f46898d);
        }

        /* renamed from: c */
        public CharSequence mo43816c() {
            return this.f46899e.getValue(this, f46897j[0]);
        }

        /* renamed from: d */
        public Image mo43817d() {
            return (Image) this.f46903i.getValue(this, f46897j[4]);
        }

        /* renamed from: e */
        public final C16686a mo43818e() {
            return this.f46898d;
        }

        /* renamed from: f */
        public CharSequence mo43819f() {
            return this.f46900f.getValue(this, f46897j[1]);
        }

        /* renamed from: g */
        public void mo43820g(CharSequence charSequence) {
            this.f46899e.setValue(this, f46897j[0], charSequence);
        }

        /* renamed from: h */
        public void mo43821h(boolean z) {
            this.f46902h.setValue(this, f46897j[3], Boolean.valueOf(z));
        }

        /* renamed from: i */
        public void mo43822i(Image image) {
            this.f46903i.setValue(this, f46897j[4], image);
        }

        /* renamed from: k */
        public void mo43824k(CharSequence charSequence) {
            this.f46901g.setValue(this, f46897j[2], charSequence);
        }

        /* renamed from: m */
        public final void mo43826m(C16686a aVar) {
            C41536l.m120489i(aVar, "<set-?>");
            this.f46898d = aVar;
        }

        /* renamed from: n */
        public void mo43827n(CharSequence charSequence) {
            this.f46900f.setValue(this, f46897j[1], charSequence);
        }
    }

    /* renamed from: mi.b$b */
    public static class C16693b extends C16687b {

        /* renamed from: j */
        static final /* synthetic */ C40303i[] f46909j;

        /* renamed from: d */
        private C16686a f46910d;

        /* renamed from: e */
        private final C18361h0 f46911e = new C18361h0(C16695b.f46917d);

        /* renamed from: f */
        private final C18355e0 f46912f;

        /* renamed from: g */
        private final C18361h0 f46913g;

        /* renamed from: h */
        private final C18361h0 f46914h;

        /* renamed from: i */
        private final C18361h0 f46915i;

        /* renamed from: mi.b$b$a */
        public /* synthetic */ class C16694a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f46916a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    mi.a[] r0 = p519mi.C16686a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    mi.a r1 = p519mi.C16686a.INFO     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    mi.a r1 = p519mi.C16686a.PRIMARY     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f46916a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p519mi.C16687b.C16693b.C16694a.<clinit>():void");
            }
        }

        /* renamed from: mi.b$b$b */
        static final class C16695b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16695b f46917d = new C16695b();

            C16695b() {
                super(0);
            }

            public final Object invoke() {
                return "Clear feedback doesn't support caption text";
            }
        }

        /* renamed from: mi.b$b$c */
        static final class C16696c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16696c f46918d = new C16696c();

            C16696c() {
                super(0);
            }

            public final Object invoke() {
                return "Clear inline feedback doesn't support close button";
            }
        }

        /* renamed from: mi.b$b$d */
        static final class C16697d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16697d f46919d = new C16697d();

            C16697d() {
                super(0);
            }

            public final Object invoke() {
                return "Clear inline feedback doesn't support changing image";
            }
        }

        /* renamed from: mi.b$b$e */
        static final class C16698e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16698e f46920d = new C16698e();

            C16698e() {
                super(0);
            }

            public final Object invoke() {
                return "Clear inline feedback doesn't support spanned text";
            }
        }

        static {
            Class<C16693b> cls = C16693b.class;
            f46909j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "captionText", "getCaptionText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "titleText", "getTitleText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "interactiveButtonText", "getInteractiveButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "closeButtonVisibility", "getCloseButtonVisibility()Z", 0)), C41520a0.m120439e(new C41539o(cls, "feedbackImage", "getFeedbackImage()Lge/bog/designsystem/components/common/Image;", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16693b(C16686a aVar, C9966m2 m2Var) {
            super(m2Var);
            C41536l.m120489i(aVar, "state");
            C41536l.m120489i(m2Var, "binding");
            this.f46910d = aVar;
            TextView textView = m2Var.f27267e;
            C41536l.m120488h(textView, "binding.clearCaption");
            this.f46912f = new C18355e0(textView, true, (C43064a) null, 4, (DefaultConstructorMarker) null);
            this.f46913g = new C18361h0(C16698e.f46920d);
            this.f46914h = new C18361h0(C16696c.f46918d);
            this.f46915i = new C18361h0(C16697d.f46919d);
            int i = C16694a.f46916a[this.f46910d.ordinal()];
            if (i == 1) {
                C1314o.m4575q(m2Var.f27267e, C17786k.TextBody2InvertComponents200Left);
            } else if (i == 2) {
                C1314o.m4575q(m2Var.f27267e, C17786k.f49829b0);
            } else {
                throw new IllegalStateException("Unknown feedback state");
            }
            mo43814a(this.f46910d);
        }

        /* renamed from: c */
        public CharSequence mo43816c() {
            return (CharSequence) this.f46911e.getValue(this, f46909j[0]);
        }

        /* renamed from: d */
        public Image mo43817d() {
            return (Image) this.f46915i.getValue(this, f46909j[4]);
        }

        /* renamed from: e */
        public final C16686a mo43818e() {
            return this.f46910d;
        }

        /* renamed from: f */
        public CharSequence mo43819f() {
            return this.f46912f.getValue(this, f46909j[1]);
        }

        /* renamed from: g */
        public void mo43820g(CharSequence charSequence) {
            this.f46911e.setValue(this, f46909j[0], charSequence);
        }

        /* renamed from: h */
        public void mo43821h(boolean z) {
            this.f46914h.setValue(this, f46909j[3], Boolean.valueOf(z));
        }

        /* renamed from: i */
        public void mo43822i(Image image) {
            this.f46915i.setValue(this, f46909j[4], image);
        }

        /* renamed from: k */
        public void mo43824k(CharSequence charSequence) {
            this.f46913g.setValue(this, f46909j[2], charSequence);
        }

        /* renamed from: m */
        public final void mo43826m(C16686a aVar) {
            C41536l.m120489i(aVar, "<set-?>");
            this.f46910d = aVar;
        }

        /* renamed from: n */
        public void mo43827n(CharSequence charSequence) {
            this.f46912f.setValue(this, f46909j[1], charSequence);
        }
    }

    /* renamed from: mi.b$c */
    public static class C16699c extends C16687b {

        /* renamed from: j */
        static final /* synthetic */ C40303i[] f46921j;

        /* renamed from: d */
        private C16686a f46922d;

        /* renamed from: e */
        private final C18361h0 f46923e = new C18361h0(C16701b.f46929d);

        /* renamed from: f */
        private final C18355e0 f46924f;

        /* renamed from: g */
        private final C18355e0 f46925g;

        /* renamed from: h */
        private final C18365j0 f46926h;

        /* renamed from: i */
        private final C18361h0 f46927i;

        /* renamed from: mi.b$c$a */
        public /* synthetic */ class C16700a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f46928a;

            static {
                int[] iArr = new int[C16686a.values().length];
                try {
                    iArr[C16686a.POSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f46928a = iArr;
            }
        }

        /* renamed from: mi.b$c$b */
        static final class C16701b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16701b f46929d = new C16701b();

            C16701b() {
                super(0);
            }

            public final Object invoke() {
                return "Interactive inline feedback doesn't support caption text";
            }
        }

        /* renamed from: mi.b$c$c */
        static final class C16702c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16702c f46930d = new C16702c();

            C16702c() {
                super(0);
            }

            public final Object invoke() {
                return "Interactive inline feedback doesn't support changing image";
            }
        }

        static {
            Class<C16699c> cls = C16699c.class;
            f46921j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "captionText", "getCaptionText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "titleText", "getTitleText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "interactiveButtonText", "getInteractiveButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "closeButtonVisibility", "getCloseButtonVisibility()Z", 0)), C41520a0.m120439e(new C41539o(cls, "feedbackImage", "getFeedbackImage()Lge/bog/designsystem/components/common/Image;", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16699c(C16686a aVar, C10033v3 v3Var) {
            super(v3Var);
            C41536l.m120489i(aVar, "state");
            C41536l.m120489i(v3Var, "binding");
            this.f46922d = aVar;
            TextView textView = v3Var.f27666j;
            C41536l.m120488h(textView, "binding.interactiveText");
            this.f46924f = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            TextView textView2 = v3Var.f27662f;
            C41536l.m120488h(textView2, "binding.buttonText");
            this.f46925g = new C18355e0(textView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            LayerView layerView = v3Var.f27663g;
            C41536l.m120488h(layerView, "binding.closeButton");
            this.f46926h = new C18365j0(layerView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            this.f46927i = new C18361h0(C16702c.f46930d);
            mo43814a(this.f46922d);
        }

        /* renamed from: c */
        public CharSequence mo43816c() {
            return (CharSequence) this.f46923e.getValue(this, f46921j[0]);
        }

        /* renamed from: d */
        public Image mo43817d() {
            return (Image) this.f46927i.getValue(this, f46921j[4]);
        }

        /* renamed from: e */
        public final C16686a mo43818e() {
            return this.f46922d;
        }

        /* renamed from: f */
        public CharSequence mo43819f() {
            return this.f46924f.getValue(this, f46921j[1]);
        }

        /* renamed from: g */
        public void mo43820g(CharSequence charSequence) {
            this.f46923e.setValue(this, f46921j[0], charSequence);
        }

        /* renamed from: h */
        public void mo43821h(boolean z) {
            this.f46926h.mo46151c(this, f46921j[3], z);
        }

        /* renamed from: i */
        public void mo43822i(Image image) {
            this.f46927i.setValue(this, f46921j[4], image);
        }

        /* renamed from: j */
        public void mo43823j(View.OnClickListener onClickListener) {
            ((C10033v3) mo43815b()).f27665i.setOnClickListener(onClickListener);
        }

        /* renamed from: k */
        public void mo43824k(CharSequence charSequence) {
            this.f46925g.setValue(this, f46921j[2], charSequence);
        }

        /* renamed from: l */
        public void mo43825l(View.OnClickListener onClickListener) {
            ((C10033v3) mo43815b()).f27663g.setOnClickListener(onClickListener);
        }

        /* renamed from: m */
        public final void mo43826m(C16686a aVar) {
            C41536l.m120489i(aVar, "<set-?>");
            this.f46922d = aVar;
        }

        /* renamed from: n */
        public void mo43827n(CharSequence charSequence) {
            this.f46924f.setValue(this, f46921j[1], charSequence);
        }

        /* renamed from: p */
        public final void mo43830p(C16686a aVar) {
            Integer num;
            C41536l.m120489i(aVar, "<this>");
            if (C16700a.f46928a[aVar.ordinal()] == 1) {
                num = Integer.valueOf(C17780e.f49670w);
            } else {
                num = aVar.mo43811c();
            }
            ((C10033v3) mo43815b()).mo3946b().setBackgroundResource(aVar.mo43810b());
            AppCompatImageView appCompatImageView = ((C10033v3) mo43815b()).f27664h;
            C41536l.m120488h(appCompatImageView, "applyInteractiveState$lambda$1");
            C18368l.m62751F(appCompatImageView, true, false, 2, (Object) null);
            if (num != null) {
                appCompatImageView.setImageResource(num.intValue());
            }
            Color e = aVar.mo43812e();
            Context context = appCompatImageView.getContext();
            C41536l.m120488h(context, "context");
            appCompatImageView.setColorFilter(e.mo35260a(context));
        }
    }

    /* renamed from: mi.b$d */
    public static class C16703d extends C16687b {

        /* renamed from: j */
        static final /* synthetic */ C40303i[] f46931j;

        /* renamed from: d */
        private C16686a f46932d;

        /* renamed from: e */
        private final C18361h0 f46933e = new C18361h0(C16704a.f46938d);

        /* renamed from: f */
        private final C18355e0 f46934f;

        /* renamed from: g */
        private final C18361h0 f46935g;

        /* renamed from: h */
        private final C18361h0 f46936h;

        /* renamed from: i */
        private final C41555e f46937i;

        /* renamed from: mi.b$d$a */
        static final class C16704a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16704a f46938d = new C16704a();

            C16704a() {
                super(0);
            }

            public final Object invoke() {
                return "Normal inline feedback doesn't support caption";
            }
        }

        /* renamed from: mi.b$d$b */
        static final class C16705b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16705b f46939d = new C16705b();

            C16705b() {
                super(0);
            }

            public final Object invoke() {
                return "Normal inline feedback doesn't support close button";
            }
        }

        /* renamed from: mi.b$d$c */
        static final class C16706c extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C16706c f46940d = new C16706c();

            C16706c() {
                super(1);
            }

            /* renamed from: a */
            public final C2394j invoke(C2394j jVar) {
                C41536l.m120489i(jVar, "$this$setImage");
                C2247a c0 = ((C2394j) jVar.mo7222d()).mo7220c0(C17780e.f49668q1);
                C41536l.m120488h(c0, "circleCrop().placeholder…rawable.thumbnail_circle)");
                return (C2394j) c0;
            }
        }

        /* renamed from: mi.b$d$d */
        static final class C16707d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16707d f46941d = new C16707d();

            C16707d() {
                super(0);
            }

            public final Object invoke() {
                return "Normal inline feedback doesn't support spanned text";
            }
        }

        /* renamed from: mi.b$d$e */
        public static final class C16708e extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C9991p3 f46942a;

            /* renamed from: b */
            final /* synthetic */ C16703d f46943b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16708e(Object obj, C9991p3 p3Var, C16703d dVar) {
                super(obj);
                this.f46942a = p3Var;
                this.f46943b = dVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                Image image = (Image) obj2;
                if (!C41536l.m120484d((Image) obj, image)) {
                    AppCompatImageView appCompatImageView = this.f46942a.f27400g;
                    C41536l.m120488h(appCompatImageView, "binding.inlineFeedbackImage");
                    C18368l.m62777z(appCompatImageView, image, C16706c.f46940d);
                    this.f46943b.mo43828o();
                }
            }
        }

        static {
            Class<C16703d> cls = C16703d.class;
            f46931j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "captionText", "getCaptionText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "titleText", "getTitleText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "interactiveButtonText", "getInteractiveButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "closeButtonVisibility", "getCloseButtonVisibility()Z", 0)), C41520a0.m120439e(new C41539o(cls, "feedbackImage", "getFeedbackImage()Lge/bog/designsystem/components/common/Image;", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16703d(C16686a aVar, C9991p3 p3Var) {
            super(p3Var);
            C41536l.m120489i(aVar, "state");
            C41536l.m120489i(p3Var, "binding");
            this.f46932d = aVar;
            AppCompatTextView appCompatTextView = p3Var.f27399f;
            C41536l.m120488h(appCompatTextView, "binding.feedbackTitle");
            this.f46934f = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f46935g = new C18361h0(C16707d.f46941d);
            this.f46936h = new C18361h0(C16705b.f46939d);
            C41551a aVar2 = C41551a.f97718a;
            this.f46937i = new C16708e((Object) null, p3Var, this);
            mo43814a(this.f46932d);
            p3Var.f27398e.setVisibility(8);
        }

        /* renamed from: c */
        public CharSequence mo43816c() {
            return (CharSequence) this.f46933e.getValue(this, f46931j[0]);
        }

        /* renamed from: d */
        public Image mo43817d() {
            return (Image) this.f46937i.getValue(this, f46931j[4]);
        }

        /* renamed from: e */
        public final C16686a mo43818e() {
            return this.f46932d;
        }

        /* renamed from: f */
        public CharSequence mo43819f() {
            return this.f46934f.getValue(this, f46931j[1]);
        }

        /* renamed from: g */
        public void mo43820g(CharSequence charSequence) {
            this.f46933e.setValue(this, f46931j[0], charSequence);
        }

        /* renamed from: h */
        public void mo43821h(boolean z) {
            this.f46936h.setValue(this, f46931j[3], Boolean.valueOf(z));
        }

        /* renamed from: i */
        public void mo43822i(Image image) {
            this.f46937i.setValue(this, f46931j[4], image);
        }

        /* renamed from: k */
        public void mo43824k(CharSequence charSequence) {
            this.f46935g.setValue(this, f46931j[2], charSequence);
        }

        /* renamed from: m */
        public final void mo43826m(C16686a aVar) {
            C41536l.m120489i(aVar, "<set-?>");
            this.f46932d = aVar;
        }

        /* renamed from: n */
        public void mo43827n(CharSequence charSequence) {
            this.f46934f.setValue(this, f46931j[1], charSequence);
        }
    }

    /* renamed from: mi.b$e */
    public static class C16709e extends C16687b {

        /* renamed from: j */
        static final /* synthetic */ C40303i[] f46944j;

        /* renamed from: d */
        private C16686a f46945d;

        /* renamed from: e */
        private final C18361h0 f46946e = new C18361h0(C16710a.f46951d);

        /* renamed from: f */
        private final C18355e0 f46947f;

        /* renamed from: g */
        private final C18361h0 f46948g;

        /* renamed from: h */
        private final C18361h0 f46949h;

        /* renamed from: i */
        private final C18361h0 f46950i;

        /* renamed from: mi.b$e$a */
        static final class C16710a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16710a f46951d = new C16710a();

            C16710a() {
                super(0);
            }

            public final Object invoke() {
                return "Normal text inline feedback doesn't support title";
            }
        }

        /* renamed from: mi.b$e$b */
        static final class C16711b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16711b f46952d = new C16711b();

            C16711b() {
                super(0);
            }

            public final Object invoke() {
                return "Normal text inline feedback doesn't support button";
            }
        }

        /* renamed from: mi.b$e$c */
        static final class C16712c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16712c f46953d = new C16712c();

            C16712c() {
                super(0);
            }

            public final Object invoke() {
                return "Normal text inline feedback doesn't support changing image";
            }
        }

        /* renamed from: mi.b$e$d */
        static final class C16713d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16713d f46954d = new C16713d();

            C16713d() {
                super(0);
            }

            public final Object invoke() {
                return "Normal text inline feedback doesn't support button";
            }
        }

        static {
            Class<C16709e> cls = C16709e.class;
            f46944j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "captionText", "getCaptionText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "titleText", "getTitleText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "interactiveButtonText", "getInteractiveButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "closeButtonVisibility", "getCloseButtonVisibility()Z", 0)), C41520a0.m120439e(new C41539o(cls, "feedbackImage", "getFeedbackImage()Lge/bog/designsystem/components/common/Image;", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16709e(C16686a aVar, C9920g4 g4Var) {
            super(g4Var);
            C41536l.m120489i(aVar, "state");
            C41536l.m120489i(g4Var, "binding");
            this.f46945d = aVar;
            TextView textView = g4Var.f27031e;
            C41536l.m120488h(textView, "binding.normalCaption");
            this.f46947f = new C18355e0(textView, true, (C43064a) null, 4, (DefaultConstructorMarker) null);
            this.f46948g = new C18361h0(C16713d.f46954d);
            this.f46949h = new C18361h0(C16711b.f46952d);
            this.f46950i = new C18361h0(C16712c.f46953d);
            C1314o.m4575q(g4Var.f27031e, C17786k.TextBody2Information500Left);
            mo43814a(this.f46945d);
        }

        /* renamed from: c */
        public CharSequence mo43816c() {
            return (CharSequence) this.f46946e.getValue(this, f46944j[0]);
        }

        /* renamed from: d */
        public Image mo43817d() {
            return (Image) this.f46950i.getValue(this, f46944j[4]);
        }

        /* renamed from: e */
        public final C16686a mo43818e() {
            return this.f46945d;
        }

        /* renamed from: f */
        public CharSequence mo43819f() {
            return this.f46947f.getValue(this, f46944j[1]);
        }

        /* renamed from: g */
        public void mo43820g(CharSequence charSequence) {
            this.f46946e.setValue(this, f46944j[0], charSequence);
        }

        /* renamed from: h */
        public void mo43821h(boolean z) {
            this.f46949h.setValue(this, f46944j[3], Boolean.valueOf(z));
        }

        /* renamed from: i */
        public void mo43822i(Image image) {
            this.f46950i.setValue(this, f46944j[4], image);
        }

        /* renamed from: k */
        public void mo43824k(CharSequence charSequence) {
            this.f46948g.setValue(this, f46944j[2], charSequence);
        }

        /* renamed from: m */
        public final void mo43826m(C16686a aVar) {
            C41536l.m120489i(aVar, "<set-?>");
            this.f46945d = aVar;
        }

        /* renamed from: n */
        public void mo43827n(CharSequence charSequence) {
            this.f46947f.setValue(this, f46944j[1], charSequence);
        }
    }

    public C16687b(C6201a aVar) {
        C41536l.m120489i(aVar, "binding");
        this.f46894a = aVar;
    }

    /* renamed from: a */
    public final void mo43814a(C16686a aVar) {
        boolean z;
        C41536l.m120489i(aVar, "state");
        mo43826m(aVar);
        if (this instanceof C16703d) {
            z = true;
        } else {
            z = this instanceof C16688a;
        }
        if (z) {
            C6201a aVar2 = this.f46894a;
            C41536l.m120487g(aVar2, "null cannot be cast to non-null type ge.bog.designsystem.databinding.ViewInlineFeedbackBinding");
            ((C9991p3) aVar2).mo3946b().setBackgroundResource(aVar.mo43810b());
            AppCompatImageView appCompatImageView = ((C9991p3) this.f46894a).f27400g;
            if (!(mo43817d() instanceof Image.Url)) {
                Integer c = aVar.mo43811c();
                if (c != null) {
                    mo43822i(new Image.Resource(c.intValue(), (Boolean) null, 2, (DefaultConstructorMarker) null));
                }
                Color e = aVar.mo43812e();
                Context context = appCompatImageView.getContext();
                C41536l.m120488h(context, "context");
                appCompatImageView.setColorFilter(e.mo35260a(context));
            }
        } else if (this instanceof C16699c) {
            ((C16699c) this).mo43830p(aVar);
        } else {
            this.f46894a.mo3946b().setBackgroundResource(aVar.mo43810b());
        }
    }

    /* renamed from: b */
    public final C6201a mo43815b() {
        return this.f46894a;
    }

    /* renamed from: c */
    public abstract CharSequence mo43816c();

    /* renamed from: d */
    public abstract Image mo43817d();

    /* renamed from: e */
    public abstract C16686a mo43818e();

    /* renamed from: f */
    public abstract CharSequence mo43819f();

    /* renamed from: g */
    public abstract void mo43820g(CharSequence charSequence);

    /* renamed from: h */
    public abstract void mo43821h(boolean z);

    /* renamed from: i */
    public abstract void mo43822i(Image image);

    /* renamed from: j */
    public void mo43823j(View.OnClickListener onClickListener) {
        this.f46895b = onClickListener;
    }

    /* renamed from: k */
    public abstract void mo43824k(CharSequence charSequence);

    /* renamed from: l */
    public void mo43825l(View.OnClickListener onClickListener) {
        this.f46896c = onClickListener;
    }

    /* renamed from: m */
    public abstract void mo43826m(C16686a aVar);

    /* renamed from: n */
    public abstract void mo43827n(CharSequence charSequence);

    /* renamed from: o */
    public final void mo43828o() {
        boolean z;
        int i;
        if (this instanceof C16703d) {
            z = true;
        } else {
            z = this instanceof C16688a;
        }
        if (z) {
            C6201a aVar = this.f46894a;
            C41536l.m120487g(aVar, "null cannot be cast to non-null type ge.bog.designsystem.databinding.ViewInlineFeedbackBinding");
            C9991p3 p3Var = (C9991p3) aVar;
            AppCompatImageView appCompatImageView = ((C9991p3) this.f46894a).f27400g;
            Image d = mo43817d();
            if (d == null) {
                Integer c = mo43818e().mo43811c();
                if (c != null) {
                    mo43822i(new Image.Resource(c.intValue(), (Boolean) null, 2, (DefaultConstructorMarker) null));
                }
                i = C17779d.icon_size_20;
            } else if (d instanceof Image.Url) {
                appCompatImageView.setColorFilter((ColorFilter) null);
                i = C17779d.icon_size_24;
            } else {
                Color e = mo43818e().mo43812e();
                Context context = appCompatImageView.getContext();
                C41536l.m120488h(context, "context");
                appCompatImageView.setColorFilter(e.mo35260a(context));
                i = C17779d.icon_size_20;
            }
            C41536l.m120488h(appCompatImageView, "updateIconParams$lambda$7$lambda$6");
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = appCompatImageView.getContext().getResources().getDimensionPixelSize(i);
                layoutParams.height = appCompatImageView.getContext().getResources().getDimensionPixelSize(i);
                appCompatImageView.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
