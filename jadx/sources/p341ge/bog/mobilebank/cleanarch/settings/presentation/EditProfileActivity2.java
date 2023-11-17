package p341ge.bog.mobilebank.cleanarch.settings.presentation;

import a81.C30772sa;
import ab1.C30965u;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import cb1.C31359a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import i70.C25126a;
import i70.C25127b;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.sso_client.models.C35947l;
import p366bk.C10322k;
import p366bk.C10328q;
import p90.C27264c0;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.settings.presentation.EditProfileActivity2 */
public final class EditProfileActivity2 extends C30772sa implements C31359a {

    /* renamed from: H */
    public static final C22536a f59595H = new C22536a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f59596F = C41219i.m119470b(new C22537b(this));

    /* renamed from: G */
    private final C41217g f59597G = new C1617p0(C41520a0.m120436b(EditProfileViewModel$ViewModel.class), new C22541f(this), new C22540e(this), new C22542g((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.cleanarch.settings.presentation.EditProfileActivity2$a */
    public static final class C22536a {
        private C22536a() {
        }

        public /* synthetic */ C22536a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo55694a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, EditProfileActivity2.class));
        }

        /* renamed from: b */
        public final void mo55695b(Fragment fragment) {
            C41536l.m120489i(fragment, "parent");
            fragment.startActivityForResult(new Intent(fragment.requireContext(), EditProfileActivity2.class), 5544);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.settings.presentation.EditProfileActivity2$b */
    static final class C22537b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ EditProfileActivity2 f59598d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22537b(EditProfileActivity2 editProfileActivity2) {
            super(0);
            this.f59598d = editProfileActivity2;
        }

        /* renamed from: b */
        public final C27264c0 invoke() {
            return C27264c0.m84354d(this.f59598d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.settings.presentation.EditProfileActivity2$c */
    static final class C22538c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditProfileActivity2 f59599d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22538c(EditProfileActivity2 editProfileActivity2) {
            super(1);
            this.f59599d = editProfileActivity2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C1493e0 p = this.f59599d.getSupportFragmentManager().mo4428p();
            int i = C10322k.f28769Me;
            C30965u.C30968b bVar = C30965u.f77105q;
            C41536l.m120488h(bool, "status");
            p.mo4639r(i, bVar.mo71175a(bool.booleanValue()));
            p.mo4515i();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.settings.presentation.EditProfileActivity2$d */
    static final class C22539d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f59600a;

        C22539d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f59600a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f59600a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f59600a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.settings.presentation.EditProfileActivity2$e */
    public static final class C22540e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59601d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22540e(ComponentActivity componentActivity) {
            super(0);
            this.f59601d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f59601d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.settings.presentation.EditProfileActivity2$f */
    public static final class C22541f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59602d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22541f(ComponentActivity componentActivity) {
            super(0);
            this.f59602d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59602d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.settings.presentation.EditProfileActivity2$g */
    public static final class C22542g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59603d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59604e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22542g(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59603d = aVar;
            this.f59604e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59603d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59604e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: G2 */
    private final C27264c0 m73069G2() {
        return (C27264c0) this.f59596F.getValue();
    }

    /* renamed from: H2 */
    private final EditProfileViewModel$ViewModel m73070H2() {
        return (EditProfileViewModel$ViewModel) this.f59597G.getValue();
    }

    /* renamed from: I2 */
    private final void m73071I2() {
        m73070H2().mo55700fw().getHasKycLiveData().mo4819k(this, new C22539d(new C22538c(this)));
    }

    /* renamed from: J2 */
    private final void m73072J2() {
        getSupportFragmentManager().mo4367F1("EditProfileFragment.REQUEST_TAG_EDIT_PROFILE_PICTURE_UPDATED", this, new C25126a(this));
        getSupportFragmentManager().mo4367F1("EditProfileFragment.REQUEST_TAG_KYC_CLICKED", this, new C25127b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public static final void m73073K2(EditProfileActivity2 editProfileActivity2, String str, Bundle bundle) {
        C41536l.m120489i(editProfileActivity2, "this$0");
        C41536l.m120489i(str, "k");
        C41536l.m120489i(bundle, "b");
        Intent intent = new Intent();
        intent.putExtra("PROFILE_UPDATED", bundle.getBoolean("EditProfileFragment.RESULT_TAG_EDIT_PROFILE_PICTURE_UPDATED", false));
        C41238w wVar = C41238w.f97225a;
        editProfileActivity2.setResult(-1, intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public static final void m73074L2(EditProfileActivity2 editProfileActivity2, String str, Bundle bundle) {
        C41536l.m120489i(editProfileActivity2, "this$0");
        C41536l.m120489i(str, "k");
        C41536l.m120489i(bundle, "b");
        C38125h.m112238c(editProfileActivity2).mo91547E0(editProfileActivity2);
    }

    /* renamed from: F */
    public void mo55692F(C35947l.C35949b bVar) {
        C41536l.m120489i(bVar, "error");
        mo74709H1(bVar.mo88517a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m73069G2().mo3946b());
        super.mo37451O1(bundle);
        ToolbarView toolbarView = m73069G2().f68424i.f68494e;
        C41536l.m120488h(toolbarView, "binding.toolbar.toolbarNew");
        ToolbarView.m50857i0(toolbarView, true, false, 2, (Object) null);
        m73071I2();
        m73072J2();
    }

    /* renamed from: i */
    public void mo55693i(boolean z) {
        FrameLayout frameLayout = m73069G2().f68423h;
        C41536l.m120488h(frameLayout, "binding.progressBarContainer");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.header_text_edit_profile);
        C41536l.m120488h(string, "getString(R.string.header_text_edit_profile)");
        return string;
    }
}
