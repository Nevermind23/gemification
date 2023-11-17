package p341ge.bog.mobilebank.cleanarch.settings.presentation;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import i70.C25128c;
import i70.C25129d;
import i70.C25130e;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p742dy.C20108a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.settings.presentation.EditProfileViewModel$ViewModel */
public final class EditProfileViewModel$ViewModel extends C21481a implements C25128c, C25129d {

    /* renamed from: d */
    private final C25128c f59605d = this;

    /* renamed from: e */
    private final C25129d f59606e = this;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1644x f59607f = new C1644x(Boolean.FALSE);

    /* renamed from: ge.bog.mobilebank.cleanarch.settings.presentation.EditProfileViewModel$ViewModel$a */
    static final class C22543a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditProfileViewModel$ViewModel f59608d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22543a(EditProfileViewModel$ViewModel editProfileViewModel$ViewModel) {
            super(1);
            this.f59608d = editProfileViewModel$ViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            this.f59608d.f59607f.mo4826r(bool);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditProfileViewModel$ViewModel(C20108a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "checkKycStatusUseCase");
        C41205b F0 = C32343x.m95413R0(aVar.mo48539a()).mo94981F0(new C25130e(new C22543a(this)));
        C41536l.m120488h(F0, "checkKycStatusUseCase()\n… status\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$0(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: fw */
    public final C25129d mo55700fw() {
        return this.f59606e;
    }

    public LiveData getHasKycLiveData() {
        return this.f59607f;
    }
}
