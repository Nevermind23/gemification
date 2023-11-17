package dj0;

import bj0.C19391a;
import cj0.C19763b;
import he1.C41238w;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mj0.C26238b;
import p341ge.bog.designsystem.components.header.statementheader.StatementHeaderView;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import th0.C28413m0;
import ue1.C43064a;

/* renamed from: dj0.c */
public final class C20027c extends C26238b {

    /* renamed from: g */
    public static final C20028a f54621g = new C20028a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final C19391a f54622f;

    /* renamed from: dj0.c$a */
    public static final class C20028a {
        private C20028a() {
        }

        public /* synthetic */ C20028a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: dj0.c$b */
    /* synthetic */ class C20029b extends C41535k implements C43064a {
        C20029b(Object obj) {
            super(0, obj, C19391a.class, "sendLink", "sendLink()V", 0);
        }

        /* renamed from: b */
        public final void mo48400b() {
            ((C19391a) this.receiver).mo47611f3();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo48400b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: dj0.c$c */
    /* synthetic */ class C20030c extends C41535k implements C43064a {
        C20030c(Object obj) {
            super(0, obj, C19391a.class, "openGiftCardSheet", "openGiftCardSheet()V", 0);
        }

        /* renamed from: b */
        public final void mo48401b() {
            ((C19391a) this.receiver).mo47612g3();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo48401b();
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20027c(C28413m0 m0Var, C19391a aVar) {
        super(m0Var);
        C41536l.m120489i(m0Var, "binding");
        C41536l.m120489i(aVar, "listener");
        this.f54622f = aVar;
        StatementHeaderView statementHeaderView = m0Var.f72145e;
        statementHeaderView.setIncludeTopSpacing(false);
        statementHeaderView.setInfoBadgeVisible(true);
    }

    /* renamed from: m */
    public void mo48397j(C19763b bVar) {
        C41536l.m120489i(bVar, "item");
        StatementHeaderView statementHeaderView = ((C28413m0) mo65241h()).f72145e;
        super.mo48397j(bVar);
        statementHeaderView.setTitle(bVar.mo48002i());
        statementHeaderView.setSubtitle(bVar.mo47999g());
        statementHeaderView.setText(bVar.mo48000h());
        InfoBadgeView.m50233e(statementHeaderView.getInfoBadgeView(), bVar.mo47992a(), (String) null, (String) null, 6, (Object) null);
        statementHeaderView.getInfoBadgeView().setType(bVar.mo47993b());
        statementHeaderView.mo35785f();
        statementHeaderView.mo35783b(bVar.mo47998f(), bVar.mo47996e(), 3, new C20029b(this.f54622f));
        statementHeaderView.mo35783b(bVar.mo47994c(), bVar.mo47995d(), 3, new C20030c(this.f54622f));
    }
}
