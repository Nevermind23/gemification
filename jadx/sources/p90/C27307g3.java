package p90;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.C1359f;
import androidx.databinding.ViewDataBinding;
import com.github.mikephil.charting.utils.Utils;
import g91.C32303f;
import java.math.BigDecimal;
import l50.C25827g;
import l50.C25828h;
import l50.C25832l;
import p018b0.C2108a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10312a;
import p366bk.C10322k;
import r90.C27950a;

/* renamed from: p90.g3 */
public class C27307g3 extends C27297f3 {

    /* renamed from: V */
    private static final SparseIntArray f68809V;

    /* renamed from: R */
    private final BogTextView f68810R;

    /* renamed from: S */
    private final BogTextView f68811S;

    /* renamed from: T */
    private final BogTextView f68812T;

    /* renamed from: U */
    private long f68813U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f68809V = sparseIntArray;
        sparseIntArray.put(C10322k.details_rename_button, 5);
        sparseIntArray.put(C10322k.details_share_button, 6);
        sparseIntArray.put(C10322k.account_details_moneys_layout, 7);
        sparseIntArray.put(C10322k.account_loan_layout_container, 8);
        sparseIntArray.put(C10322k.account_loan_layout, 9);
        sparseIntArray.put(C10322k.account_deposit_layout_container, 10);
        sparseIntArray.put(C10322k.account_deposit_layout, 11);
        sparseIntArray.put(C10322k.account_overdraft_layout_container, 12);
        sparseIntArray.put(C10322k.account_overdraft_layout, 13);
        sparseIntArray.put(C10322k.account_details_dep_info_container, 14);
        sparseIntArray.put(C10322k.account_details_dep_info, 15);
        sparseIntArray.put(C10322k.account_detailed_recycler_container, 16);
        sparseIntArray.put(C10322k.account_detailed_recycler, 17);
    }

    public C27307g3(C1359f fVar, View view) {
        this(fVar, view, ViewDataBinding.m4667u(fVar, view, 18, (ViewDataBinding.C1353i) null, f68809V));
    }

    /* renamed from: D */
    public void mo66587D(C25832l lVar) {
        this.f68715N = lVar;
        synchronized (this) {
            this.f68813U |= 2;
        }
        mo3956a(C10312a.f28595a);
        super.mo3950x();
    }

    /* renamed from: E */
    public void mo66588E(C25828h hVar) {
        this.f68716O = hVar;
    }

    /* renamed from: F */
    public void mo66589F(String str) {
        this.f68718Q = str;
        synchronized (this) {
            this.f68813U |= 1;
        }
        mo3956a(C10312a.f28598d);
        super.mo3950x();
    }

    /* renamed from: G */
    public void mo66590G(C25827g gVar) {
        this.f68717P = gVar;
        synchronized (this) {
            this.f68813U |= 4;
        }
        mo3956a(C10312a.f28599e);
        super.mo3950x();
    }

    /* renamed from: H */
    public void mo66600H() {
        synchronized (this) {
            this.f68813U = 16;
        }
        mo3950x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo3947k() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        BigDecimal bigDecimal;
        double d;
        synchronized (this) {
            j = this.f68813U;
            this.f68813U = 0;
        }
        String str5 = this.f68718Q;
        C25832l lVar = this.f68715N;
        C25827g gVar = this.f68717P;
        int i = ((21 & j) > 0 ? 1 : ((21 & j) == 0 ? 0 : -1));
        String str6 = null;
        if (i != 0) {
            if (gVar != null) {
                bigDecimal = gVar.mo64487a();
            } else {
                bigDecimal = null;
            }
            if (bigDecimal != null) {
                d = bigDecimal.doubleValue();
            } else {
                d = Utils.DOUBLE_EPSILON;
            }
            str = C32303f.m95204o(d) + str5;
        } else {
            str = null;
        }
        int i2 = ((j & 18) > 0 ? 1 : ((j & 18) == 0 ? 0 : -1));
        if (i2 != 0) {
            if (lVar != null) {
                str4 = lVar.mo64526e();
                str6 = lVar.mo64539p();
                str2 = lVar.mo64528f();
            } else {
                str4 = null;
                str2 = null;
            }
            String c = C27950a.m86286c(str6, false);
            str6 = str4;
            str3 = c;
        } else {
            str3 = null;
            str2 = null;
        }
        if (i2 != 0) {
            C2108a.m8160b(this.f68707F, str6);
            C2108a.m8160b(this.f68810R, str2);
            C2108a.m8160b(this.f68812T, str3);
        }
        if (i != 0) {
            C2108a.m8160b(this.f68811S, str);
        }
    }

    /* renamed from: q */
    public boolean mo3949q() {
        synchronized (this) {
            if (this.f68813U != 0) {
                return true;
            }
            return false;
        }
    }

    private C27307g3(C1359f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, objArr[11], objArr[10], objArr[17], objArr[16], objArr[15], objArr[14], objArr[7], objArr[2], objArr[0], objArr[9], objArr[8], objArr[13], objArr[12], objArr[5], objArr[6]);
        this.f68813U = -1;
        this.f68707F.setTag((Object) null);
        this.f68708G.setTag((Object) null);
        BogTextView bogTextView = objArr[1];
        this.f68810R = bogTextView;
        bogTextView.setTag((Object) null);
        BogTextView bogTextView2 = objArr[3];
        this.f68811S = bogTextView2;
        bogTextView2.setTag((Object) null);
        BogTextView bogTextView3 = objArr[4];
        this.f68812T = bogTextView3;
        bogTextView3.setTag((Object) null);
        mo3945A(view);
        mo66600H();
    }
}
