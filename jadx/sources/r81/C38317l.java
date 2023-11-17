package r81;

import android.os.Bundle;
import android.view.View;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1806i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g81.C32146e0;
import g91.C32319m;
import j81.C36771m;
import java.util.Date;
import jg1.C41452l;
import p341ge.bog.mobilebank.eventbus.events.ScoolCardStatementEvent;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: r81.l */
public class C38317l extends C35651n1 implements C36771m {

    /* renamed from: g */
    private static String f91830g = "CHILD_CLIENT_KEY";

    /* renamed from: d */
    private RecyclerView f91831d;

    /* renamed from: e */
    private C32146e0 f91832e;

    /* renamed from: f */
    private long f91833f = -1;

    /* renamed from: i1 */
    private void m112602i1() {
        if (getView() != null && this.f91833f != -1) {
            this.f91832e.mo72666n();
            Date date = new Date();
            this.mBankApiManager.getScoolCardStatement(this.f91833f, C32319m.m95290J(date, -90).getTime(), date.getTime(), (Integer) null, (Integer) null);
        }
    }

    /* renamed from: j1 */
    public static C38317l m112603j1(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong(f91830g, j);
        C38317l lVar = new C38317l();
        lVar.setArguments(bundle);
        return lVar;
    }

    /* renamed from: k0 */
    public void mo89649k0() {
        m112602i1();
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_scool_last_operations;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mEventBus.mo96185q(this);
        this.f91833f = getArguments().getLong(f91830g, -1);
    }

    public void onDestroy() {
        super.onDestroy();
        this.mEventBus.mo96186s(this);
    }

    @C41452l
    public void onScoolCardStatementEvent(ScoolCardStatementEvent scoolCardStatementEvent) {
        if (scoolCardStatementEvent.getChildClientKey() == this.f91833f) {
            this.f91832e.mo72663i();
            int state = scoolCardStatementEvent.getState();
            if (state == 20) {
                this.f91832e.mo72660p(scoolCardStatementEvent.getStatementItemList());
            } else if (state == 30 || state == 40) {
                this.f91832e.mo72667o();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C10322k.f28712Br);
        this.f91831d = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        C1806i iVar = new C1806i(getContext(), 1);
        iVar.mo5985l(C0767a.m2895e(getContext(), C10320i.divider2));
        this.f91831d.mo5351j(iVar);
        C32146e0 e0Var = new C32146e0();
        this.f91832e = e0Var;
        e0Var.mo72665m(this);
        this.f91831d.setAdapter(this.f91832e);
        m112602i1();
    }
}
