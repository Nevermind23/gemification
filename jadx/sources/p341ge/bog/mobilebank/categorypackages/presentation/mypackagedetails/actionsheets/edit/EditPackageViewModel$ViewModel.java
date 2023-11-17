package p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.C14633b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p428fp.C12949d;
import p428fp.C12950e;
import p428fp.C12951f;
import p441go.C15386k;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.EditPackageViewModel$ViewModel */
public final class EditPackageViewModel$ViewModel extends C21481a implements C12949d, C12950e {

    /* renamed from: d */
    private final C15386k f42552d;

    /* renamed from: e */
    private final C12949d f42553e = this;

    /* renamed from: f */
    private final C12950e f42554f = this;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1644x f42555g = new C1644x();

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.EditPackageViewModel$ViewModel$a */
    static final class C14628a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ EditPackageViewModel$ViewModel f42556d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.EditPackageViewModel$ViewModel$a$a */
        static final class C14629a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ EditPackageViewModel$ViewModel f42557d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14629a(EditPackageViewModel$ViewModel editPackageViewModel$ViewModel) {
                super(2);
                this.f42557d = editPackageViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo41004a(Throwable th, List list) {
                C41536l.m120489i(th, "error");
                this.f42557d.f42555g.mo4823o(new C14633b.C14634a(th));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo41004a((Throwable) obj, (List) obj2);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.EditPackageViewModel$ViewModel$a$b */
        static final class C14630b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ EditPackageViewModel$ViewModel f42558d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14630b(EditPackageViewModel$ViewModel editPackageViewModel$ViewModel) {
                super(1);
                this.f42558d = editPackageViewModel$ViewModel;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: io.b} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: io.b} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: io.b} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: io.b} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo41005a(java.util.List r7) {
                /*
                    r6 = this;
                    java.lang.String r0 = "packages"
                    kotlin.jvm.internal.C41536l.m120489i(r7, r0)
                    java.util.Iterator r0 = r7.iterator()
                L_0x0009:
                    boolean r1 = r0.hasNext()
                    r2 = 0
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L_0x0025
                    java.lang.Object r1 = r0.next()
                    r5 = r1
                    io.b r5 = (p469io.C15709b) r5
                    io.a r5 = r5.mo43078c()
                    if (r5 == 0) goto L_0x0021
                    r5 = r3
                    goto L_0x0022
                L_0x0021:
                    r5 = r4
                L_0x0022:
                    if (r5 == 0) goto L_0x0009
                    goto L_0x0026
                L_0x0025:
                    r1 = r2
                L_0x0026:
                    io.b r1 = (p469io.C15709b) r1
                    if (r1 != 0) goto L_0x002b
                    return
                L_0x002b:
                    java.util.Iterator r7 = r7.iterator()
                L_0x002f:
                    boolean r0 = r7.hasNext()
                    if (r0 == 0) goto L_0x0048
                    java.lang.Object r0 = r7.next()
                    r5 = r0
                    io.b r5 = (p469io.C15709b) r5
                    io.a r5 = r5.mo43095r()
                    if (r5 == 0) goto L_0x0044
                    r5 = r3
                    goto L_0x0045
                L_0x0044:
                    r5 = r4
                L_0x0045:
                    if (r5 == 0) goto L_0x002f
                    r2 = r0
                L_0x0048:
                    io.b r2 = (p469io.C15709b) r2
                    if (r2 != 0) goto L_0x004d
                    goto L_0x004e
                L_0x004d:
                    r3 = r4
                L_0x004e:
                    if (r2 != 0) goto L_0x0061
                    io.a r7 = r1.mo43078c()
                    if (r7 == 0) goto L_0x0071
                    hd0.b r7 = r7.mo43054a()
                    if (r7 == 0) goto L_0x0071
                    boolean r4 = r7.mo63390c()
                    goto L_0x0071
                L_0x0061:
                    io.a r7 = r2.mo43095r()
                    if (r7 == 0) goto L_0x0071
                    hd0.b r7 = r7.mo43054a()
                    if (r7 == 0) goto L_0x0071
                    boolean r4 = r7.mo63390c()
                L_0x0071:
                    ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.EditPackageViewModel$ViewModel r7 = r6.f42558d
                    androidx.lifecycle.x r7 = r7.f42555g
                    ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.b$b r0 = new ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.b$b
                    r0.<init>(r3, r4)
                    r7.mo4823o(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.EditPackageViewModel$ViewModel.C14628a.C14630b.mo41005a(java.util.List):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo41005a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14628a(EditPackageViewModel$ViewModel editPackageViewModel$ViewModel) {
            super(1);
            this.f42556d = editPackageViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo41003a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92644f(aVar, (int[]) null, new C14629a(this.f42556d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C14630b(this.f42556d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41003a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditPackageViewModel$ViewModel(C15386k kVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(kVar, "getPackages");
        this.f42552d = kVar;
        m53927fw();
    }

    /* renamed from: fw */
    private final void m53927fw() {
        C41205b F0 = C32343x.m95453h1(C31270e.m92880i(C15386k.m55854b(this.f42552d, (String) null, false, 3, (Object) null), 1)).mo94981F0(new C12951f(new C14628a(this)));
        C41536l.m120488h(F0, "private fun subscribePac…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m53928gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public LiveData getState() {
        return this.f42555g;
    }
}
