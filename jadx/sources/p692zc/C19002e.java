package p692zc;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.C0808h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p402ed.C12426d;
import p485kc.C16346d;
import p513mc.C16663b;
import p513mc.C16664c;
import p678yc.C18877a;

/* renamed from: zc.e */
public final class C19002e {

    /* renamed from: q */
    public static final C19003a f53052q = new C19003a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C12426d f53053a;

    /* renamed from: b */
    private C12426d f53054b = new C12426d("#F3F4F8");

    /* renamed from: c */
    private C12426d f53055c;

    /* renamed from: d */
    private C12426d f53056d;

    /* renamed from: e */
    private C12426d f53057e;

    /* renamed from: f */
    private C12426d f53058f;

    /* renamed from: g */
    private C12426d f53059g;

    /* renamed from: h */
    private C12426d f53060h;

    /* renamed from: i */
    private C12426d f53061i;

    /* renamed from: j */
    private C12426d f53062j;

    /* renamed from: k */
    private C12426d f53063k;

    /* renamed from: l */
    private C12426d f53064l;

    /* renamed from: m */
    private C12426d f53065m;

    /* renamed from: n */
    private C12426d f53066n;

    /* renamed from: o */
    private C12426d f53067o;

    /* renamed from: p */
    private C12426d f53068p;

    /* renamed from: zc.e$a */
    public static final class C19003a {
        private C19003a() {
        }

        public /* synthetic */ C19003a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ void m64212c(C19003a aVar, Activity activity, ImageView imageView, TextView textView, boolean z, C18877a aVar2, int i, Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            aVar.mo47118b(activity, imageView, textView, z, aVar2);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m64213d(Activity activity, View view) {
            if (activity != null) {
                activity.onBackPressed();
            }
        }

        /* renamed from: b */
        public final void mo47118b(Activity activity, ImageView imageView, TextView textView, boolean z, C18877a aVar) {
            C41536l.m120489i(imageView, "backButton");
            C41536l.m120489i(textView, "textView");
            C41536l.m120489i(aVar, "identomatConfig");
            mo47122h(imageView, aVar.mo46861a().mo47100i().mo33033a());
            imageView.setOnClickListener(new C19001d(activity));
            if (z) {
                textView.setText(aVar.mo46864d().mo47124d(activity, "title"));
                textView.setTextColor(aVar.mo46861a().mo47106o().mo33033a());
                aVar.mo46867g().mo47140e().mo47079g(textView, -1);
            }
        }

        /* renamed from: e */
        public final void mo47119e(int i, Resources resources) {
            C41536l.m120489i(resources, "resources");
            Drawable f = C0808h.m3031f(resources, C16346d.identomat_button, (Resources.Theme) null);
            if (f != null && (f instanceof GradientDrawable)) {
                ((GradientDrawable) f).setCornerRadius((float) i);
            }
            Drawable f2 = C0808h.m3031f(resources, C16346d.identomat_button_white, (Resources.Theme) null);
            if (f2 != null && (f2 instanceof GradientDrawable)) {
                ((GradientDrawable) f2).setCornerRadius((float) i);
            }
        }

        /* renamed from: f */
        public final void mo47120f(View view, int i) {
            C41536l.m120489i(view, "view");
            Drawable background = view.getBackground();
            if (background != null && (background instanceof GradientDrawable)) {
                ((GradientDrawable) background).setColor(i);
            }
        }

        /* renamed from: g */
        public final void mo47121g(View view, int i, int i2) {
            C41536l.m120489i(view, "view");
            Drawable background = view.getBackground();
            if (background != null && (background instanceof GradientDrawable)) {
                ((GradientDrawable) background).setStroke(i2, i);
            }
        }

        /* renamed from: h */
        public final void mo47122h(ImageView imageView, int i) {
            C41536l.m120489i(imageView, "view");
            Drawable drawable = imageView.getDrawable();
            if (Build.VERSION.SDK_INT >= 29) {
                if (drawable != null) {
                    C16664c.m58987a();
                    drawable.setColorFilter(C16663b.m58986a(i, BlendMode.SRC_ATOP));
                }
            } else if (drawable != null) {
                drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
            }
        }
    }

    public C19002e() {
        C12426d dVar = new C12426d("#FFFFFF");
        this.f53053a = dVar;
        this.f53055c = dVar;
        this.f53056d = new C12426d("#000000");
        this.f53057e = new C12426d("#A4A4A4");
        this.f53058f = new C12426d("#676767");
        this.f53059g = new C12426d("#7848ff");
        this.f53060h = dVar;
        this.f53061i = dVar;
        this.f53062j = new C12426d("#7848ff");
        this.f53063k = new C12426d("#7848ff");
        this.f53064l = new C12426d("#384199");
        this.f53065m = new C12426d("#000000");
        this.f53066n = new C12426d("#4E4E82");
        this.f53067o = new C12426d("#9898BF");
        this.f53068p = new C12426d("#F7F7F9");
    }

    /* renamed from: A */
    public final void mo47087A(C12426d dVar) {
        C41536l.m120489i(dVar, "<set-?>");
        this.f53061i = dVar;
    }

    /* renamed from: B */
    public final void mo47088B(C12426d dVar) {
        C41536l.m120489i(dVar, "<set-?>");
        this.f53062j = dVar;
    }

    /* renamed from: C */
    public final void mo47089C(C12426d dVar) {
        C41536l.m120489i(dVar, "<set-?>");
        this.f53058f = dVar;
    }

    /* renamed from: D */
    public final void mo47090D(C12426d dVar) {
        C41536l.m120489i(dVar, "<set-?>");
        this.f53057e = dVar;
    }

    /* renamed from: E */
    public final void mo47091E(C12426d dVar) {
        C41536l.m120489i(dVar, "<set-?>");
        this.f53056d = dVar;
    }

    /* renamed from: a */
    public final C12426d mo47092a() {
        return this.f53055c;
    }

    /* renamed from: b */
    public final C12426d mo47093b() {
        return this.f53054b;
    }

    /* renamed from: c */
    public final C12426d mo47094c() {
        return this.f53067o;
    }

    /* renamed from: d */
    public final C12426d mo47095d() {
        return this.f53068p;
    }

    /* renamed from: e */
    public final C12426d mo47096e() {
        return this.f53063k;
    }

    /* renamed from: f */
    public final C12426d mo47097f() {
        return this.f53066n;
    }

    /* renamed from: g */
    public final C12426d mo47098g() {
        return this.f53065m;
    }

    /* renamed from: h */
    public final C12426d mo47099h() {
        return this.f53064l;
    }

    /* renamed from: i */
    public final C12426d mo47100i() {
        return this.f53059g;
    }

    /* renamed from: j */
    public final C12426d mo47101j() {
        return this.f53060h;
    }

    /* renamed from: k */
    public final C12426d mo47102k() {
        return this.f53061i;
    }

    /* renamed from: l */
    public final C12426d mo47103l() {
        return this.f53062j;
    }

    /* renamed from: m */
    public final C12426d mo47104m() {
        return this.f53058f;
    }

    /* renamed from: n */
    public final C12426d mo47105n() {
        return this.f53057e;
    }

    /* renamed from: o */
    public final C12426d mo47106o() {
        return this.f53056d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        r1 = new p402ed.C12426d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        r1 = new p402ed.C12426d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0084, code lost:
        r1 = new p402ed.C12426d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a1, code lost:
        r1 = new p402ed.C12426d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r1 = new p402ed.C12426d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00be, code lost:
        r1 = new p402ed.C12426d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00db, code lost:
        r1 = new p402ed.C12426d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f8, code lost:
        r1 = new p402ed.C12426d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0115, code lost:
        r1 = new p402ed.C12426d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0132, code lost:
        r1 = new p402ed.C12426d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014f, code lost:
        r1 = new p402ed.C12426d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x016c, code lost:
        r1 = new p402ed.C12426d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0189, code lost:
        r1 = new p402ed.C12426d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a6, code lost:
        r0 = new p402ed.C12426d(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        r1 = new p402ed.C12426d(r0);
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47107p(java.util.Map r3) {
        /*
            r2 = this;
            java.lang.String r0 = "colors"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.lang.String r0 = "background_low"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0010
            goto L_0x0022
        L_0x0010:
            ed.d r1 = new ed.d
            r1.<init>(r0)
            java.lang.Integer r0 = r1.mo33034b()
            if (r0 != 0) goto L_0x001c
            goto L_0x0022
        L_0x001c:
            r0.intValue()
            r2.mo47109r(r1)
        L_0x0022:
            java.lang.String r0 = "background_high"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x002d
            goto L_0x003f
        L_0x002d:
            ed.d r1 = new ed.d
            r1.<init>(r0)
            java.lang.Integer r0 = r1.mo33034b()
            if (r0 != 0) goto L_0x0039
            goto L_0x003f
        L_0x0039:
            r0.intValue()
            r2.mo47108q(r1)
        L_0x003f:
            java.lang.String r0 = "text_color_title"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x004a
            goto L_0x005c
        L_0x004a:
            ed.d r1 = new ed.d
            r1.<init>(r0)
            java.lang.Integer r0 = r1.mo33034b()
            if (r0 != 0) goto L_0x0056
            goto L_0x005c
        L_0x0056:
            r0.intValue()
            r2.mo47091E(r1)
        L_0x005c:
            java.lang.String r0 = "text_color_header"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0067
            goto L_0x0079
        L_0x0067:
            ed.d r1 = new ed.d
            r1.<init>(r0)
            java.lang.Integer r0 = r1.mo33034b()
            if (r0 != 0) goto L_0x0073
            goto L_0x0079
        L_0x0073:
            r0.intValue()
            r2.mo47090D(r1)
        L_0x0079:
            java.lang.String r0 = "text_color"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0084
            goto L_0x0096
        L_0x0084:
            ed.d r1 = new ed.d
            r1.<init>(r0)
            java.lang.Integer r0 = r1.mo33034b()
            if (r0 != 0) goto L_0x0090
            goto L_0x0096
        L_0x0090:
            r0.intValue()
            r2.mo47089C(r1)
        L_0x0096:
            java.lang.String r0 = "primary_button"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x00a1
            goto L_0x00b3
        L_0x00a1:
            ed.d r1 = new ed.d
            r1.<init>(r0)
            java.lang.Integer r0 = r1.mo33034b()
            if (r0 != 0) goto L_0x00ad
            goto L_0x00b3
        L_0x00ad:
            r0.intValue()
            r2.mo47116y(r1)
        L_0x00b3:
            java.lang.String r0 = "primary_button_text"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x00be
            goto L_0x00d0
        L_0x00be:
            ed.d r1 = new ed.d
            r1.<init>(r0)
            java.lang.Integer r0 = r1.mo33034b()
            if (r0 != 0) goto L_0x00ca
            goto L_0x00d0
        L_0x00ca:
            r0.intValue()
            r2.mo47117z(r1)
        L_0x00d0:
            java.lang.String r0 = "secondary_button"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x00db
            goto L_0x00ed
        L_0x00db:
            ed.d r1 = new ed.d
            r1.<init>(r0)
            java.lang.Integer r0 = r1.mo33034b()
            if (r0 != 0) goto L_0x00e7
            goto L_0x00ed
        L_0x00e7:
            r0.intValue()
            r2.mo47087A(r1)
        L_0x00ed:
            java.lang.String r0 = "secondary_button_text"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x00f8
            goto L_0x010a
        L_0x00f8:
            ed.d r1 = new ed.d
            r1.<init>(r0)
            java.lang.Integer r0 = r1.mo33034b()
            if (r0 != 0) goto L_0x0104
            goto L_0x010a
        L_0x0104:
            r0.intValue()
            r2.mo47088B(r1)
        L_0x010a:
            java.lang.String r0 = "document_outer"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0115
            goto L_0x0127
        L_0x0115:
            ed.d r1 = new ed.d
            r1.<init>(r0)
            java.lang.Integer r0 = r1.mo33034b()
            if (r0 != 0) goto L_0x0121
            goto L_0x0127
        L_0x0121:
            r0.intValue()
            r2.mo47112u(r1)
        L_0x0127:
            java.lang.String r0 = "loading_indicator_background"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0132
            goto L_0x0144
        L_0x0132:
            ed.d r1 = new ed.d
            r1.<init>(r0)
            java.lang.Integer r0 = r1.mo33034b()
            if (r0 != 0) goto L_0x013e
            goto L_0x0144
        L_0x013e:
            r0.intValue()
            r2.mo47115x(r1)
        L_0x0144:
            java.lang.String r0 = "iteration_text"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x014f
            goto L_0x0161
        L_0x014f:
            ed.d r1 = new ed.d
            r1.<init>(r0)
            java.lang.Integer r0 = r1.mo33034b()
            if (r0 != 0) goto L_0x015b
            goto L_0x0161
        L_0x015b:
            r0.intValue()
            r2.mo47114w(r1)
        L_0x0161:
            java.lang.String r0 = "icon_color"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x016c
            goto L_0x017e
        L_0x016c:
            ed.d r1 = new ed.d
            r1.<init>(r0)
            java.lang.Integer r0 = r1.mo33034b()
            if (r0 != 0) goto L_0x0178
            goto L_0x017e
        L_0x0178:
            r0.intValue()
            r2.mo47113v(r1)
        L_0x017e:
            java.lang.String r0 = "cascading_face_arrow_color"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0189
            goto L_0x019b
        L_0x0189:
            ed.d r1 = new ed.d
            r1.<init>(r0)
            java.lang.Integer r0 = r1.mo33034b()
            if (r0 != 0) goto L_0x0195
            goto L_0x019b
        L_0x0195:
            r0.intValue()
            r2.mo47110s(r1)
        L_0x019b:
            java.lang.String r0 = "cascading_face_background"
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x01a6
            goto L_0x01b8
        L_0x01a6:
            ed.d r0 = new ed.d
            r0.<init>(r3)
            java.lang.Integer r3 = r0.mo33034b()
            if (r3 != 0) goto L_0x01b2
            goto L_0x01b8
        L_0x01b2:
            r3.intValue()
            r2.mo47111t(r0)
        L_0x01b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p692zc.C19002e.mo47107p(java.util.Map):void");
    }

    /* renamed from: q */
    public final void mo47108q(C12426d dVar) {
        C41536l.m120489i(dVar, "<set-?>");
        this.f53055c = dVar;
    }

    /* renamed from: r */
    public final void mo47109r(C12426d dVar) {
        C41536l.m120489i(dVar, "<set-?>");
        this.f53054b = dVar;
    }

    /* renamed from: s */
    public final void mo47110s(C12426d dVar) {
        C41536l.m120489i(dVar, "<set-?>");
        this.f53067o = dVar;
    }

    /* renamed from: t */
    public final void mo47111t(C12426d dVar) {
        C41536l.m120489i(dVar, "<set-?>");
        this.f53068p = dVar;
    }

    /* renamed from: u */
    public final void mo47112u(C12426d dVar) {
        C41536l.m120489i(dVar, "<set-?>");
        this.f53063k = dVar;
    }

    /* renamed from: v */
    public final void mo47113v(C12426d dVar) {
        C41536l.m120489i(dVar, "<set-?>");
        this.f53066n = dVar;
    }

    /* renamed from: w */
    public final void mo47114w(C12426d dVar) {
        C41536l.m120489i(dVar, "<set-?>");
        this.f53065m = dVar;
    }

    /* renamed from: x */
    public final void mo47115x(C12426d dVar) {
        C41536l.m120489i(dVar, "<set-?>");
        this.f53064l = dVar;
    }

    /* renamed from: y */
    public final void mo47116y(C12426d dVar) {
        C41536l.m120489i(dVar, "<set-?>");
        this.f53059g = dVar;
    }

    /* renamed from: z */
    public final void mo47117z(C12426d dVar) {
        C41536l.m120489i(dVar, "<set-?>");
        this.f53060h = dVar;
    }
}
