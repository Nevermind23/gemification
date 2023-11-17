package qf0;

import ie0.C25185e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: qf0.b */
public abstract class C27791b {

    /* renamed from: a */
    private final StringSource f70890a;

    /* renamed from: b */
    private final StringSource f70891b;

    /* renamed from: c */
    private final StringSource f70892c;

    /* renamed from: d */
    private final Image f70893d;

    /* renamed from: qf0.b$a */
    public static final class C27792a extends C27791b {

        /* renamed from: e */
        public static final C27792a f70894e = new C27792a();

        private C27792a() {
            super(C34646b.m101748b("gt.onboarding.slider.1.title", new Object[0]), C34646b.m101748b("gt.onboarding.slider.1.text", new Object[0]), C34646b.m101748b("gt.onboarding.slider.1.button", new Object[0]), new Image.Resource(C25185e.illustration_gt_intro_slider_1, (Boolean) null, 2, (DefaultConstructorMarker) null), (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: qf0.b$b */
    public static final class C27793b extends C27791b {

        /* renamed from: e */
        public static final C27793b f70895e = new C27793b();

        private C27793b() {
            super(C34646b.m101748b("gt.onboarding.slider.2.title", new Object[0]), C34646b.m101748b("gt.onboarding.slider.2.text", new Object[0]), C34646b.m101748b("gt.onboarding.slider.2.button", new Object[0]), new Image.Resource(C25185e.illustration_gt_intro_slider_2, (Boolean) null, 2, (DefaultConstructorMarker) null), (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C27791b(StringSource stringSource, StringSource stringSource2, StringSource stringSource3, Image image, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringSource, stringSource2, stringSource3, image);
    }

    /* renamed from: a */
    public final StringSource mo67326a() {
        return this.f70892c;
    }

    /* renamed from: b */
    public final Image mo67327b() {
        return this.f70893d;
    }

    /* renamed from: c */
    public final StringSource mo67328c() {
        return this.f70891b;
    }

    /* renamed from: d */
    public final StringSource mo67329d() {
        return this.f70890a;
    }

    private C27791b(StringSource stringSource, StringSource stringSource2, StringSource stringSource3, Image image) {
        this.f70890a = stringSource;
        this.f70891b = stringSource2;
        this.f70892c = stringSource3;
        this.f70893d = image;
    }
}
