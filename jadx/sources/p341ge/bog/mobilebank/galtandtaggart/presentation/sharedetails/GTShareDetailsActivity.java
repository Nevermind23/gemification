package p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0767a;
import androidx.core.graphics.drawable.C0836a;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b41.C31128a;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.utils.Utils;
import g91.C32290b1;
import g91.C32335t0;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import ie0.C25182b;
import ie0.C25185e;
import ie0.C25187g;
import ie0.C25189i;
import ie0.C25190j;
import if0.C25192a;
import java.math.BigDecimal;
import java.util.List;
import kg0.C25725b;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg0.C25975a;
import lg0.C25977b;
import lg0.C25979c;
import lg0.C25981d;
import lg0.C25983e;
import lg0.C25985f;
import lg0.C25987g;
import lg0.C25989h;
import lg0.C25991i;
import lg0.C25993j;
import lg0.C25994k;
import lg0.C25995l;
import lg0.C25996m;
import lg0.C25997n;
import lg0.C25998o;
import lg0.C25999p;
import lg0.C26000q;
import lg0.C26001r;
import lg0.C26002s;
import lg0.C26003t;
import lg0.C26004u;
import lg0.C26007x;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.productheader.NewProductHeaderView;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.galtandtaggart.data.model.ShareStatus;
import p341ge.bog.mobilebank.galtandtaggart.domain.model.WatchList;
import p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.C23824d;
import p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareViewModel;
import p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeDetailsActivity;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p394dj.C12132a;
import p394dj.C12138g;
import p394dj.C12139h;
import p420fh.C12902d;
import p434gh.C15278a;
import p617ti.C17966a;
import p642vh.C18368l;
import p748eu.C20292b;
import p758fu.C20557a;
import ue0.C28722e0;
import ue1.C43064a;
import ue1.C43075l;
import ug0.C28775a;
import ug0.C28786c;
import wg0.C29372b;
import xe0.C29747e;
import xe0.C29755m;
import xe0.C29759q;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity */
public final class GTShareDetailsActivity extends C23838e implements C28775a, C23824d.C23825a.C23826a, C29372b.C29374b {

    /* renamed from: N */
    public static final C23777a f61877N = new C23777a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C20292b f61878G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C28722e0 f61879H;

    /* renamed from: I */
    private final C41217g f61880I = C41219i.m119470b(new C23796s(this));
    /* access modifiers changed from: private */

    /* renamed from: J */
    public String f61881J;

    /* renamed from: K */
    private final C41217g f61882K = new C1617p0(C41520a0.m120436b(GTShareViewModel.ViewModel.class), new C23798u(this), new C23797t(this), new C23799v((C43064a) null, this));

    /* renamed from: L */
    private final C28775a.C28776a f61883L = new C28775a.C28776a((List) null, (List) null, (List) null, false, (Context) null, (LineChart) null, (String) null, C11051p3.f31760d, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: M */
    public List f61884M = C41341q.m119907j();

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$a */
    public static final class C23777a {
        private C23777a() {
        }

        public /* synthetic */ C23777a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo60709a(String str, Context context) {
            C41536l.m120489i(str, "symbol");
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, GTShareDetailsActivity.class);
            intent.putExtra("SHARE_SYMBOL", str);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$b */
    static final class C23778b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareDetailsActivity f61885d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23778b(GTShareDetailsActivity gTShareDetailsActivity) {
            super(1);
            this.f61885d = gTShareDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60710a(String str) {
            C28722e0 a3 = this.f61885d.f61879H;
            if (a3 == null) {
                C41536l.m120506z("binding");
                a3 = null;
            }
            a3.f73191e.setText(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60710a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$c */
    static final class C23779c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareDetailsActivity f61886d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23779c(GTShareDetailsActivity gTShareDetailsActivity) {
            super(1);
            this.f61886d = gTShareDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60711a(C41224m mVar) {
            C29747e eVar = (C29747e) mVar.mo95675a();
            String str = (String) mVar.mo95676b();
            C28722e0 a3 = this.f61886d.f61879H;
            if (a3 == null) {
                C41536l.m120506z("binding");
                a3 = null;
            }
            a3.f73208v.setText(C28786c.m88251g(eVar.mo69778c()));
            a3.f73192f.setText(C32343x.m95408P(eVar.mo69776a(), str));
            a3.f73188I.setText(C32343x.m95408P(eVar.mo69779d(), str));
            a3.f73206t.setText(C32343x.m95408P(eVar.mo69777b(), str));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60711a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$d */
    static final class C23780d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareDetailsActivity f61887d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23780d(GTShareDetailsActivity gTShareDetailsActivity) {
            super(1);
            this.f61887d = gTShareDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60712a(C29755m mVar) {
            C28722e0 a3 = this.f61887d.f61879H;
            if (a3 == null) {
                C41536l.m120506z("binding");
                a3 = null;
            }
            a3.f73201o.f73173i.setText(mVar.mo69850j());
            a3.f73201o.f73176l.setText(mVar.mo69853m());
            a3.f73209w.f73173i.setText(mVar.mo69851k());
            a3.f73209w.f73176l.setText(mVar.mo69847h());
            a3.f73182C.f73173i.setText(mVar.mo69843e());
            a3.f73182C.f73176l.setText(mVar.mo69852l());
            a3.f73202p.f73173i.setText(mVar.mo69841c());
            a3.f73202p.f73176l.setText(mVar.mo69842d());
            a3.f73200n.f73173i.setText(mVar.mo69839a());
            a3.f73200n.f73176l.setText(mVar.mo69846g());
            a3.f73211y.f73173i.setText(mVar.mo69845f());
            a3.f73211y.f73176l.setText(mVar.mo69840b());
            a3.f73210x.f73173i.setText(mVar.mo69849i());
            a3.f73210x.f73176l.setText(mVar.mo69854n());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60712a((C29755m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$e */
    static final class C23781e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareDetailsActivity f61888d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23781e(GTShareDetailsActivity gTShareDetailsActivity) {
            super(1);
            this.f61888d = gTShareDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C28722e0 a3 = this.f61888d.f61879H;
            if (a3 == null) {
                C41536l.m120506z("binding");
                a3 = null;
            }
            LayerView layerView = a3.f73212z;
            C41536l.m120488h(layerView, "binding.statisticsContainer");
            C41536l.m120488h(bool, "isVisible");
            C32343x.m95483r1(layerView, bool.booleanValue(), false, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$f */
    static final class C23782f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareDetailsActivity f61889d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$f$a */
        public /* synthetic */ class C23783a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f61890a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    ge.bog.mobilebank.galtandtaggart.data.model.ShareStatus[] r0 = p341ge.bog.mobilebank.galtandtaggart.data.model.ShareStatus.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    ge.bog.mobilebank.galtandtaggart.data.model.ShareStatus r1 = p341ge.bog.mobilebank.galtandtaggart.data.model.ShareStatus.HALTED     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    ge.bog.mobilebank.galtandtaggart.data.model.ShareStatus r1 = p341ge.bog.mobilebank.galtandtaggart.data.model.ShareStatus.CLOSE_ONLY     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    ge.bog.mobilebank.galtandtaggart.data.model.ShareStatus r1 = p341ge.bog.mobilebank.galtandtaggart.data.model.ShareStatus.INACTIVE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f61890a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity.C23782f.C23783a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23782f(GTShareDetailsActivity gTShareDetailsActivity) {
            super(1);
            this.f61889d = gTShareDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60714a(ShareStatus shareStatus) {
            int i;
            if (shareStatus == null) {
                i = -1;
            } else {
                i = C23783a.f61890a[shareStatus.ordinal()];
            }
            if (i == 1) {
                this.f61889d.m76839w3();
            } else if (i == 2) {
                this.f61889d.m76838v3();
            } else if (i != 3) {
                this.f61889d.m76835s3();
            } else {
                this.f61889d.m76840x3();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60714a((ShareStatus) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$g */
    static final class C23784g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareDetailsActivity f61891d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23784g(GTShareDetailsActivity gTShareDetailsActivity) {
            super(1);
            this.f61891d = gTShareDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            if (C41536l.m120484d(bool, Boolean.TRUE)) {
                this.f61891d.m76836t3();
            } else {
                this.f61891d.m76841y3();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$h */
    static final class C23785h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareDetailsActivity f61892d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23785h(GTShareDetailsActivity gTShareDetailsActivity) {
            super(1);
            this.f61892d = gTShareDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60716a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                GTShareDetailsActivity gTShareDetailsActivity = this.f61892d;
                String string = gTShareDetailsActivity.getString(C25190j.gt_watchlist_change_symbol_success_message);
                C41536l.m120488h(string, "getString(R.string.gt_wa…e_symbol_success_message)");
                gTShareDetailsActivity.mo60706K(string, C15278a.POSITIVE);
            } else if (aVar instanceof C31128a.C31129a) {
                GTShareDetailsActivity gTShareDetailsActivity2 = this.f61892d;
                String string2 = gTShareDetailsActivity2.getString(C25190j.gt_watchlist_change_symbol_failure_message);
                C41536l.m120488h(string2, "getString(R.string.gt_wa…e_symbol_failure_message)");
                gTShareDetailsActivity2.mo60706K(string2, C15278a.NEGATIVE);
                this.f61892d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            } else {
                boolean z = aVar instanceof C31128a.C31130b;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60716a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$i */
    static final class C23786i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareDetailsActivity f61893d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23786i(GTShareDetailsActivity gTShareDetailsActivity) {
            super(1);
            this.f61893d = gTShareDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60717a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                C31128a.C31131c cVar = (C31128a.C31131c) aVar;
                int size = ((List) cVar.mo71340a()).size();
                if (size == 0) {
                    this.f61893d.m76830m3();
                } else if (size != 1) {
                    this.f61893d.m76820d4((List) cVar.mo71340a());
                } else {
                    this.f61893d.m76822e4((WatchList) C41358y.m120009Y((List) cVar.mo71340a()));
                }
            } else if (aVar instanceof C31128a.C31129a) {
                this.f61893d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            } else {
                boolean z = aVar instanceof C31128a.C31130b;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60717a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$j */
    static final class C23787j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareDetailsActivity f61894d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23787j(GTShareDetailsActivity gTShareDetailsActivity) {
            super(1);
            this.f61894d = gTShareDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60718a(List list) {
            GTShareDetailsActivity gTShareDetailsActivity = this.f61894d;
            C41536l.m120488h(list, "shareWatchLists");
            gTShareDetailsActivity.f61884M = list;
            this.f61894d.invalidateOptionsMenu();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60718a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$k */
    static final class C23788k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareDetailsActivity f61895d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23788k(GTShareDetailsActivity gTShareDetailsActivity) {
            super(1);
            this.f61895d = gTShareDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60719a(List list) {
            GTShareDetailsActivity gTShareDetailsActivity = this.f61895d;
            C41536l.m120488h(list, "result");
            gTShareDetailsActivity.mo60705G3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60719a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$l */
    static final class C23789l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareDetailsActivity f61896d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23789l(GTShareDetailsActivity gTShareDetailsActivity) {
            super(1);
            this.f61896d = gTShareDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C28722e0 a3 = this.f61896d.f61879H;
            if (a3 == null) {
                C41536l.m120506z("binding");
                a3 = null;
            }
            FrameLayout frameLayout = a3.f73196j.f73121g;
            C41536l.m120488h(frameLayout, "binding.chartContainer.loaderView");
            C41536l.m120488h(bool, "loading");
            C32343x.m95483r1(frameLayout, bool.booleanValue(), false, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$m */
    static final class C23790m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareDetailsActivity f61897d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23790m(GTShareDetailsActivity gTShareDetailsActivity) {
            super(1);
            this.f61897d = gTShareDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60721a(Integer num) {
            C28722e0 a3 = this.f61897d.f61879H;
            if (a3 == null) {
                C41536l.m120506z("binding");
                a3 = null;
            }
            SwipeRefreshLayout swipeRefreshLayout = a3.f73180A;
            C41536l.m120488h(num, "count");
            swipeRefreshLayout.setRefreshing(num.intValue() > 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60721a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$n */
    static final class C23791n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareDetailsActivity f61898d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23791n(GTShareDetailsActivity gTShareDetailsActivity) {
            super(1);
            this.f61898d = gTShareDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60722a(C41224m mVar) {
            boolean booleanValue = ((Boolean) mVar.mo95675a()).booleanValue();
            boolean booleanValue2 = ((Boolean) mVar.mo95676b()).booleanValue();
            C28722e0 a3 = this.f61898d.f61879H;
            if (a3 == null) {
                C41536l.m120506z("binding");
                a3 = null;
            }
            Button button = a3.f73193g;
            C41536l.m120488h(button, "buttonBuy");
            C32343x.m95483r1(button, booleanValue, false, 2, (Object) null);
            Button button2 = a3.f73194h;
            C41536l.m120488h(button2, "buttonSell");
            C32343x.m95483r1(button2, booleanValue2, false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60722a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$o */
    static final class C23792o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareDetailsActivity f61899d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23792o(GTShareDetailsActivity gTShareDetailsActivity) {
            super(1);
            this.f61899d = gTShareDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C28722e0 a3 = this.f61899d.f61879H;
            if (a3 == null) {
                C41536l.m120506z("binding");
                a3 = null;
            }
            LayerView layerView = a3.f73197k;
            C41536l.m120488h(layerView, "binding.clientPosContainer");
            C41536l.m120488h(bool, "visible");
            C32343x.m95483r1(layerView, bool.booleanValue(), false, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$p */
    static final class C23793p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTShareDetailsActivity f61900d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23793p(GTShareDetailsActivity gTShareDetailsActivity) {
            super(1);
            this.f61900d = gTShareDetailsActivity;
        }

        /* renamed from: a */
        public final void mo60724a(C31128a aVar) {
            C12139h hVar;
            C28722e0 e0Var;
            C28722e0 e0Var2;
            C28722e0 e0Var3;
            C31128a aVar2 = aVar;
            if (aVar2 instanceof C31128a.C31129a) {
                this.f61900d.mo74709H1(((C31128a.C31129a) aVar2).mo71342c());
                C28722e0 a3 = this.f61900d.f61879H;
                if (a3 == null) {
                    C41536l.m120506z("binding");
                    e0Var3 = null;
                } else {
                    e0Var3 = a3;
                }
                e0Var3.f73205s.mo53595c();
            } else if (aVar2 instanceof C31128a.C31130b) {
                if (aVar.mo71341b() == 1) {
                    C28722e0 a32 = this.f61900d.f61879H;
                    if (a32 == null) {
                        C41536l.m120506z("binding");
                        e0Var2 = null;
                    } else {
                        e0Var2 = a32;
                    }
                    e0Var2.f73205s.mo53597e();
                }
            } else if (aVar2 instanceof C31128a.C31131c) {
                C31128a.C31131c cVar = (C31128a.C31131c) aVar2;
                this.f61900d.f61881J = ((C26007x) cVar.mo71340a()).mo64894c();
                C28722e0 a33 = this.f61900d.f61879H;
                if (a33 == null) {
                    C41536l.m120506z("binding");
                    a33 = null;
                }
                NewProductHeaderView newProductHeaderView = a33.f73198l;
                String c = ((C26007x) cVar.mo71340a()).mo64894c();
                List a = ((C26007x) cVar.mo71340a()).mo64892a();
                String string = this.f61900d.getString(C25190j.gt_share_details_card_profit_title);
                String f = C28786c.m88250f(((C26007x) cVar.mo71340a()).mo64895d());
                BigDecimal d = ((C26007x) cVar.mo71340a()).mo64895d();
                BigDecimal valueOf = BigDecimal.valueOf(0);
                C41536l.m120488h(valueOf, "valueOf(this.toLong())");
                if (d.compareTo(valueOf) > 0) {
                    hVar = C12139h.POSITIVE;
                } else {
                    BigDecimal d2 = ((C26007x) cVar.mo71340a()).mo64895d();
                    BigDecimal valueOf2 = BigDecimal.valueOf(0);
                    C41536l.m120488h(valueOf2, "valueOf(this.toLong())");
                    if (d2.compareTo(valueOf2) < 0) {
                        hVar = C12139h.NEGATIVE;
                    } else {
                        hVar = C12139h.NEUTRAL;
                    }
                }
                newProductHeaderView.setData(new C12132a(c, a, (List) null, (TextProgressBarView.ProgressModel) null, new C12138g(false, string, (CharSequence) null, f, hVar, false, (C43064a) null, 101, (DefaultConstructorMarker) null), false, false, 76, (DefaultConstructorMarker) null));
                C28722e0 a34 = this.f61900d.f61879H;
                if (a34 == null) {
                    C41536l.m120506z("binding");
                    a34 = null;
                }
                a34.f73198l.setCircularImageDrawable(C32290b1.m95123m(C0767a.m2895e(this.f61900d, C25185e.icons_16_payment_transfer_transfer_treasury), C32335t0.m95357b()));
                C28722e0 a35 = this.f61900d.f61879H;
                if (a35 == null) {
                    C41536l.m120506z("binding");
                    a35 = null;
                }
                NewProductHeaderView newProductHeaderView2 = a35.f73198l;
                String b = ((C26007x) cVar.mo71340a()).mo64893b();
                if (b == null) {
                    b = "";
                }
                newProductHeaderView2.setCircularImageUrl(b);
                C28722e0 a36 = this.f61900d.f61879H;
                if (a36 == null) {
                    C41536l.m120506z("binding");
                    e0Var = null;
                } else {
                    e0Var = a36;
                }
                e0Var.f73205s.mo53595c();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60724a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$q */
    static final class C23794q implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f61901a;

        C23794q(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f61901a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f61901a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f61901a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$r */
    public static final class C23795r implements Runnable {

        /* renamed from: d */
        final /* synthetic */ GTShareDetailsActivity f61902d;

        /* renamed from: e */
        final /* synthetic */ Handler f61903e;

        /* renamed from: f */
        final /* synthetic */ long f61904f;

        C23795r(GTShareDetailsActivity gTShareDetailsActivity, Handler handler, long j) {
            this.f61902d = gTShareDetailsActivity;
            this.f61903e = handler;
            this.f61904f = j;
        }

        public void run() {
            C28722e0 a3 = this.f61902d.f61879H;
            if (a3 == null) {
                C41536l.m120506z("binding");
                a3 = null;
            }
            if (!a3.f73180A.mo6147i()) {
                this.f61902d.m76769D3(true);
            }
            this.f61903e.postDelayed(this, this.f61904f);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$s */
    static final class C23796s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTShareDetailsActivity f61905d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23796s(GTShareDetailsActivity gTShareDetailsActivity) {
            super(0);
            this.f61905d = gTShareDetailsActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getStringExtra("SHARE_SYMBOL");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r2 = this;
                ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity r0 = r2.f61905d
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x0010
                java.lang.String r1 = "SHARE_SYMBOL"
                java.lang.String r0 = r0.getStringExtra(r1)
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r0 = ""
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity.C23796s.invoke():java.lang.String");
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$t */
    public static final class C23797t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61906d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23797t(ComponentActivity componentActivity) {
            super(0);
            this.f61906d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61906d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$u */
    public static final class C23798u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61907d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23798u(ComponentActivity componentActivity) {
            super(0);
            this.f61907d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61907d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.GTShareDetailsActivity$v */
    public static final class C23799v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61908d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f61909e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23799v(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f61908d = aVar;
            this.f61909e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61908d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61909e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    public GTShareDetailsActivity() {
    }

    /* renamed from: B3 */
    private final void m76767B3() {
        m76834r3().mo60739Iw().mo60728Au().mo4819k(this, new C23794q(new C23785h(this)));
        m76834r3().mo60747Ow().mo4819k(this, new C23794q(new C23786i(this)));
        m76834r3().mo60743Lw().mo4819k(this, new C23794q(new C23787j(this)));
        m76834r3().mo60739Iw().mo60755jp().mo4819k(this, new C23794q(new C23788k(this)));
        m76834r3().mo60739Iw().mo60751Wn().mo4819k(this, new C23794q(new C23789l(this)));
        m76834r3().mo60739Iw().mo60761yd().mo4819k(this, new C23794q(new C23790m(this)));
        m76834r3().mo60739Iw().mo60752hn().mo4819k(this, new C23794q(new C23791n(this)));
        m76834r3().mo60739Iw().mo60735G9().mo4819k(this, new C23794q(new C23792o(this)));
        m76834r3().mo60739Iw().mo60756l0().mo4819k(this, new C23794q(new C23793p(this)));
        m76834r3().mo60739Iw().mo60759w9().mo4819k(this, new C23794q(new C23778b(this)));
        m76834r3().mo60739Iw().mo60757l9().mo4819k(this, new C23794q(new C23779c(this)));
        m76834r3().mo60739Iw().mo60737Ha().mo4819k(this, new C23794q(new C23780d(this)));
        m76834r3().mo60739Iw().mo60754ji().mo4819k(this, new C23794q(new C23781e(this)));
        m76834r3().mo60739Iw().mo60758lq().mo4819k(this, new C23794q(new C23782f(this)));
        m76834r3().mo60739Iw().mo60760x5().mo4819k(this, new C23794q(new C23784g(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public static final void m76768C3(GTShareDetailsActivity gTShareDetailsActivity) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        C28722e0 e0Var = gTShareDetailsActivity.f61879H;
        if (e0Var == null) {
            C41536l.m120506z("binding");
            e0Var = null;
        }
        e0Var.f73196j.f73125k.mo35182m(0, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public final void m76769D3(boolean z) {
        C28722e0 e0Var = this.f61879H;
        if (e0Var == null) {
            C41536l.m120506z("binding");
            e0Var = null;
        }
        e0Var.f73180A.setRefreshing(true);
        m76834r3().mo60749Qw(m76832p3(), 2);
        if (!z) {
            m76833q3(mo60603H0().mo68507f(), 2);
        }
    }

    /* renamed from: E3 */
    private final void m76771E3(boolean z) {
        C28722e0 e0Var = this.f61879H;
        if (e0Var == null) {
            C41536l.m120506z("binding");
            e0Var = null;
        }
        e0Var.f73193g.setEnabled(z);
    }

    /* renamed from: F3 */
    private final void m76773F3(View.OnClickListener onClickListener, View... viewArr) {
        for (View onClickListener2 : viewArr) {
            onClickListener2.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: H3 */
    private final void m76776H3() {
        double d;
        Double c;
        C20557a b = mo60707o3().mo48775b("GTT_SYMBOL_DATA_AUTO_REFRESH");
        if (b == null || (c = b.mo49086c()) == null) {
            d = 30.0d;
        } else {
            d = c.doubleValue();
        }
        long j = ((long) d) * ((long) 1000);
        new Handler(Looper.getMainLooper()).postDelayed(new C23795r(this, new Handler(Looper.getMainLooper()), j), j);
    }

    /* renamed from: I3 */
    private final void m76778I3(boolean z) {
        C28722e0 e0Var = this.f61879H;
        if (e0Var == null) {
            C41536l.m120506z("binding");
            e0Var = null;
        }
        e0Var.f73194h.setEnabled(z);
    }

    /* renamed from: J3 */
    private final void m76780J3() {
        C28722e0 e0Var = this.f61879H;
        if (e0Var == null) {
            C41536l.m120506z("binding");
            e0Var = null;
        }
        e0Var.f73196j.f73125k.setOnChipActivatedChangedListener(new C25995l(this));
        LineChart lineChart = e0Var.f73196j.f73120f;
        C41536l.m120488h(lineChart, "chartContainer.chartView");
        mo60703A3(true, lineChart, this);
        e0Var.f73180A.setOnRefreshListener(new C25977b(this));
        e0Var.f73198l.setData(new C12132a("", C41339p.m119900e(new C17966a(Utils.DOUBLE_EPSILON, "")), (List) null, (TextProgressBarView.ProgressModel) null, new C12138g(false, getString(C25190j.gt_share_details_card_profit_title), (CharSequence) null, BankApiResponse.SUCCESSFUL_RESPONSE_CODE, C12139h.NEUTRAL, false, (C43064a) null, 101, (DefaultConstructorMarker) null), false, false, 76, (DefaultConstructorMarker) null));
        e0Var.f73193g.setEnabled(false);
        e0Var.f73193g.setBackgroundResource(C25185e.selector_gt_buy_button);
        e0Var.f73193g.setOnClickListener(new C25979c(this));
        e0Var.f73194h.setEnabled(false);
        e0Var.f73194h.setBackgroundResource(C25185e.selector_gt_sell_button);
        e0Var.f73194h.setOnClickListener(new C25981d(this));
        e0Var.f73201o.f73172h.setText(getString(C25190j.gt_share_details_statistics_title_market_cap));
        C25983e eVar = new C25983e(this);
        AppCompatImageView appCompatImageView = e0Var.f73201o.f73171g;
        C41536l.m120488h(appCompatImageView, "firsContainer.leftItemInfoButton");
        TextView textView = e0Var.f73201o.f73172h;
        C41536l.m120488h(textView, "firsContainer.leftItemTitle");
        TextView textView2 = e0Var.f73201o.f73173i;
        C41536l.m120488h(textView2, "firsContainer.leftItemValue");
        m76773F3(eVar, appCompatImageView, textView, textView2);
        e0Var.f73201o.f73175k.setText(getString(C25190j.gt_share_details_statistics_title_pe_ratio));
        C25985f fVar = new C25985f(this);
        AppCompatImageView appCompatImageView2 = e0Var.f73201o.f73174j;
        C41536l.m120488h(appCompatImageView2, "firsContainer.rightItemInfoButton");
        TextView textView3 = e0Var.f73201o.f73175k;
        C41536l.m120488h(textView3, "firsContainer.rightItemTitle");
        TextView textView4 = e0Var.f73201o.f73176l;
        C41536l.m120488h(textView4, "firsContainer.rightItemValue");
        m76773F3(fVar, appCompatImageView2, textView3, textView4);
        e0Var.f73209w.f73172h.setText(getString(C25190j.gt_share_details_statistics_title_open_price));
        C25987g gVar = new C25987g(this);
        AppCompatImageView appCompatImageView3 = e0Var.f73209w.f73171g;
        C41536l.m120488h(appCompatImageView3, "secondContainer.leftItemInfoButton");
        TextView textView5 = e0Var.f73209w.f73172h;
        C41536l.m120488h(textView5, "secondContainer.leftItemTitle");
        TextView textView6 = e0Var.f73209w.f73173i;
        C41536l.m120488h(textView6, "secondContainer.leftItemValue");
        m76773F3(gVar, appCompatImageView3, textView5, textView6);
        e0Var.f73209w.f73175k.setText(getString(C25190j.gt_share_details_statistics_title_eps));
        C25989h hVar = new C25989h(this);
        AppCompatImageView appCompatImageView4 = e0Var.f73209w.f73174j;
        C41536l.m120488h(appCompatImageView4, "secondContainer.rightItemInfoButton");
        TextView textView7 = e0Var.f73209w.f73175k;
        C41536l.m120488h(textView7, "secondContainer.rightItemTitle");
        TextView textView8 = e0Var.f73209w.f73176l;
        C41536l.m120488h(textView8, "secondContainer.rightItemValue");
        m76773F3(hVar, appCompatImageView4, textView7, textView8);
        e0Var.f73182C.f73172h.setText(getString(C25190j.gt_share_details_statistics_title_close_price));
        C25991i iVar = new C25991i(this);
        AppCompatImageView appCompatImageView5 = e0Var.f73182C.f73171g;
        C41536l.m120488h(appCompatImageView5, "thirdContainer.leftItemInfoButton");
        TextView textView9 = e0Var.f73182C.f73172h;
        C41536l.m120488h(textView9, "thirdContainer.leftItemTitle");
        TextView textView10 = e0Var.f73182C.f73173i;
        C41536l.m120488h(textView10, "thirdContainer.leftItemValue");
        m76773F3(iVar, appCompatImageView5, textView9, textView10);
        e0Var.f73182C.f73175k.setText(getString(C25190j.gt_share_details_statistics_title_pb_ratio));
        C25993j jVar = new C25993j(this);
        AppCompatImageView appCompatImageView6 = e0Var.f73182C.f73174j;
        C41536l.m120488h(appCompatImageView6, "thirdContainer.rightItemInfoButton");
        TextView textView11 = e0Var.f73182C.f73175k;
        C41536l.m120488h(textView11, "thirdContainer.rightItemTitle");
        TextView textView12 = e0Var.f73182C.f73176l;
        C41536l.m120488h(textView12, "thirdContainer.rightItemValue");
        m76773F3(jVar, appCompatImageView6, textView11, textView12);
        e0Var.f73202p.f73172h.setText(getString(C25190j.gt_share_details_statistics_title_bid_price));
        C25997n nVar = new C25997n(this);
        AppCompatImageView appCompatImageView7 = e0Var.f73202p.f73171g;
        C41536l.m120488h(appCompatImageView7, "fourthContainer.leftItemInfoButton");
        TextView textView13 = e0Var.f73202p.f73172h;
        C41536l.m120488h(textView13, "fourthContainer.leftItemTitle");
        TextView textView14 = e0Var.f73202p.f73173i;
        C41536l.m120488h(textView14, "fourthContainer.leftItemValue");
        m76773F3(nVar, appCompatImageView7, textView13, textView14);
        e0Var.f73202p.f73175k.setText(getString(C25190j.gt_share_details_statistics_title_book_value));
        C25998o oVar = new C25998o(this);
        AppCompatImageView appCompatImageView8 = e0Var.f73202p.f73174j;
        C41536l.m120488h(appCompatImageView8, "fourthContainer.rightItemInfoButton");
        TextView textView15 = e0Var.f73202p.f73175k;
        C41536l.m120488h(textView15, "fourthContainer.rightItemTitle");
        TextView textView16 = e0Var.f73202p.f73176l;
        C41536l.m120488h(textView16, "fourthContainer.rightItemValue");
        m76773F3(oVar, appCompatImageView8, textView15, textView16);
        e0Var.f73200n.f73172h.setText(getString(C25190j.gt_share_details_statistics_title_ask_price));
        C25999p pVar = new C25999p(this);
        AppCompatImageView appCompatImageView9 = e0Var.f73200n.f73171g;
        C41536l.m120488h(appCompatImageView9, "fifthContainer.leftItemInfoButton");
        TextView textView17 = e0Var.f73200n.f73172h;
        C41536l.m120488h(textView17, "fifthContainer.leftItemTitle");
        TextView textView18 = e0Var.f73200n.f73173i;
        C41536l.m120488h(textView18, "fifthContainer.leftItemValue");
        m76773F3(pVar, appCompatImageView9, textView17, textView18);
        e0Var.f73200n.f73175k.setText(getString(C25190j.gt_share_details_statistics_title_dividend_yield));
        C26000q qVar = new C26000q(this);
        AppCompatImageView appCompatImageView10 = e0Var.f73200n.f73174j;
        C41536l.m120488h(appCompatImageView10, "fifthContainer.rightItemInfoButton");
        TextView textView19 = e0Var.f73200n.f73175k;
        C41536l.m120488h(textView19, "fifthContainer.rightItemTitle");
        TextView textView20 = e0Var.f73200n.f73176l;
        C41536l.m120488h(textView20, "fifthContainer.rightItemValue");
        m76773F3(qVar, appCompatImageView10, textView19, textView20);
        e0Var.f73211y.f73172h.setText(getString(C25190j.gt_share_details_statistics_title_days_range));
        C26001r rVar = new C26001r(this);
        AppCompatImageView appCompatImageView11 = e0Var.f73211y.f73171g;
        C41536l.m120488h(appCompatImageView11, "sixthsContainer.leftItemInfoButton");
        TextView textView21 = e0Var.f73211y.f73172h;
        C41536l.m120488h(textView21, "sixthsContainer.leftItemTitle");
        TextView textView22 = e0Var.f73211y.f73173i;
        C41536l.m120488h(textView22, "sixthsContainer.leftItemValue");
        m76773F3(rVar, appCompatImageView11, textView21, textView22);
        e0Var.f73211y.f73175k.setText(getString(C25190j.gt_share_details_statistics_title_avg_10_volume));
        C26002s sVar = new C26002s(this);
        AppCompatImageView appCompatImageView12 = e0Var.f73211y.f73174j;
        C41536l.m120488h(appCompatImageView12, "sixthsContainer.rightItemInfoButton");
        TextView textView23 = e0Var.f73211y.f73175k;
        C41536l.m120488h(textView23, "sixthsContainer.rightItemTitle");
        TextView textView24 = e0Var.f73211y.f73176l;
        C41536l.m120488h(textView24, "sixthsContainer.rightItemValue");
        m76773F3(sVar, appCompatImageView12, textView23, textView24);
        e0Var.f73210x.f73172h.setText(getString(C25190j.gt_share_details_statistics_title_52_weeks_range));
        C26003t tVar = new C26003t(this);
        AppCompatImageView appCompatImageView13 = e0Var.f73210x.f73171g;
        C41536l.m120488h(appCompatImageView13, "seventhContainer.leftItemInfoButton");
        TextView textView25 = e0Var.f73210x.f73172h;
        C41536l.m120488h(textView25, "seventhContainer.leftItemTitle");
        TextView textView26 = e0Var.f73210x.f73173i;
        C41536l.m120488h(textView26, "seventhContainer.leftItemValue");
        m76773F3(tVar, appCompatImageView13, textView25, textView26);
        e0Var.f73210x.f73175k.setText(getString(C25190j.gt_share_details_statistics_title_shares_outstanding));
        C26004u uVar = new C26004u(this);
        AppCompatImageView appCompatImageView14 = e0Var.f73210x.f73174j;
        C41536l.m120488h(appCompatImageView14, "seventhContainer.rightItemInfoButton");
        TextView textView27 = e0Var.f73210x.f73175k;
        C41536l.m120488h(textView27, "seventhContainer.rightItemTitle");
        TextView textView28 = e0Var.f73210x.f73176l;
        C41536l.m120488h(textView28, "seventhContainer.rightItemValue");
        m76773F3(uVar, appCompatImageView14, textView27, textView28);
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public static final void m76782K3(GTShareDetailsActivity gTShareDetailsActivity, Chip chip, int i) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        C41536l.m120489i(chip, "chip");
        Object tag = chip.getTag();
        C41536l.m120487g(tag, "null cannot be cast to non-null type kotlin.String");
        gTShareDetailsActivity.m76833q3((String) tag, 6);
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public static final void m76784L3(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        String string = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_title_pb_ratio);
        C41536l.m120488h(string, "getString(R.string.gt_sh…tatistics_title_pb_ratio)");
        String string2 = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_desc_pb_ratio);
        C41536l.m120488h(string2, "getString(R.string.gt_sh…statistics_desc_pb_ratio)");
        gTShareDetailsActivity.m76818c4(string, string2);
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public static final void m76786M3(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        String string = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_title_bid_price);
        C41536l.m120488h(string, "getString(R.string.gt_sh…atistics_title_bid_price)");
        String string2 = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_desc_bid_price);
        C41536l.m120488h(string2, "getString(R.string.gt_sh…tatistics_desc_bid_price)");
        gTShareDetailsActivity.m76818c4(string, string2);
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public static final void m76788N3(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        String string = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_title_book_value);
        C41536l.m120488h(string, "getString(R.string.gt_sh…tistics_title_book_value)");
        String string2 = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_desc_book_value);
        C41536l.m120488h(string2, "getString(R.string.gt_sh…atistics_desc_book_value)");
        gTShareDetailsActivity.m76818c4(string, string2);
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public static final void m76790O3(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        String string = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_title_ask_price);
        C41536l.m120488h(string, "getString(R.string.gt_sh…atistics_title_ask_price)");
        String string2 = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_desc_ask_price);
        C41536l.m120488h(string2, "getString(R.string.gt_sh…tatistics_desc_ask_price)");
        gTShareDetailsActivity.m76818c4(string, string2);
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public static final void m76792P3(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        String string = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_title_dividend_yield);
        C41536l.m120488h(string, "getString(R.string.gt_sh…ics_title_dividend_yield)");
        String string2 = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_desc_dividend_yield);
        C41536l.m120488h(string2, "getString(R.string.gt_sh…tics_desc_dividend_yield)");
        gTShareDetailsActivity.m76818c4(string, string2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public static final void m76794Q3(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        String string = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_title_days_range);
        C41536l.m120488h(string, "getString(R.string.gt_sh…tistics_title_days_range)");
        String string2 = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_desc_days_range);
        C41536l.m120488h(string2, "getString(R.string.gt_sh…atistics_desc_days_range)");
        gTShareDetailsActivity.m76818c4(string, string2);
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public static final void m76796R3(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        String string = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_title_avg_10_volume);
        C41536l.m120488h(string, "getString(R.string.gt_sh…tics_title_avg_10_volume)");
        String string2 = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_desc_avg_10_volume);
        C41536l.m120488h(string2, "getString(R.string.gt_sh…stics_desc_avg_10_volume)");
        gTShareDetailsActivity.m76818c4(string, string2);
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public static final void m76798S3(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        String string = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_title_52_weeks_range);
        C41536l.m120488h(string, "getString(R.string.gt_sh…ics_title_52_weeks_range)");
        String string2 = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_desc_52_weeks_range);
        C41536l.m120488h(string2, "getString(R.string.gt_sh…tics_desc_52_weeks_range)");
        gTShareDetailsActivity.m76818c4(string, string2);
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public static final void m76800T3(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        String string = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_title_shares_outstanding);
        C41536l.m120488h(string, "getString(R.string.gt_sh…title_shares_outstanding)");
        String string2 = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_desc_shares_outstanding);
        C41536l.m120488h(string2, "getString(R.string.gt_sh…_desc_shares_outstanding)");
        gTShareDetailsActivity.m76818c4(string, string2);
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public static final void m76802U3(GTShareDetailsActivity gTShareDetailsActivity) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        gTShareDetailsActivity.m76769D3(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: V3 */
    public static final void m76804V3(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        GTShareTradeDetailsActivity.C23867a aVar = GTShareTradeDetailsActivity.f62063W;
        C25192a aVar2 = C25192a.BUY_SHARE;
        String p3 = gTShareDetailsActivity.m76832p3();
        String str = gTShareDetailsActivity.f61881J;
        if (str == null) {
            C41536l.m120506z("shareName");
            str = null;
        }
        aVar.mo60857a(aVar2, gTShareDetailsActivity, p3, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: W3 */
    public static final void m76806W3(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        GTShareTradeDetailsActivity.C23867a aVar = GTShareTradeDetailsActivity.f62063W;
        C25192a aVar2 = C25192a.SELL_SHARE;
        String p3 = gTShareDetailsActivity.m76832p3();
        String str = gTShareDetailsActivity.f61881J;
        if (str == null) {
            C41536l.m120506z("shareName");
            str = null;
        }
        aVar.mo60857a(aVar2, gTShareDetailsActivity, p3, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: X3 */
    public static final void m76808X3(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        String string = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_title_market_cap);
        C41536l.m120488h(string, "getString(R.string.gt_sh…tistics_title_market_cap)");
        String string2 = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_desc_market_cap);
        C41536l.m120488h(string2, "getString(R.string.gt_sh…atistics_desc_market_cap)");
        gTShareDetailsActivity.m76818c4(string, string2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public static final void m76810Y3(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        String string = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_title_pe_ratio);
        C41536l.m120488h(string, "getString(R.string.gt_sh…tatistics_title_pe_ratio)");
        String string2 = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_desc_pe_ratio);
        C41536l.m120488h(string2, "getString(R.string.gt_sh…statistics_desc_pe_ratio)");
        gTShareDetailsActivity.m76818c4(string, string2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z3 */
    public static final void m76812Z3(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        String string = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_title_open_price);
        C41536l.m120488h(string, "getString(R.string.gt_sh…tistics_title_open_price)");
        String string2 = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_desc_open_price);
        C41536l.m120488h(string2, "getString(R.string.gt_sh…atistics_desc_open_price)");
        gTShareDetailsActivity.m76818c4(string, string2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public static final void m76814a4(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        String string = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_title_eps);
        C41536l.m120488h(string, "getString(R.string.gt_sh…ils_statistics_title_eps)");
        String string2 = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_desc_eps);
        C41536l.m120488h(string2, "getString(R.string.gt_sh…ails_statistics_desc_eps)");
        gTShareDetailsActivity.m76818c4(string, string2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public static final void m76816b4(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        String string = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_title_close_price);
        C41536l.m120488h(string, "getString(R.string.gt_sh…istics_title_close_price)");
        String string2 = gTShareDetailsActivity.getString(C25190j.gt_share_details_statistics_desc_close_price);
        C41536l.m120488h(string2, "getString(R.string.gt_sh…tistics_desc_close_price)");
        gTShareDetailsActivity.m76818c4(string, string2);
    }

    /* renamed from: c4 */
    private final void m76818c4(String str, String str2) {
        C23840f.f61994D.mo60799a(str, str2).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d4 */
    public final void m76820d4(List list) {
        C23824d.f61974K.mo60791a(m76832p3(), this.f61884M, list, this).mo4576A1(getSupportFragmentManager(), "WATCHLIST");
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public final void m76822e4(WatchList watchList) {
        C29759q qVar;
        if (watchList != null) {
            if (this.f61884M.isEmpty()) {
                qVar = C29759q.TO_ADD;
            } else {
                qVar = C29759q.TO_REMOVE;
            }
            m76834r3().mo60738Hw().mo60746O9(watchList.mo60081a(), m76832p3(), qVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public final void m76830m3() {
        C29372b.f74456J.mo69226a(this).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: n3 */
    private final void m76831n3(String str, C15278a aVar) {
        C12902d.C12903a.m48771e(C12902d.f38098b, this, false, 2, (Object) null).mo33652k(str, aVar, (C12902d.C12905b) null);
    }

    /* renamed from: p3 */
    private final String m76832p3() {
        return (String) this.f61880I.getValue();
    }

    /* renamed from: q3 */
    private final void m76833q3(String str, int i) {
        mo60603H0().mo68512k(str);
        GTShareViewModel.C23819c Hw = m76834r3().mo60738Hw();
        String p3 = m76832p3();
        if (str == null) {
            str = "";
        }
        Hw.mo60741Kc(p3, str, i);
    }

    /* renamed from: r3 */
    private final GTShareViewModel.ViewModel m76834r3() {
        return (GTShareViewModel.ViewModel) this.f61882K.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public final void m76835s3() {
        m76771E3(true);
        m76778I3(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public final void m76836t3() {
        C28722e0 e0Var = this.f61879H;
        if (e0Var == null) {
            C41536l.m120506z("binding");
            e0Var = null;
        }
        e0Var.f73193g.setOnClickListener(new C25994k(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public static final void m76837u3(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        GTShareTradeDetailsActivity.C23867a aVar = GTShareTradeDetailsActivity.f62063W;
        C25192a aVar2 = C25192a.BUY_SHARE;
        String p3 = gTShareDetailsActivity.m76832p3();
        String str = gTShareDetailsActivity.f61881J;
        if (str == null) {
            C41536l.m120506z("shareName");
            str = null;
        }
        aVar.mo60857a(aVar2, gTShareDetailsActivity, p3, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public final void m76838v3() {
        m76831n3(C32343x.m95388F("text.gt.symbol.status.CLOSE_ONLY", new Object[0]), C15278a.INFO);
        m76771E3(false);
        m76778I3(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public final void m76839w3() {
        m76831n3(C32343x.m95388F("text.gt.symbol.status.HALTED", new Object[0]), C15278a.INFO);
        m76771E3(false);
        m76778I3(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public final void m76840x3() {
        m76831n3(C32343x.m95388F("text.gt.symbol.status.DISABLED", new Object[0]), C15278a.INFO);
        m76771E3(false);
        m76778I3(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public final void m76841y3() {
        C28722e0 e0Var = this.f61879H;
        if (e0Var == null) {
            C41536l.m120506z("binding");
            e0Var = null;
        }
        e0Var.f73193g.setOnClickListener(new C25996m(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static final void m76842z3(GTShareDetailsActivity gTShareDetailsActivity, View view) {
        C41536l.m120489i(gTShareDetailsActivity, "this$0");
        C25725b.f65487H.mo64306a().mo4576A1(gTShareDetailsActivity.getSupportFragmentManager(), "ADD_FUNDS");
        gTShareDetailsActivity.m76769D3(false);
    }

    /* renamed from: A3 */
    public void mo60703A3(boolean z, LineChart lineChart, Context context) {
        C28775a.C28778c.m88238c(this, z, lineChart, context);
    }

    /* renamed from: E0 */
    public void mo60704E0(WatchList watchList, String str, C15278a aVar) {
        C41536l.m120489i(str, "message");
        C41536l.m120489i(aVar, "feedbackType");
        m76831n3(str, aVar);
        if (watchList != null) {
            m76834r3().mo60738Hw().mo60746O9(watchList.mo60081a(), m76832p3(), C29759q.TO_ADD);
        }
    }

    /* renamed from: G3 */
    public void mo60705G3(List list) {
        C28775a.C28778c.m88239d(this, list);
    }

    /* renamed from: H0 */
    public C28775a.C28776a mo60603H0() {
        return this.f61883L;
    }

    /* renamed from: K */
    public void mo60706K(String str, C15278a aVar) {
        C41536l.m120489i(str, "message");
        C41536l.m120489i(aVar, "feedbackType");
        m76831n3(str, aVar);
        if (aVar == C15278a.POSITIVE) {
            m76834r3().mo60748Pw(m76832p3(), 6);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C28722e0 d = C28722e0.m88007d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f61879H = d;
        C28722e0 e0Var = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        mo86436g2();
        super.mo37451O1(bundle);
        m76780J3();
        m76767B3();
        C28722e0 e0Var2 = this.f61879H;
        if (e0Var2 == null) {
            C41536l.m120506z("binding");
        } else {
            e0Var = e0Var2;
        }
        e0Var.f73196j.f73125k.postDelayed(new C25975a(this), 100);
        m76776H3();
        m76834r3().mo60738Hw().mo60753jb(m76832p3());
    }

    /* renamed from: o3 */
    public final C20292b mo60707o3() {
        C20292b bVar = this.f61878G;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("getAppSettingByNameUseCase");
        return null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        int i;
        C41536l.m120489i(menu, "menu");
        ToolbarView toolbarView = this.f85671t;
        if (toolbarView == null) {
            return false;
        }
        if (toolbarView != null) {
            if (!this.f61884M.isEmpty()) {
                i = C25189i.menu_toolbar_gt_share_details_filled;
            } else {
                i = C25189i.menu_toolbar_gt_share_details;
            }
            MenuInflater menuInflater = getMenuInflater();
            C41536l.m120488h(menuInflater, "menuInflater");
            toolbarView.mo37108n0(i, menu, menuInflater);
        }
        Drawable icon = menu.getItem(0).getIcon();
        if (icon != null) {
            C0836a.m3152n(icon, C18368l.m62755d(this, C25182b.f64639a));
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C41536l.m120489i(menuItem, "item");
        if (menuItem.getItemId() != C25187g.favorite_menu_item) {
            return super.onOptionsItemSelected(menuItem);
        }
        m76834r3().mo60750Rw();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m76769D3(false);
    }
}
