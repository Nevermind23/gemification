package p569qc;

import androidx.fragment.app.C1519l;
import androidx.fragment.app.Fragment;
import com.identomat.fragments.AgreementFragment;
import com.identomat.fragments.CameraDenyFragment;
import com.identomat.fragments.RetryFragment;
import com.identomat.fragments.StartFragment;
import com.identomat.fragments.call.CallFragment;
import com.identomat.fragments.call.FlowFragment;
import com.identomat.fragments.face_document.FaceDocumentFragment;
import com.identomat.fragments.liveness.LivenessFragment;
import com.identomat.fragments.liveness.MatchPhotoFragment;
import com.identomat.fragments.liveness.cascading.CascadingFragment;
import com.identomat.fragments.scan_document.ScanDocumentFragment;
import com.identomat.fragments.scan_document.UploadDocumentFragment;
import com.identomat.fragments.selectors.DocumentTypesFragment;
import com.identomat.fragments.selectors.UploadTypesFragment;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p345ad.C9786e;
import p345ad.C9793g;
import p359bd.C10229d;
import p359bd.C10232f;
import p359bd.C10235h;
import p359bd.C10238k;
import p359bd.C10240m;
import p650wc.C18493b;
import p678yc.C18877a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: qc.a */
public final class C17481a extends C1519l {

    /* renamed from: b */
    private final C9786e f48916b;

    /* renamed from: c */
    private final C9793g f48917c;

    /* renamed from: d */
    private final C18877a f48918d;

    /* renamed from: qc.a$a */
    static final class C17482a extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C17482a f48919d = new C17482a();

        C17482a() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: qc.a$b */
    static final class C17483b extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C17483b f48920d = new C17483b();

        C17483b() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: qc.a$c */
    static final class C17484c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C17484c f48921d = new C17484c();

        C17484c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo45008a(boolean z) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45008a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    public C17481a(C9786e eVar, C9793g gVar, C18877a aVar) {
        C41536l.m120489i(eVar, "api");
        C41536l.m120489i(gVar, "cascadingSocket");
        C41536l.m120489i(aVar, "identomatConfig");
        this.f48916b = eVar;
        this.f48917c = gVar;
        this.f48918d = aVar;
    }

    /* renamed from: a */
    public Fragment mo4458a(ClassLoader classLoader, String str) {
        C41536l.m120489i(classLoader, "classLoader");
        C41536l.m120489i(str, "className");
        if (C41536l.m120484d(str, StartFragment.class.getName())) {
            return new StartFragment(this.f48918d);
        }
        if (C41536l.m120484d(str, AgreementFragment.class.getName())) {
            return new AgreementFragment(this.f48916b, this.f48918d);
        }
        if (C41536l.m120484d(str, DocumentTypesFragment.class.getName())) {
            return new DocumentTypesFragment(this.f48916b, this.f48918d);
        }
        if (C41536l.m120484d(str, UploadTypesFragment.class.getName())) {
            return new UploadTypesFragment(this.f48916b, this.f48918d);
        }
        if (C41536l.m120484d(str, ScanDocumentFragment.class.getName())) {
            return new ScanDocumentFragment(this.f48916b, this.f48918d);
        }
        if (C41536l.m120484d(str, UploadDocumentFragment.class.getName())) {
            return new UploadDocumentFragment(this.f48916b, this.f48918d);
        }
        if (C41536l.m120484d(str, FaceDocumentFragment.class.getName())) {
            return new FaceDocumentFragment(this.f48916b, this.f48918d);
        }
        if (C41536l.m120484d(str, CameraDenyFragment.class.getName())) {
            return new CameraDenyFragment(this.f48916b, this.f48918d);
        }
        if (C41536l.m120484d(str, RetryFragment.class.getName())) {
            return new RetryFragment(this.f48918d);
        }
        if (C41536l.m120484d(str, LivenessFragment.class.getName())) {
            return new LivenessFragment(this.f48916b, this.f48918d);
        }
        if (C41536l.m120484d(str, MatchPhotoFragment.class.getName())) {
            return new MatchPhotoFragment(this.f48916b, this.f48918d);
        }
        if (C41536l.m120484d(str, CascadingFragment.class.getName())) {
            return new CascadingFragment(this.f48916b, this.f48917c, this.f48918d);
        }
        if (C41536l.m120484d(str, FlowFragment.class.getName())) {
            return new FlowFragment(this.f48916b, this.f48918d);
        }
        if (C41536l.m120484d(str, CallFragment.class.getName())) {
            return new CallFragment(this.f48916b, this.f48918d);
        }
        if (C41536l.m120484d(str, C10232f.class.getName())) {
            return new C10232f(this.f48918d);
        }
        if (C41536l.m120484d(str, C10229d.class.getName())) {
            return new C10229d(this.f48918d);
        }
        if (C41536l.m120484d(str, C10235h.class.getName())) {
            return new C10235h(this.f48918d, C17482a.f48919d);
        }
        if (C41536l.m120484d(str, C10240m.class.getName())) {
            return new C10240m(this.f48918d, C17483b.f48920d);
        }
        if (C41536l.m120484d(str, C10238k.class.getName())) {
            return new C10238k(this.f48918d, C17484c.f48921d);
        }
        if (C41536l.m120484d(str, C18493b.class.getName())) {
            return new C18493b(this.f48918d);
        }
        Fragment a = super.mo4458a(classLoader, str);
        C41536l.m120488h(a, "super.instantiate(classLoader, className)");
        return a;
    }
}
