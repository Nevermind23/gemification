package p341ge.bog.mobilebank.settings.presentation.viewmodel;

import androidx.appcompat.app.C0238h;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import g91.C32316l;
import hd1.C41204a;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m11.C37196a;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.rest.model.DarkModeType;
import p380ck.C10463g;
import q11.C38102b;
import q11.C38108h;
import w11.C39505e;
import w11.C39506f;

/* renamed from: ge.bog.mobilebank.settings.presentation.viewmodel.DarkModeSwitchViewModel$ViewModel */
public final class DarkModeSwitchViewModel$ViewModel extends C21481a implements C39505e, C39506f {

    /* renamed from: d */
    private final C38108h f83635d;

    /* renamed from: e */
    private final C38102b f83636e;

    /* renamed from: f */
    private final C39505e f83637f = this;

    /* renamed from: g */
    private final C39506f f83638g = this;

    /* renamed from: h */
    private DarkModeType f83639h;

    /* renamed from: i */
    private final C1644x f83640i;

    /* renamed from: j */
    private final C1644x f83641j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DarkModeSwitchViewModel$ViewModel(C38108h hVar, C38102b bVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(hVar, "updateDarkModeType");
        C41536l.m120489i(bVar, "getDarkMode");
        this.f83635d = hVar;
        this.f83636e = bVar;
        this.f83639h = bVar.mo91528a();
        this.f83640i = new C1644x(this.f83639h);
        this.f83641j = new C1644x();
    }

    /* renamed from: Ag */
    public void mo84135Ag(DarkModeType darkModeType) {
        C41536l.m120489i(darkModeType, "mode");
        this.f83639h = darkModeType;
        this.f83640i.mo4823o(darkModeType);
        C37224b.m109965d(this.f83641j, Boolean.FALSE);
        this.f83635d.mo91533b(darkModeType);
        C37196a.C37197a aVar = new C37196a.C37197a(C32316l.m95279b(darkModeType));
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32316l.m95278a(aVar, F);
        C0238h.m789O(darkModeType.getValue());
    }

    /* renamed from: R */
    public LiveData mo84136R() {
        return this.f83641j;
    }

    /* renamed from: dw */
    public final C39505e mo84137dw() {
        return this.f83637f;
    }

    /* renamed from: ew */
    public final C39506f mo84138ew() {
        return this.f83638g;
    }

    /* renamed from: mn */
    public LiveData mo84139mn() {
        return this.f83640i;
    }
}
