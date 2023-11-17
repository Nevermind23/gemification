package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30781t6;
import a81.C30794u6;
import a81.C30807v6;
import a81.C30820w6;
import a81.C30833x6;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.LinearLayoutManager;
import b11.C31106a;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import ee1.C40769c;
import g81.C32262n;
import g81.C32265p;
import g91.C32290b1;
import g91.C32296c1;
import g91.C32330r0;
import g91.C32335t0;
import g91.C32343x;
import g91.C32355x0;
import g91.C32359z0;
import gd1.C40992a;
import iu0.C36546y;
import j81.C36762d;
import j81.C36765g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jg1.C41438c;
import jg1.C41452l;
import l81.C37104a;
import l81.C37109f;
import n81.C37363a;
import n81.C37364b;
import n81.C37385j;
import p012ab.C0099c;
import p060e1.C5958l0;
import p196o7.C7463a;
import p196o7.C7464b;
import p196o7.C7465c;
import p196o7.C7474d;
import p196o7.C7476e;
import p196o7.C7477f;
import p222q7.C7896a;
import p222q7.C7897b;
import p222q7.C7898c;
import p222q7.C7899d;
import p222q7.C7900e;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.eventbus.event.LocationChangedEvent;
import p341ge.bog.mobilebank.eventbus.events.MapObjectDetailsEvent;
import p341ge.bog.mobilebank.eventbus.events.MapObjectStatusEvent;
import p341ge.bog.mobilebank.eventbus.events.MapObjectsEvent;
import p341ge.bog.mobilebank.eventbus.events.MapRegionsEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.model.google.Direction;
import p341ge.bog.mobilebank.model.map.MapObject;
import p341ge.bog.mobilebank.model.map.MapObjectSchedule;
import p341ge.bog.mobilebank.model.map.MapObjectService;
import p341ge.bog.mobilebank.model.map.MapObjectWrapper;
import p341ge.bog.mobilebank.model.map.MapRegion;
import p341ge.bog.mobilebank.p975ui.components.slidingmenu.SlidingUpPanelLayout;
import p341ge.bog.mobilebank.rest.BaseObserver;
import p341ge.bog.mobilebank.rest.GoogleApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.services.LocationService;
import p366bk.C10313b;
import p366bk.C10316e;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10323l;
import p366bk.C10324m;
import p366bk.C10327p;
import p366bk.C10328q;
import p366bk.C10329r;
import p420fh.C12902d;
import p420fh.C12910e;
import p630ui.C18168a;
import p90.C27398q0;
import p90.C27405q7;
import q81.C38213w;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.activities.MapActivity */
public class MapActivity extends C35537x implements C7476e, View.OnClickListener, C36765g, C0099c.C0105f, C7477f {

    /* renamed from: K0 */
    private static final LatLng f85082K0 = new LatLng(41.7370154d, 44.7679869d);

    /* renamed from: L0 */
    private static String f85083L0 = "text.atms.and.branches.no.data.found";
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public boolean f85084A0;

    /* renamed from: B0 */
    private C36762d f85085B0 = new C35271r();
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public float f85086C0;
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public float f85087D0 = 361.0f;

    /* renamed from: E0 */
    C37109f.C37110a f85088E0 = new C35272s();
    /* access modifiers changed from: private */

    /* renamed from: F0 */
    public View.OnClickListener f85089F0 = new C35273t();

    /* renamed from: G */
    protected Client f85090G;

    /* renamed from: G0 */
    C40769c f85091G0;

    /* renamed from: H */
    protected C41438c f85092H;

    /* renamed from: H0 */
    C37363a f85093H0;

    /* renamed from: I */
    protected PreferencesApiManager f85094I;
    /* access modifiers changed from: private */

    /* renamed from: I0 */
    public boolean f85095I0;

    /* renamed from: J */
    GoogleApi f85096J;

    /* renamed from: J0 */
    boolean f85097J0;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C27398q0 f85098K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public ArrayList f85099L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public View[] f85100M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public View[] f85101N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public Handler f85102O = new Handler();

    /* renamed from: P */
    protected Location f85103P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C7465c f85104Q;

    /* renamed from: R */
    private C32265p f85105R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public int f85106S = 0;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public C7900e f85107T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public ArrayMap f85108U = new ArrayMap();
    /* access modifiers changed from: private */

    /* renamed from: V */
    public MapObjectsEvent f85109V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public String f85110W = "SC";
    /* access modifiers changed from: private */

    /* renamed from: X */
    public int f85111X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public int f85112Y = -1;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public int f85113Z = -1;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public int f85114a0 = -1;

    /* renamed from: b0 */
    private C37363a f85115b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public C7899d f85116c0;

    /* renamed from: d0 */
    private C7899d f85117d0;

    /* renamed from: e0 */
    private C7898c f85118e0;

    /* renamed from: f0 */
    private C37109f f85119f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public C32262n f85120g0;

    /* renamed from: h0 */
    private C37364b f85121h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public C38213w f85122i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public MapObjectDetailsEvent f85123j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public MapObjectStatusEvent f85124k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public MapObject f85125l0;

    /* renamed from: m0 */
    private MapObjectWrapper f85126m0;

    /* renamed from: n0 */
    private GradientDrawable f85127n0 = new GradientDrawable();

    /* renamed from: o0 */
    private GradientDrawable f85128o0 = new GradientDrawable();

    /* renamed from: p0 */
    private C32330r0 f85129p0;

    /* renamed from: q0 */
    private LocationService f85130q0;

    /* renamed from: r0 */
    C38213w.C38218e f85131r0 = new C35263k();

    /* renamed from: s0 */
    C37104a f85132s0 = new C35269p();

    /* renamed from: t0 */
    View.OnClickListener f85133t0 = new C35270q();

    /* renamed from: u0 */
    private int f85134u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public boolean f85135v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public boolean f85136w0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public boolean f85137x0;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public boolean f85138y0;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public boolean f85139z0;

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$a */
    class C35253a implements ViewTreeObserver.OnGlobalLayoutListener {
        C35253a() {
        }

        public void onGlobalLayout() {
            MapActivity mapActivity = MapActivity.this;
            mapActivity.f85113Z = mapActivity.f85098K.f69581s.getHeight();
            MapActivity.this.m104310o4();
            C32355x0.m95523n(MapActivity.this.f85098K.f69581s, this);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$b */
    class C35254b implements Runnable {
        C35254b() {
        }

        public void run() {
            MapActivity.this.f85098K.f69581s.setPanelState(SlidingUpPanelLayout.C35567f.ANCHORED);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$c */
    class C35255c implements Runnable {
        C35255c() {
        }

        public void run() {
            MapActivity.this.f85098K.f69581s.setPanelState(SlidingUpPanelLayout.C35567f.ANCHORED);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$d */
    class C35256d implements Runnable {
        C35256d() {
        }

        public void run() {
            MapActivity.this.f85098K.f69581s.setPanelState(SlidingUpPanelLayout.C35567f.ANCHORED);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$e */
    class C35257e implements Runnable {
        C35257e() {
        }

        public void run() {
            String string = MapActivity.this.getIntent().getExtras().getString("MAP_OBJECT_KEY", (String) null);
            if (string != null) {
                MapActivity mapActivity = MapActivity.this;
                mapActivity.f85125l0 = mapActivity.f85109V.getMapObjects().getMapObjectByKey(string);
                if (MapActivity.this.f85125l0 != null) {
                    char c = 0;
                    if (!"SC".equals(MapActivity.this.f85125l0.getObject())) {
                        if ("ATM".equals(MapActivity.this.f85125l0.getObject())) {
                            c = 1;
                        } else if ("PBX".equals(MapActivity.this.f85125l0.getObject())) {
                            c = 2;
                        }
                    }
                    MapActivity.this.f85089F0.onClick(MapActivity.this.f85101N[c]);
                }
                MapActivity.this.f85095I0 = true;
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$f */
    class C35258f implements C7465c.C7468c {
        C35258f() {
        }

        /* renamed from: a */
        public void mo21892a() {
            MapActivity mapActivity = MapActivity.this;
            mapActivity.f85088E0.mo86283a(Utils.FLOAT_EPSILON, mapActivity.f85087D0);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$g */
    class C35259g implements Runnable {
        C35259g() {
        }

        public void run() {
            MapActivity.this.f85098K.f69581s.setPanelState(SlidingUpPanelLayout.C35567f.ANCHORED);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$h */
    class C35260h implements Runnable {
        C35260h() {
        }

        public void run() {
            MapActivity.this.f85098K.f69581s.setPanelState(SlidingUpPanelLayout.C35567f.ANCHORED);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$i */
    class C35261i implements C7465c.C7469d {
        C35261i() {
        }

        /* renamed from: a */
        public void mo21893a(int i) {
            MapActivity.this.f85098K.f69573k.animate().alpha(0.3f);
            MapActivity.this.f85098K.f69581s.getSlideableView().animate().alpha(0.3f);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$j */
    class C35262j implements C37364b.C37365a {
        C35262j() {
        }

        /* renamed from: a */
        public void mo86273a() {
            MapActivity.this.f85098K.f69573k.animate().alpha(1.0f);
            MapActivity.this.f85098K.f69581s.getSlideableView().animate().alpha(1.0f);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$k */
    class C35263k implements C38213w.C38218e {
        C35263k() {
        }

        /* renamed from: a */
        public void mo86274a() {
            if (MapActivity.this.f85122i0.mo91744k()) {
                MapActivity.this.f85114a0 = -1;
                MapActivity.this.f85098K.f69569g.f70277i.setText(MapActivity.this.getString(C10328q.map_filtration_choose_city));
                MapActivity.this.f85098K.f69569g.f70277i.setTextColor(C0767a.m2893c(MapActivity.this, C10318g.filtration_dark_gray));
            } else {
                MapActivity.this.f85098K.f69569g.f70277i.setText(((MapRegion) MapActivity.this.f85099L.get(MapActivity.this.f85114a0)).getPointDesc());
                MapActivity.this.f85098K.f69569g.f70277i.setTextColor(C32335t0.m95366k(MapActivity.this));
            }
            MapActivity.this.m104248I3();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$l */
    class C35264l implements View.OnClickListener {
        C35264l() {
        }

        public void onClick(View view) {
            MapActivity mapActivity = MapActivity.this;
            mapActivity.f85090G.requestMapObjectDetails(true, mapActivity.f85123j0.getMapObject());
            MapActivity mapActivity2 = MapActivity.this;
            mapActivity2.f85090G.requestMapObjectStatus(true, mapActivity2.f85123j0.getMapObject());
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$m */
    class C35265m implements Runnable {

        /* renamed from: d */
        final /* synthetic */ int f85152d;

        C35265m(int i) {
            this.f85152d = i;
        }

        public void run() {
            MapActivity.this.m104320t4(false);
            int i = this.f85152d;
            int i2 = 1;
            if (i != -10) {
                if (i == 0) {
                    i2 = 2;
                } else if (i == 5) {
                    i2 = 4;
                } else if (i == 7) {
                    i2 = 3;
                } else if (i == 10) {
                    MapActivity.this.m104320t4(true);
                    i2 = 0;
                } else if (i != 124) {
                    i2 = -1;
                } else {
                    i2 = 5;
                }
            }
            if (i2 >= 0 && i2 < MapActivity.this.f85100M.length) {
                MapActivity.this.f85106S = this.f85152d;
                for (int i3 = 0; i3 < MapActivity.this.f85100M.length; i3++) {
                    if (i3 != i2) {
                        MapActivity.this.f85100M[i3].setVisibility(8);
                    } else {
                        MapActivity.this.f85100M[i3].setVisibility(0);
                        if (i2 != 5) {
                            MapActivity.this.f85098K.f69581s.setScrollableView(MapActivity.this.f85100M[i3]);
                        } else {
                            if (MapActivity.this.f85110W.equals("SC")) {
                                MapActivity.this.f85120g0.mo72776l(125);
                            } else {
                                MapActivity.this.f85120g0.mo72776l(123);
                            }
                            MapActivity.this.f85098K.f69581s.setScrollableView(MapActivity.this.f85098K.f69569g.f70279k);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$n */
    class C35266n implements Runnable {
        C35266n() {
        }

        public void run() {
            MapActivity.this.f85098K.f69570h.f69309e.startAnimation(AnimationUtils.loadAnimation(MapActivity.this, C10313b.infinite_alpha));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$o */
    class C35267o implements Runnable {

        /* renamed from: d */
        final /* synthetic */ MapObject f85155d;

        /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$o$a */
        class C35268a implements SlidingUpPanelLayout.C35566e {
            C35268a() {
            }

            /* renamed from: a */
            public void mo86279a(View view, float f) {
            }

            /* renamed from: b */
            public void mo86280b(View view, SlidingUpPanelLayout.C35567f fVar, SlidingUpPanelLayout.C35567f fVar2) {
                if (fVar2 == SlidingUpPanelLayout.C35567f.ANCHORED) {
                    C35267o oVar = C35267o.this;
                    MapActivity.this.m104318s4(oVar.f85155d);
                    MapActivity.this.f85098K.f69581s.mo86592y(this);
                }
            }
        }

        C35267o(MapObject mapObject) {
            this.f85155d = mapObject;
        }

        public void run() {
            SlidingUpPanelLayout.C35567f panelState = MapActivity.this.f85098K.f69581s.getPanelState();
            SlidingUpPanelLayout.C35567f fVar = SlidingUpPanelLayout.C35567f.ANCHORED;
            if (panelState != fVar) {
                MapActivity.this.f85098K.f69581s.mo86562o(new C35268a());
                MapActivity.this.f85098K.f69581s.setPanelState(fVar);
                return;
            }
            MapActivity.this.m104318s4(this.f85155d);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$p */
    class C35269p implements C37104a {
        C35269p() {
        }

        /* renamed from: Z0 */
        public void mo48298Z0(int i) {
            MapActivity.this.f85114a0 = i;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$q */
    class C35270q implements View.OnClickListener {
        C35270q() {
        }

        public void onClick(View view) {
            MapActivity.this.m104312p4(0);
            MapActivity.this.m104308n4((C37363a) null);
            MapActivity.this.f85123j0 = null;
            MapActivity.this.f85124k0 = null;
            MapActivity.this.m104304l4();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$r */
    class C35271r implements C36762d {
        C35271r() {
        }

        /* renamed from: a */
        public void mo86282a(int i, boolean z) {
            if (i == 0) {
                MapActivity mapActivity = MapActivity.this;
                mapActivity.f85135v0 = true ^ mapActivity.f85135v0;
            } else if (i == 1) {
                MapActivity mapActivity2 = MapActivity.this;
                mapActivity2.f85136w0 = true ^ mapActivity2.f85136w0;
            } else if (i == 2) {
                MapActivity mapActivity3 = MapActivity.this;
                mapActivity3.f85137x0 = true ^ mapActivity3.f85137x0;
            } else if (i == 3) {
                MapActivity mapActivity4 = MapActivity.this;
                mapActivity4.f85138y0 = true ^ mapActivity4.f85138y0;
            } else if (i == 4) {
                MapActivity mapActivity5 = MapActivity.this;
                mapActivity5.f85139z0 = true ^ mapActivity5.f85139z0;
            }
            MapActivity.this.m104248I3();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$s */
    class C35272s implements C37109f.C37110a {
        C35272s() {
        }

        /* renamed from: a */
        public void mo86283a(float f, float f2) {
            if (f2 != MapActivity.this.f85087D0) {
                MapActivity.this.f85086C0 = f2;
            }
            if (MapActivity.this.f85116c0 != null) {
                MapActivity.this.f85116c0.mo22880h(MapActivity.this.f85086C0 - MapActivity.this.f85104Q.mo21876e().f14039g);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$t */
    class C35273t implements View.OnClickListener {

        /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$t$a */
        class C35274a implements Runnable {

            /* renamed from: d */
            final /* synthetic */ int f85163d;

            C35274a(int i) {
                this.f85163d = i;
            }

            public void run() {
                MapActivity.this.f85098K.f69583u.f69625i.smoothScrollTo(this.f85163d, 0);
            }
        }

        C35273t() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00f3 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r11) {
            /*
                r10 = this;
                ge.bog.mobilebank.ui.activities.MapActivity r0 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                r0.m104304l4()
                r0 = 0
                r1 = r0
            L_0x0007:
                ge.bog.mobilebank.ui.activities.MapActivity r2 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                android.view.View[] r2 = r2.f85101N
                int r2 = r2.length
                r3 = 0
                if (r1 >= r2) goto L_0x00f7
                ge.bog.mobilebank.ui.activities.MapActivity r2 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                android.view.View[] r2 = r2.f85101N
                r2 = r2[r1]
                if (r2 != r11) goto L_0x00ea
                java.lang.String r4 = "ATM"
                r5 = 1
                if (r1 == 0) goto L_0x0044
                if (r1 == r5) goto L_0x003d
                r6 = 2
                if (r1 == r6) goto L_0x0028
                r6 = r0
                r7 = r6
                goto L_0x004d
            L_0x0028:
                ge.bog.mobilebank.ui.activities.MapActivity r6 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                java.lang.String r7 = "PBX"
                boolean r6 = r6.m104250J3(r7, r5)
                ge.bog.mobilebank.ui.activities.MapActivity r7 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                android.view.View[] r7 = r7.f85101N
                r7 = r7[r1]
                int r7 = r7.getRight()
                goto L_0x004d
            L_0x003d:
                ge.bog.mobilebank.ui.activities.MapActivity r6 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                boolean r6 = r6.m104250J3(r4, r5)
                goto L_0x004c
            L_0x0044:
                ge.bog.mobilebank.ui.activities.MapActivity r6 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                java.lang.String r7 = "SC"
                boolean r6 = r6.m104250J3(r7, r5)
            L_0x004c:
                r7 = r0
            L_0x004d:
                if (r6 == 0) goto L_0x00a7
                ge.bog.mobilebank.ui.activities.MapActivity r8 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                r8.f85139z0 = r0
                ge.bog.mobilebank.ui.activities.MapActivity r8 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                r8.f85138y0 = r0
                ge.bog.mobilebank.ui.activities.MapActivity r8 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                r8.f85137x0 = r0
                ge.bog.mobilebank.ui.activities.MapActivity r8 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                r8.f85136w0 = r0
                ge.bog.mobilebank.ui.activities.MapActivity r8 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                r8.f85135v0 = r0
                ge.bog.mobilebank.ui.activities.MapActivity r8 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                r8.f85084A0 = r0
                ge.bog.mobilebank.ui.activities.MapActivity r8 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                p90.q0 r8 = r8.f85098K
                p90.y6 r8 = r8.f69569g
                android.widget.ImageView r8 = r8.f70273e
                int r9 = p366bk.C10320i.circle_image_background
                r8.setImageResource(r9)
                ge.bog.mobilebank.ui.activities.MapActivity r8 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                r8.m104248I3()
                ge.bog.mobilebank.ui.activities.MapActivity r8 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                g81.n r8 = r8.f85120g0
                r8.mo72773i()
                ge.bog.mobilebank.ui.activities.MapActivity r8 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                p90.q0 r8 = r8.f85098K
                p90.y6 r8 = r8.f69569g
                android.widget.FrameLayout r8 = r8.f70274f
                ge.bog.mobilebank.ui.activities.MapActivity r9 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                java.lang.String r9 = r9.f85110W
                boolean r4 = r9.equals(r4)
                if (r4 == 0) goto L_0x00a2
                r4 = r0
                goto L_0x00a4
            L_0x00a2:
                r4 = 8
            L_0x00a4:
                r8.setVisibility(r4)
            L_0x00a7:
                if (r6 != 0) goto L_0x00b1
                ge.bog.mobilebank.ui.activities.MapActivity r4 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                ge.bog.mobilebank.model.map.MapObject r4 = r4.f85125l0
                if (r4 == 0) goto L_0x00f3
            L_0x00b1:
                android.graphics.drawable.Drawable r2 = r2.getBackground()
                android.graphics.drawable.TransitionDrawable r2 = (android.graphics.drawable.TransitionDrawable) r2
                ge.bog.mobilebank.ui.activities.MapActivity r4 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                int r4 = r4.f85111X
                r2.startTransition(r4)
                ge.bog.mobilebank.ui.activities.MapActivity r2 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                int r2 = r2.f85106S
                r4 = 5
                if (r2 == r4) goto L_0x00d2
                ge.bog.mobilebank.ui.activities.MapActivity r2 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                int r2 = r2.f85106S
                r4 = 7
                if (r2 != r4) goto L_0x00d9
            L_0x00d2:
                ge.bog.mobilebank.ui.activities.MapActivity r2 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                android.view.View$OnClickListener r2 = r2.f85133t0
                r2.onClick(r3)
            L_0x00d9:
                if (r1 == r5) goto L_0x00f3
                ge.bog.mobilebank.ui.activities.MapActivity r2 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                android.os.Handler r2 = r2.f85102O
                ge.bog.mobilebank.ui.activities.MapActivity$t$a r3 = new ge.bog.mobilebank.ui.activities.MapActivity$t$a
                r3.<init>(r7)
                r2.post(r3)
                goto L_0x00f3
            L_0x00ea:
                android.graphics.drawable.Drawable r2 = r2.getBackground()
                android.graphics.drawable.TransitionDrawable r2 = (android.graphics.drawable.TransitionDrawable) r2
                r2.resetTransition()
            L_0x00f3:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x00f7:
                ge.bog.mobilebank.ui.activities.MapActivity r11 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                ge.bog.mobilebank.model.map.MapObject r11 = r11.f85125l0
                if (r11 == 0) goto L_0x0111
                ge.bog.mobilebank.ui.activities.MapActivity r11 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                android.location.Location r0 = r11.f85103P
                if (r0 == 0) goto L_0x0111
                ge.bog.mobilebank.model.map.MapObject r0 = r11.f85125l0
                r11.mo86258b(r0)
                ge.bog.mobilebank.ui.activities.MapActivity r11 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.this
                r11.f85125l0 = r3
            L_0x0111:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.MapActivity.C35273t.onClick(android.view.View):void");
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$u */
    class C35275u extends BaseObserver {

        /* renamed from: d */
        final /* synthetic */ C37363a f85165d;

        C35275u(C37363a aVar) {
            this.f85165d = aVar;
        }

        /* renamed from: a */
        public void onNext(Direction direction) {
            MapActivity.this.m104304l4();
            if (direction.getRoutes().size() > 0) {
                List<LatLng> decodedPolyline = direction.getRoutes().get(0).getOverviewPolyline().getDecodedPolyline();
                MapObject mapObject = (MapObject) MapActivity.this.f85108U.get(this.f85165d);
                if (mapObject != null) {
                    if (direction.getRoutes().get(0).getLegs().size() > 0) {
                        int value = (int) direction.getRoutes().get(0).getLegs().get(0).getDistance().getValue();
                        if (value >= 1000) {
                            mapObject.setDistance((String.format("%.2f", new Object[]{Double.valueOf(((double) value) / 1000.0d)}) + " " + MapActivity.this.getString(C10328q.map_object_distance_km_short)).replace(",", "."));
                        } else {
                            mapObject.setDistance(value + " " + MapActivity.this.getString(C10328q.map_object_distance_meter_short));
                        }
                        mapObject.setTime(direction.getRoutes().get(0).getLegs().get(0).getDuration().getText());
                    }
                    String replace = mapObject.getDistance().replace(",", ".");
                    String str = mapObject.getTime() + " " + MapActivity.this.getString(C10328q.map_object_distance_walk);
                    if (MapActivity.this.f85110W.equals("SC")) {
                        MapActivity.this.f85098K.f69578p.f69544g.f69486g.setText(replace);
                        MapActivity.this.f85098K.f69578p.f69544g.f69488i.setText(str);
                    } else {
                        MapActivity.this.f85098K.f69577o.f69397e.f69486g.setText(replace);
                        MapActivity.this.f85098K.f69577o.f69397e.f69488i.setText(str);
                    }
                    if (decodedPolyline.size() > 0) {
                        MapActivity mapActivity = MapActivity.this;
                        mapActivity.f85107T = mapActivity.f85104Q.mo21874c(new PolylineOptions().mo14183v(decodedPolyline).mo14176J1(15.0f).mo14184w(C32335t0.m95366k(MapActivity.this)));
                    }
                }
            }
            MapActivity.this.m104328x4();
        }

        public void onError(Throwable th) {
            MapActivity.this.m104328x4();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$v */
    class C35276v implements SlidingUpPanelLayout.C35566e {
        C35276v() {
        }

        /* renamed from: a */
        public void mo86279a(View view, float f) {
        }

        /* renamed from: b */
        public void mo86280b(View view, SlidingUpPanelLayout.C35567f fVar, SlidingUpPanelLayout.C35567f fVar2) {
            int i;
            if (MapActivity.this.f85098K.f69573k.getParent() instanceof ViewGroup) {
                C5958l0.m23910a((ViewGroup) MapActivity.this.f85098K.f69573k.getParent());
            }
            Button button = MapActivity.this.f85098K.f69573k;
            if (fVar2 == SlidingUpPanelLayout.C35567f.ANCHORED && MapActivity.this.f85109V != null && MapActivity.this.f85109V.getState() == 20) {
                i = 0;
            } else {
                i = 4;
            }
            button.setVisibility(i);
            if (MapActivity.this.f85098K.f69573k.getVisibility() == 0) {
                MapActivity.this.f85104Q.mo21891t(20, 0, 0, ((int) MapActivity.this.f85098K.f69573k.getY()) + 10);
            } else if (fVar2 == SlidingUpPanelLayout.C35567f.COLLAPSED) {
                MapActivity.this.f85104Q.mo21891t(20, 0, 0, C32296c1.m95141a(MapActivity.this, 83));
            }
            MapActivity.this.m104287c4();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MapActivity$w */
    class C35277w implements ViewTreeObserver.OnGlobalLayoutListener {
        C35277w() {
        }

        public void onGlobalLayout() {
            MapActivity mapActivity = MapActivity.this;
            mapActivity.f85112Y = mapActivity.f85671t.getHeight();
            MapActivity.this.m104310o4();
            C32355x0.m95523n(MapActivity.this.f85671t, this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public void m104248I3() {
        ArrayList arrayList;
        C7896a aVar;
        for (C37363a l : this.f85108U.keySet()) {
            this.f85121h0.mo181l(l);
        }
        this.f85108U.clear();
        MapObjectsEvent mapObjectsEvent = this.f85109V;
        if (mapObjectsEvent != null && mapObjectsEvent.getMapObjects() != null) {
            if (m104316r4()) {
                arrayList = m104272U3();
            } else {
                arrayList = m104266R3();
            }
            this.f85105R.mo72780k(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MapObject mapObject = (MapObject) it.next();
                String object = mapObject.getObject();
                object.hashCode();
                char c = 65535;
                switch (object.hashCode()) {
                    case 2640:
                        if (object.equals("SC")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 65146:
                        if (object.equals("ATM")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 37056093:
                        if (object.equals("ATM_EUR")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        String type = mapObject.getType();
                        type.hashCode();
                        if (!type.equals("EXP")) {
                            if (type.equals("SOL")) {
                                aVar = C7897b.m29876b(C10320i.pin_solo);
                                break;
                            } else {
                                aVar = C7897b.m29876b(C10320i.pin_retail);
                                break;
                            }
                        } else {
                            aVar = C7897b.m29876b(C10320i.pin_express);
                            break;
                        }
                    case 1:
                    case 2:
                        aVar = C7897b.m29876b(C10320i.pin_atm);
                        break;
                    default:
                        aVar = C7897b.m29876b(C10320i.pin_paybox);
                        break;
                }
                C37363a aVar2 = new C37363a(mapObject.getLatLng(), aVar);
                this.f85108U.put(aVar2, mapObject);
                this.f85121h0.mo182m(this);
                mapObject.setClusterItem(aVar2);
                this.f85121h0.mo173d(aVar2);
            }
            this.f85121h0.mo174e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public boolean m104250J3(String str, boolean z) {
        if (!this.f85108U.isEmpty() && this.f85105R.mo72778i() && this.f85110W.equals(str) && this.f85106S == 0) {
            return false;
        }
        this.f85110W = str;
        if (z) {
            this.f85102O.post(new C35256d());
        }
        if (str.equals("SC")) {
            this.f85120g0.mo72776l(125);
        } else {
            this.f85120g0.mo72776l(123);
        }
        m104260O3();
        m104248I3();
        return true;
    }

    /* renamed from: K3 */
    private void m104252K3() {
        if (!this.f85095I0 && getIntent() != null && getIntent().getExtras() != null) {
            new Handler().post(new C35257e());
        }
    }

    /* renamed from: L3 */
    private void m104254L3() {
        int i;
        MapObjectsEvent mapObjectsEvent;
        MapObjectsEvent mapObjectsEvent2 = this.f85109V;
        if (mapObjectsEvent2 != null && mapObjectsEvent2.getState() == 20 && (mapObjectsEvent = this.f85109V) != null && mapObjectsEvent.getState() == 20) {
            m104252K3();
        }
        if (this.f85098K.f69581s.getPanelState().equals(SlidingUpPanelLayout.C35567f.EXPANDED)) {
            this.f85102O.postDelayed(new C35254b(), 700);
        } else if (this.f85098K.f69581s.getPanelState().equals(SlidingUpPanelLayout.C35567f.COLLAPSED)) {
            this.f85102O.post(new C35255c());
        }
        C27398q0 q0Var = this.f85098K;
        Button button = q0Var.f69573k;
        if (q0Var.f69581s.getPanelState() == SlidingUpPanelLayout.C35567f.ANCHORED && this.f85109V.getState() == 20) {
            i = 0;
        } else {
            i = 4;
        }
        button.setVisibility(i);
        m104287c4();
    }

    /* renamed from: M3 */
    private C7463a m104256M3(LatLng latLng, float f) {
        if (f > Utils.FLOAT_EPSILON) {
            return C7464b.m28399b(latLng, f);
        }
        return C7464b.m28398a(latLng);
    }

    /* renamed from: N3 */
    private void m104258N3() {
        boolean z = !this.f85084A0;
        this.f85084A0 = z;
        if (z) {
            this.f85098K.f69569g.f70273e.setBackgroundResource(C10320i.ic_template_basket_selected);
        } else {
            this.f85098K.f69569g.f70273e.setBackgroundResource(C10320i.circle_image_background);
        }
        m104248I3();
        m104298i4();
        if (this.f85105R.getItemCount() == 0) {
            C12910e.m48799q(this, C32343x.m95388F(f85083L0, new Object[0]), C12902d.C12905b.C12907b.f38104a);
        }
    }

    /* renamed from: O3 */
    private void m104260O3() {
        MapObjectsEvent mapObjectsEvent = this.f85109V;
        if (mapObjectsEvent != null && mapObjectsEvent.getMapObjects() != null) {
            this.f85105R.mo72780k(this.f85109V.getMapObjectsByType(this.f85110W));
        }
    }

    /* renamed from: P3 */
    private void m104262P3(double d, double d2, float f) {
        m104264Q3(new LatLng(d, d2), f);
    }

    /* renamed from: Q3 */
    private void m104264Q3(LatLng latLng, float f) {
        this.f85104Q.mo21875d(m104256M3(latLng, f));
    }

    /* renamed from: R3 */
    private ArrayList m104266R3() {
        return this.f85109V.getMapObjectsByType(this.f85110W);
    }

    /* renamed from: S3 */
    private BaseObserver m104268S3(C37363a aVar) {
        return new C35275u(aVar);
    }

    /* renamed from: T3 */
    private void m104270T3(C37363a aVar) {
        this.f85093H0 = aVar;
        C7900e eVar = this.f85107T;
        if (eVar != null) {
            eVar.mo22886a();
        }
        if (this.f85103P != null) {
            this.f85091G0 = C40769c.m118217h1();
            C31106a.m92555b(this.f85096J.getDirections(new LatLng(this.f85103P.getLatitude(), this.f85103P.getLongitude()), aVar.getPosition(), getString(C10328q.google_maps_key))).mo95016c(this.f85091G0);
            this.f85091G0.mo95016c(m104268S3(aVar));
        }
    }

    /* renamed from: U3 */
    private ArrayList m104272U3() {
        ArrayList R3 = m104266R3();
        ArrayList arrayList = new ArrayList();
        Iterator it = R3.iterator();
        while (it.hasNext()) {
            MapObject mapObject = (MapObject) it.next();
            if (this.f85114a0 == -1 || mapObject.getCityId() == ((MapRegion) this.f85099L.get(this.f85114a0)).getPointValue()) {
                if (this.f85135v0 && "BOG".equals(mapObject.getObjectSubType())) {
                    arrayList.add(mapObject);
                }
                if (this.f85136w0 && "EXP".equals(mapObject.getObjectSubType())) {
                    arrayList.add(mapObject);
                }
                if (this.f85137x0 && "SOL".equals(mapObject.getObjectSubType())) {
                    arrayList.add(mapObject);
                }
                if (!this.f85135v0 && !this.f85136w0 && !this.f85137x0 && (!this.f85084A0 || mapObject.isEuroAtm())) {
                    arrayList.add(mapObject);
                }
                if (this.f85138y0 && !mapObject.getWorksFullTime()) {
                    arrayList.remove(mapObject);
                }
                if (this.f85139z0 && !mapObject.isAdapted()) {
                    arrayList.remove(mapObject);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: V3 */
    private ArraySet m104274V3() {
        ArraySet arraySet = new ArraySet();
        if (this.f85135v0) {
            arraySet.add(0);
        }
        if (this.f85136w0) {
            arraySet.add(1);
        }
        if (this.f85137x0) {
            arraySet.add(2);
        }
        if (this.f85138y0) {
            arraySet.add(3);
        }
        if (this.f85139z0) {
            arraySet.add(4);
        }
        return arraySet;
    }

    /* access modifiers changed from: private */
    /* renamed from: X3 */
    public /* synthetic */ void m104277X3(View view) {
        m104293f4();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public /* synthetic */ void m104279Y3(View view) {
        m104258N3();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z3 */
    public /* synthetic */ void m104281Z3(View view) {
        m104298i4();
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public /* synthetic */ void m104283a4(View view) {
        m104296h4();
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public /* synthetic */ void m104285b4(View view) {
        m104302k4();
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public void m104287c4() {
        int i;
        if (this.f85098K.f69573k.getVisibility() == 0 && (i = this.f85134u0) != -1) {
            this.f85085B0.mo86282a(i, true);
            this.f85134u0 = -1;
        }
    }

    /* renamed from: d4 */
    private void m104289d4(double d, double d2, float f) {
        m104291e4(new LatLng(d, d2), f);
    }

    /* renamed from: e4 */
    private void m104291e4(LatLng latLng, float f) {
        this.f85104Q.mo21880i(m104256M3(latLng, f));
    }

    /* renamed from: f4 */
    private void m104293f4() {
        int i = C32290b1.m95119i(this.f85098K.f69569g.f70276h).left;
        int i2 = C32290b1.m95119i(this.f85098K.f69569g.f70276h).top;
        int size = this.f85099L.size();
        String[] strArr = new String[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr[i3] = ((MapRegion) this.f85099L.get(i3)).getPointDesc();
        }
        C38213w wVar = new C38213w(this, strArr, this.f85114a0, i2, i);
        this.f85122i0 = wVar;
        wVar.mo91708m(this.f85132s0);
        this.f85122i0.mo91747s(this.f85131r0);
    }

    /* renamed from: h4 */
    private void m104296h4() {
        m104312p4(124);
    }

    /* renamed from: i4 */
    private void m104298i4() {
        this.f85133t0.onClick((View) null);
    }

    /* renamed from: j4 */
    private void m104300j4(MapObject mapObject) {
        if (this.f85105R != null) {
            this.f85102O.post(new C35267o(mapObject));
        }
    }

    /* renamed from: k4 */
    private void m104302k4() {
        Locale locale = Locale.ENGLISH;
        String format = String.format(locale, "%f,%f", new Object[]{Double.valueOf(this.f85115b0.getPosition().f14073d), Double.valueOf(this.f85115b0.getPosition().f14074e)});
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, "https://maps.google.com/maps/?q=%s&ll=%s&z=16", new Object[]{format, format}))));
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public void m104304l4() {
        C7900e eVar = this.f85107T;
        if (eVar != null) {
            eVar.mo22886a();
            this.f85107T = null;
        }
    }

    /* renamed from: m4 */
    private void m104306m4() {
        this.f85098K.f69569g.f70277i.setOnClickListener(new C30781t6(this));
        this.f85098K.f69569g.f70274f.setOnClickListener(new C30794u6(this));
        this.f85098K.f69569g.f70278j.setOnClickListener(new C30807v6(this));
        this.f85098K.f69573k.setOnClickListener(new C30820w6(this));
        this.f85098K.f69572j.setOnClickListener(new C30833x6(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public void m104308n4(C37363a aVar) {
        int i;
        this.f85115b0 = aVar;
        if (this.f85098K.f69572j.getParent() instanceof ViewGroup) {
            C5958l0.m23910a((ViewGroup) this.f85098K.f69572j.getParent());
        }
        FrameLayout frameLayout = this.f85098K.f69572j;
        if (aVar != null) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: o4 */
    public void m104310o4() {
        int i;
        int i2 = this.f85112Y;
        if (i2 != -1 && (i = this.f85113Z) != -1 && i2 != 0) {
            this.f85098K.f69580r.setLayoutParams(new SlidingUpPanelLayout.C35565d(-1, -1, ((float) (((i - i2) * 100) / i)) / 100.0f));
            float f = (float) (this.f85113Z - this.f85112Y);
            this.f85098K.f69573k.setY((((f - (0.33f * f)) - ((float) getResources().getDimensionPixelSize(C10319h.bog_button_height))) - ((float) this.f85112Y)) - ((float) getResources().getDimensionPixelSize(C10319h.map_sliding_menu_side_padding)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public void m104312p4(int i) {
        this.f85102O.post(new C35265m(i));
    }

    /* renamed from: q4 */
    private void m104314q4() {
        this.f85098K.f69581s.setAnchorPoint(0.33f);
        this.f85098K.f69581s.setPanelState(SlidingUpPanelLayout.C35567f.EXPANDED);
        this.f85098K.f69581s.mo86562o(new C35276v());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        this.f85105R = new C32265p(this, this, this.f85103P);
        this.f85098K.f69567e.setLayoutManager(linearLayoutManager);
        this.f85098K.f69567e.setAdapter(this.f85105R);
        this.f85671t.getViewTreeObserver().addOnGlobalLayoutListener(new C35277w());
        this.f85098K.f69581s.getViewTreeObserver().addOnGlobalLayoutListener(new C35253a());
    }

    /* renamed from: r4 */
    private boolean m104316r4() {
        return this.f85139z0 || this.f85138y0 || this.f85137x0 || this.f85136w0 || this.f85135v0 || this.f85114a0 != -1 || this.f85084A0;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x013e  */
    /* renamed from: s4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m104318s4(p341ge.bog.mobilebank.model.map.MapObject r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            if (r1 == 0) goto L_0x0234
            java.lang.String r2 = r19.getObject()
            if (r2 == 0) goto L_0x0234
            ge.bog.mobilebank.eventbus.events.MapObjectStatusEvent r2 = new ge.bog.mobilebank.eventbus.events.MapObjectStatusEvent
            r2.<init>()
            r0.f85124k0 = r2
            r2.setMapObject(r1)
            java.lang.String r2 = r19.getObject()
            java.lang.String r3 = "SC"
            boolean r2 = r2.equals(r3)
            r4 = 8
            java.lang.String r5 = ", "
            java.lang.String r6 = "ATM"
            java.lang.String r7 = "PBX"
            java.lang.String r8 = ""
            r9 = 1
            r10 = 0
            if (r2 == 0) goto L_0x0153
            r2 = 7
            r0.m104312p4(r2)
            p90.q0 r2 = r0.f85098K
            p90.p7 r2 = r2.f69578p
            p90.o7 r2 = r2.f69544g
            androidx.appcompat.widget.AppCompatTextView r2 = r2.f69487h
            java.lang.String r11 = r19.getName()
            r2.setText(r11)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r2.setShape(r9)
            int r11 = p366bk.C10319h.loan_stroke_width
            int r11 = g91.C32355x0.m95516g(r11)
            int r12 = p366bk.C10318g.bog_circular_image_container_grey_color
            int r12 = g91.C32355x0.m95514e(r12, r0)
            r2.setStroke(r11, r12)
            r2.setColor(r10)
            int r11 = p366bk.C10320i.ic_sc
            java.lang.String r12 = r19.getObject()
            if (r12 == 0) goto L_0x00c0
            java.lang.String r12 = r19.getObject()
            boolean r6 = r12.equals(r6)
            if (r6 == 0) goto L_0x0072
            int r11 = p366bk.C10320i.ic_atm
        L_0x006f:
            r17 = r9
            goto L_0x00c2
        L_0x0072:
            java.lang.String r6 = r19.getObject()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x007f
            int r11 = p366bk.C10320i.ic_paybox
            goto L_0x006f
        L_0x007f:
            java.lang.String r6 = r19.getObject()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x00c0
            java.lang.String r3 = r19.getType()
            if (r3 == 0) goto L_0x00c0
            java.lang.String r3 = r19.getType()
            java.lang.String r6 = "SOL"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x00a7
            int r11 = p366bk.C10320i.ic_solo
            int r3 = p366bk.C10318g.solo_background_color
            int r3 = g91.C32355x0.m95514e(r3, r0)
            r2.setColor(r3)
            goto L_0x00c0
        L_0x00a7:
            java.lang.String r3 = r19.getType()
            java.lang.String r6 = "EXP"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x00b6
            int r11 = p366bk.C10320i.ic_express
            goto L_0x00c0
        L_0x00b6:
            java.lang.String r3 = r19.getType()
            java.lang.String r6 = "BOG"
            boolean r3 = r3.equals(r6)
        L_0x00c0:
            r17 = r10
        L_0x00c2:
            p90.q0 r3 = r0.f85098K
            p90.p7 r3 = r3.f69578p
            p90.o7 r3 = r3.f69544g
            android.widget.FrameLayout r3 = r3.f69490k
            r3.setBackground(r2)
            p90.q0 r2 = r0.f85098K
            p90.p7 r2 = r2.f69578p
            p90.o7 r2 = r2.f69544g
            android.widget.ImageView r12 = r2.f69491l
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            int r2 = p366bk.C10320i.f28688dc
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            r16 = 1
            g91.C32289b0.m95109u(r12, r13, r14, r15, r16, r17)
            p90.q0 r2 = r0.f85098K
            p90.p7 r2 = r2.f69578p
            p90.o7 r2 = r2.f69544g
            android.widget.FrameLayout r2 = r2.f69484e
            android.view.View$OnClickListener r3 = r0.f85133t0
            r2.setOnClickListener(r3)
            p90.q0 r2 = r0.f85098K
            p90.p7 r2 = r2.f69578p
            androidx.appcompat.widget.AppCompatTextView r2 = r2.f69549l
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = r19.getCity()
            if (r6 == 0) goto L_0x011a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r19.getCity()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            goto L_0x011b
        L_0x011a:
            r5 = r8
        L_0x011b:
            r3.append(r5)
            java.lang.String r5 = r19.getAddress()
            if (r5 == 0) goto L_0x0128
            java.lang.String r8 = r19.getAddress()
        L_0x0128:
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
            p90.q0 r2 = r0.f85098K
            p90.p7 r2 = r2.f69578p
            android.widget.LinearLayout r2 = r2.f69542e
            boolean r3 = r19.isAdapted()
            if (r3 == 0) goto L_0x013f
            r4 = r10
        L_0x013f:
            r2.setVisibility(r4)
            ge.bog.mobilebank.eventbus.events.MapObjectDetailsEvent r2 = new ge.bog.mobilebank.eventbus.events.MapObjectDetailsEvent
            r2.<init>()
            r0.f85123j0 = r2
            r2.setMapObject(r1)
            ge.bog.mobilebank.model.Client r2 = r0.f85090G
            r2.requestMapObjectDetails(r10, r1)
            goto L_0x022f
        L_0x0153:
            java.lang.String r2 = r19.getObject()
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0167
            java.lang.String r2 = r19.getObject()
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x022f
        L_0x0167:
            r2 = 5
            r0.m104312p4(r2)
            p90.q0 r2 = r0.f85098K
            p90.n7 r2 = r2.f69577o
            p90.o7 r2 = r2.f69397e
            androidx.appcompat.widget.AppCompatTextView r2 = r2.f69487h
            java.lang.String r3 = r19.getName()
            r2.setText(r3)
            p90.q0 r2 = r0.f85098K
            p90.n7 r2 = r2.f69577o
            ge.bog.mobilebank.ui.views.widgets.BogTextView r2 = r2.f69399g
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = r19.getCity()
            if (r6 == 0) goto L_0x019f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = r19.getCity()
            r6.append(r11)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            goto L_0x01a0
        L_0x019f:
            r5 = r8
        L_0x01a0:
            r3.append(r5)
            java.lang.String r5 = r19.getAddress()
            if (r5 == 0) goto L_0x01ad
            java.lang.String r8 = r19.getAddress()
        L_0x01ad:
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
            p90.q0 r2 = r0.f85098K
            p90.n7 r2 = r2.f69577o
            ge.bog.mobilebank.ui.views.widgets.BogTextView r2 = r2.f69400h
            java.lang.String r3 = "24 სთ"
            r2.setText(r3)
            p90.q0 r2 = r0.f85098K
            p90.n7 r2 = r2.f69577o
            android.widget.LinearLayout r2 = r2.f69398f
            boolean r3 = r19.getWorksFullTime()
            if (r3 == 0) goto L_0x01cf
            r4 = r10
        L_0x01cf:
            r2.setVisibility(r4)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r2.setShape(r9)
            int r3 = p366bk.C10319h.loan_stroke_width
            int r3 = g91.C32355x0.m95516g(r3)
            int r4 = p366bk.C10318g.bog_circular_image_container_grey_color
            int r4 = g91.C32355x0.m95514e(r4, r0)
            r2.setStroke(r3, r4)
            r2.setColor(r10)
            p90.q0 r3 = r0.f85098K
            p90.n7 r3 = r3.f69577o
            p90.o7 r3 = r3.f69397e
            android.widget.ImageView r11 = r3.f69491l
            java.lang.String r3 = r19.getObject()
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0201
            int r3 = p366bk.C10320i.ic_paybox
            goto L_0x0203
        L_0x0201:
            int r3 = p366bk.C10320i.ic_atm
        L_0x0203:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            int r3 = p366bk.C10320i.f28688dc
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            r15 = 1
            r16 = 1
            g91.C32289b0.m95101m(r11, r12, r13, r14, r15, r16)
            p90.q0 r3 = r0.f85098K
            p90.n7 r3 = r3.f69577o
            p90.o7 r3 = r3.f69397e
            android.widget.FrameLayout r3 = r3.f69490k
            r3.setBackground(r2)
            p90.q0 r2 = r0.f85098K
            p90.n7 r2 = r2.f69577o
            p90.o7 r2 = r2.f69397e
            android.widget.FrameLayout r2 = r2.f69484e
            android.view.View$OnClickListener r3 = r0.f85133t0
            r2.setOnClickListener(r3)
        L_0x022f:
            ge.bog.mobilebank.model.Client r2 = r0.f85090G
            r2.requestMapObjectStatus(r10, r1)
        L_0x0234:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.MapActivity.m104318s4(ge.bog.mobilebank.model.map.MapObject):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public void m104320t4(boolean z) {
        if (z) {
            int e = C32355x0.m95514e(C10318g.bog_circular_image_container_grey_color, this);
            if (this.f85098K.f69570h.f69309e.getAnimation() == null || !this.f85098K.f69570h.f69309e.getAnimation().hasStarted()) {
                this.f85098K.f69570h.f69309e.post(new C35266n());
            }
            for (int i = 0; i < this.f85098K.f69570h.f69309e.getChildCount(); i++) {
                View childAt = this.f85098K.f69570h.f69309e.getChildAt(i);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setStroke(C32355x0.m95516g(C10319h.loan_stroke_width), C32355x0.m95514e(C10318g.bog_circular_image_container_grey_color, this));
                gradientDrawable.setColor(e);
                childAt.findViewById(C10322k.rounded_container).setBackground(gradientDrawable);
            }
        } else if (this.f85098K.f69570h.f69309e.getAnimation() != null && this.f85098K.f69570h.f69309e.getAnimation().hasStarted()) {
            this.f85098K.f69570h.f69309e.getAnimation().cancel();
        }
    }

    /* renamed from: u4 */
    public static void m104322u4(Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intent intent = new Intent(context, MapActivity.class);
        intent.putExtra("SSC_SELECTED_ID", z);
        intent.putExtra("EXPRESS_SC_SELECTED_ID", z2);
        intent.putExtra("SOLO_SC_SELECTED_ID", z3);
        intent.putExtra("HOUR_24_SELECTED_ID", z4);
        intent.putExtra("ADAPTED_SELECTED", z5);
        context.startActivity(intent);
    }

    /* renamed from: v4 */
    private void m104324v4() {
        if (this.f85130q0 == null) {
            this.f85130q0 = new LocationService(this);
        }
    }

    /* renamed from: w4 */
    private void m104326w4() {
        LocationService locationService = this.f85130q0;
        if (locationService != null) {
            locationService.mo84075g();
            this.f85130q0 = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x4 */
    public void m104328x4() {
        C40769c cVar = this.f85091G0;
        if (cVar != null) {
            cVar.mo95011W0(C40992a.m118827a());
            this.f85091G0.onComplete();
            this.f85091G0 = null;
        }
    }

    /* renamed from: y4 */
    private void m104330y4() {
        if (this.f85104Q != null) {
            if (mo86257W3()) {
                Location location = this.f85103P;
                if (location != null) {
                    m104289d4(location.getLatitude(), this.f85103P.getLongitude(), 18.0f);
                } else {
                    m104291e4(f85082K0, 18.0f);
                }
            } else {
                m104291e4(f85082K0, 18.0f);
            }
            if (!this.f85097J0) {
                this.f85104Q.mo21886o(new C35261i());
                this.f85121h0.mo90446o(new C35262j());
                this.f85097J0 = true;
            }
        }
    }

    /* renamed from: N */
    public void mo21894N(C7465c cVar) {
        this.f85104Q = cVar;
        int i = 0;
        cVar.mo21879h().mo21898b(false);
        this.f85104Q.mo21879h().mo21897a(false);
        this.f85104Q.mo21879h().mo21899c(false);
        this.f85104Q.mo21882k(MapStyleOptions.m17480v(this, C10327p.google_maps_style));
        C37364b bVar = new C37364b(this, cVar);
        this.f85121h0 = bVar;
        bVar.mo183n(new C37385j(this, this.f85104Q, this.f85121h0));
        this.f85104Q.mo21884m(this.f85121h0);
        this.f85104Q.mo21889r(this.f85121h0);
        this.f85104Q.mo21885n(new C35258f());
        m104330y4();
        if (this.f85126m0 == null) {
            this.f85090G.requestMapObjects(false);
        } else {
            m104254L3();
        }
        MapObjectsEvent mapObjectsEvent = this.f85109V;
        if (mapObjectsEvent != null && mapObjectsEvent.getMapObjects() != null) {
            m104250J3(this.f85110W, false);
            m104312p4(0);
            if (this.f85098K.f69581s.getPanelState().equals(SlidingUpPanelLayout.C35567f.EXPANDED)) {
                this.f85102O.postDelayed(new C35259g(), 700);
            } else if (this.f85098K.f69581s.getPanelState().equals(SlidingUpPanelLayout.C35567f.COLLAPSED)) {
                this.f85102O.post(new C35260h());
            }
            C27398q0 q0Var = this.f85098K;
            Button button = q0Var.f69573k;
            if (q0Var.f69581s.getPanelState() != SlidingUpPanelLayout.C35567f.ANCHORED || this.f85109V == null) {
                i = 4;
            }
            button.setVisibility(i);
            m104287c4();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27398q0 d = C27398q0.m84895d(getLayoutInflater());
        this.f85098K = d;
        super.mo70996D2(bundle, d);
        m104306m4();
        C27405q7 q7Var = this.f85098K.f69583u;
        this.f85101N = new View[]{q7Var.f69622f, q7Var.f69623g, q7Var.f69624h};
        C7474d.m28434b(getApplicationContext(), C7474d.C7475a.LATEST, this);
        new C18168a(this, C10329r.LayerRadiusTop40Shadow30).mo45824a(this.f85098K.f69580r);
        this.f85135v0 = getIntent().getBooleanExtra("SSC_SELECTED_ID", false);
        this.f85136w0 = getIntent().getBooleanExtra("EXPRESS_SC_SELECTED_ID", false);
        this.f85137x0 = getIntent().getBooleanExtra("SOLO_SC_SELECTED_ID", false);
        this.f85138y0 = getIntent().getBooleanExtra("HOUR_24_SELECTED_ID", false);
        this.f85139z0 = getIntent().getBooleanExtra("ADAPTED_SELECTED", false);
        this.f85129p0 = new C32330r0((Activity) this);
        C36546y.m108282F().mo27138I("locations");
        MapObjectWrapper mapObjects = this.f85094I.getMapObjects();
        this.f85126m0 = mapObjects;
        if (mapObjects != null) {
            MapObjectsEvent mapObjectsEvent = new MapObjectsEvent();
            this.f85109V = mapObjectsEvent;
            mapObjectsEvent.setState(20);
            this.f85109V.setMapObjects(this.f85126m0);
        }
        this.f85111X = getResources().getInteger(C10323l.transition_anim_duration);
        this.f85098K.f69576n.setOnClickListener(this);
        this.f85098K.f69574l.setOnClickListener(this);
        this.f85098K.f69579q.mo3946b().setOnClickListener(this);
        ((SupportMapFragment) getSupportFragmentManager().mo4415j0(C10322k.map)).mo14063h1(this);
        C27398q0 q0Var = this.f85098K;
        this.f85100M = new View[]{this.f85098K.f69570h.mo3946b(), q0Var.f69568f, q0Var.f69567e, q0Var.f69578p.mo3946b(), this.f85098K.f69577o.mo3946b(), this.f85098K.f69569g.mo3946b()};
        m104314q4();
        for (View view : this.f85101N) {
            view.setOnClickListener(this.f85089F0);
            view.setVisibility(0);
        }
        ((TransitionDrawable) this.f85101N[0].getBackground()).startTransition(0);
        this.f85098K.f69569g.f70279k.setLayoutManager(new LinearLayoutManager(this));
        C32262n nVar = new C32262n(this, m104274V3(), this.f85085B0);
        this.f85120g0 = nVar;
        this.f85098K.f69569g.f70279k.setAdapter(nVar);
        C37109f fVar = new C37109f(this);
        this.f85119f0 = fVar;
        if (fVar.mo90037a()) {
            this.f85119f0.mo90038b(this.f85088E0);
        }
        this.f85127n0.setShape(1);
        this.f85128o0.setShape(1);
        this.f85134u0 = getIntent().getIntExtra("MAP_FILTER_KEY", -1);
        if ("ge.bog.mobilebank.appshortcuts.ATMS_AND_SERVICE_CENTERS".equals(getIntent().getAction())) {
            C36546y.m108282F().mo27152s("quick_actions_menu", "locations", "force_touch");
        }
        this.f85098K.f69583u.f69621e.setText(C27950a.m86284a("text.atms.and.branches.branches"));
    }

    /* renamed from: W3 */
    public boolean mo86257W3() {
        return C32330r0.m95338m(this, "android.permission.ACCESS_FINE_LOCATION");
    }

    /* renamed from: b */
    public void mo86258b(MapObject mapObject) {
        if (mapObject != null && mapObject.getClusterItem() != null && this.f85104Q != null) {
            m104264Q3(mapObject.getClusterItem().getPosition(), this.f85104Q.mo21876e().f14037e);
            mo188r0(mapObject.getClusterItem());
        }
    }

    /* renamed from: g4 */
    public boolean mo188r0(C37363a aVar) {
        m104270T3(aVar);
        m104308n4(aVar);
        m104300j4((MapObject) this.f85108U.get(aVar));
        return false;
    }

    /* renamed from: j */
    public void mo21895j(C7474d.C7475a aVar) {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10014 && i2 == -1) {
            m104324v4();
            m104330y4();
        }
    }

    public void onBackPressed() {
        int i = this.f85106S;
        if (i == 5 || i == 7 || i == 124) {
            this.f85133t0.onClick((View) null);
        } else {
            super.onBackPressed();
        }
    }

    public void onClick(View view) {
        C27398q0 q0Var = this.f85098K;
        if (q0Var.f69576n == view) {
            C7465c cVar = this.f85104Q;
            if (cVar == null) {
                return;
            }
            if (cVar.mo21877f() == 1) {
                this.f85104Q.mo21883l(2);
                this.f85098K.f69575m.setImageResource(C10320i.ic_map_normal);
                return;
            }
            this.f85104Q.mo21883l(1);
            this.f85098K.f69575m.setImageResource(C10320i.ic_map_terrain);
        } else if (q0Var.f69574l == view) {
            Location location = this.f85103P;
            if (location != null) {
                m104262P3(location.getLatitude(), this.f85103P.getLongitude(), 18.0f);
            }
        } else if (q0Var.f69579q.mo3946b() == view) {
            this.f85090G.requestMapObjects(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C32343x.m95489t1(this.f85092H, this);
    }

    @C41452l
    public void onLocationChanged(LocationChangedEvent locationChangedEvent) {
        LatLng latLng = new LatLng(locationChangedEvent.getLocation().getLatitude(), locationChangedEvent.getLocation().getLongitude());
        if (this.f85103P == null) {
            m104264Q3(latLng, this.f85104Q.mo21876e().f14037e);
        }
        C32359z0.m95575j0("latNg " + latLng);
        Location location = locationChangedEvent.getLocation();
        this.f85103P = location;
        this.f85105R.mo72779j(location);
        if (this.f85104Q != null) {
            MapObject mapObject = this.f85125l0;
            if (mapObject != null) {
                mo86258b(mapObject);
                this.f85125l0 = null;
            }
            C7899d dVar = this.f85116c0;
            if (dVar == null) {
                this.f85116c0 = this.f85104Q.mo21873b(new MarkerOptions().mo14139H1(C7897b.m29876b(C10320i.pin_me_marker)).mo14143L1(latLng));
            } else {
                dVar.mo22879g(latLng);
            }
            C7899d dVar2 = this.f85117d0;
            if (dVar2 == null) {
                this.f85117d0 = this.f85104Q.mo21873b(new MarkerOptions().mo14139H1(C7897b.m29876b(C10320i.f28663F3)).mo14153v(0.5f, 0.5f).mo14143L1(latLng));
            } else {
                dVar2.mo22879g(latLng);
            }
            if (this.f85118e0 == null) {
                this.f85118e0 = this.f85104Q.mo21872a(new CircleOptions().mo14108v(latLng).mo14100H1((double) locationChangedEvent.getLocation().getAccuracy()).mo14101I1(Utils.FLOAT_EPSILON).mo14109w(C32335t0.m95360e(this, C10316e.colorAccentTrans, false)));
            }
            this.f85118e0.mo22868a(latLng);
            this.f85118e0.mo22869b((double) locationChangedEvent.getLocation().getAccuracy());
        }
    }

    @SuppressLint({"InflateParams"})
    @C41452l
    public void onMapObjectDetailEvent(MapObjectDetailsEvent mapObjectDetailsEvent) {
        if (this.f85123j0 != null && mapObjectDetailsEvent.getMapObject().getObjectKey().equals(this.f85123j0.getMapObject().getObjectKey()) && mapObjectDetailsEvent.getMapObject().getObjectName().equals(this.f85123j0.getMapObject().getObjectName())) {
            this.f85123j0 = mapObjectDetailsEvent;
            int state = mapObjectDetailsEvent.getState();
            if (state == 10) {
                this.f85098K.f69578p.f69552o.setVisibility(8);
                this.f85098K.f69578p.f69543f.setVisibility(8);
                mo86441o2();
            } else if (state == 20) {
                mo86425J1();
                this.f85098K.f69578p.f69543f.setVisibility(8);
                this.f85098K.f69578p.f69553p.smoothScrollTo(0, 0);
                this.f85098K.f69578p.f69552o.setVisibility(0);
                LinearLayout linearLayout = this.f85098K.f69578p.f69550m;
                linearLayout.removeAllViews();
                if (this.f85123j0.getMapObject().getDetails() != null && this.f85123j0.getMapObject().getDetails().getObjectSchedule() != null) {
                    Iterator<MapObjectSchedule> it = this.f85123j0.getMapObject().getDetails().getObjectSchedule().iterator();
                    while (it.hasNext()) {
                        MapObjectSchedule next = it.next();
                        TextView textView = (TextView) getLayoutInflater().inflate(C10324m.map_object_schedule_text_view, (ViewGroup) null);
                        textView.setPadding(0, C32355x0.m95516g(C10319h.one_dip), 0, 0);
                        textView.setText(next.getWorkingDayGroupName());
                        TextView textView2 = (TextView) getLayoutInflater().inflate(C10324m.map_object_schedule_hours_text_view, (ViewGroup) null);
                        textView2.setText(next.getWorkingHoursName());
                        this.f85098K.f69578p.f69550m.addView(textView, linearLayout.getChildCount());
                        this.f85098K.f69578p.f69550m.addView(textView2, linearLayout.getChildCount());
                    }
                    Iterator<MapObjectService> it2 = this.f85123j0.getMapObject().getDetails().getServices().iterator();
                    String str = "";
                    String str2 = str;
                    while (it2.hasNext()) {
                        MapObjectService next2 = it2.next();
                        if (next2.getCustomerType().equals(PensionStatusResult.STATUS_INACTIVE)) {
                            if (str2.length() > 0) {
                                str2 = str2 + ", ";
                            }
                            str2 = str2 + next2.getServiceName();
                        } else if (next2.getCustomerType().equals("C")) {
                            if (str.length() > 0) {
                                str = str + ", ";
                            }
                            str = str + next2.getServiceName();
                        }
                    }
                    if (!str.isEmpty() && !str2.isEmpty()) {
                        this.f85098K.f69578p.f69554q.setVisibility(0);
                        this.f85098K.f69578p.f69545h.setVisibility(0);
                        this.f85098K.f69578p.f69546i.setText(getString(C10328q.map_object_corporate_client_services));
                        this.f85098K.f69578p.f69547j.setText(str);
                        this.f85098K.f69578p.f69555r.setText(getString(C10328q.map_object_individual_client_services));
                        this.f85098K.f69578p.f69556s.setText(str2);
                    } else if (!str.isEmpty()) {
                        this.f85098K.f69578p.f69554q.setVisibility(8);
                        this.f85098K.f69578p.f69545h.setVisibility(0);
                        this.f85098K.f69578p.f69546i.setText(getString(C10328q.map_object_corporate_client_services));
                        this.f85098K.f69578p.f69547j.setText(str);
                    } else if (!str2.isEmpty()) {
                        this.f85098K.f69578p.f69554q.setVisibility(8);
                        this.f85098K.f69578p.f69545h.setVisibility(0);
                        this.f85098K.f69578p.f69546i.setText(getString(C10328q.map_object_individual_client_services));
                        this.f85098K.f69578p.f69547j.setText(str2);
                    } else {
                        this.f85098K.f69578p.f69554q.setVisibility(8);
                        this.f85098K.f69578p.f69545h.setVisibility(8);
                    }
                }
            } else if (state == 30 || state == 40) {
                this.f85098K.f69578p.f69552o.setVisibility(8);
                mo86425J1();
                this.f85098K.f69578p.f69543f.setVisibility(0);
                this.f85098K.f69578p.f69551n.mo3946b().setOnClickListener(new C35264l());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        if (r0 != 40) goto L_0x00aa;
     */
    @jg1.C41452l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMapObjectStatusEvent(p341ge.bog.mobilebank.eventbus.events.MapObjectStatusEvent r4) {
        /*
            r3 = this;
            ge.bog.mobilebank.eventbus.events.MapObjectStatusEvent r0 = r3.f85124k0
            if (r0 == 0) goto L_0x00c4
            ge.bog.mobilebank.model.map.MapObject r0 = r4.getMapObject()
            java.lang.String r0 = r0.getObjectKey()
            ge.bog.mobilebank.eventbus.events.MapObjectStatusEvent r1 = r3.f85124k0
            ge.bog.mobilebank.model.map.MapObject r1 = r1.getMapObject()
            java.lang.String r1 = r1.getObjectKey()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c4
            ge.bog.mobilebank.model.map.MapObject r0 = r4.getMapObject()
            java.lang.String r0 = r0.getObjectName()
            ge.bog.mobilebank.eventbus.events.MapObjectStatusEvent r1 = r3.f85124k0
            ge.bog.mobilebank.model.map.MapObject r1 = r1.getMapObject()
            java.lang.String r1 = r1.getObjectName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c4
            ge.bog.mobilebank.model.map.MapObject r0 = r4.getMapObject()
            java.lang.String r0 = r0.getObjectType()
            ge.bog.mobilebank.eventbus.events.MapObjectStatusEvent r1 = r3.f85124k0
            ge.bog.mobilebank.model.map.MapObject r1 = r1.getMapObject()
            java.lang.String r1 = r1.getObjectType()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c4
            r3.f85124k0 = r4
            int r0 = r4.getState()
            r1 = 10
            if (r0 == r1) goto L_0x0096
            r1 = 20
            if (r0 == r1) goto L_0x0063
            r4 = 30
            if (r0 == r4) goto L_0x0096
            r4 = 40
            if (r0 == r4) goto L_0x0096
            goto L_0x00aa
        L_0x0063:
            android.graphics.drawable.GradientDrawable r0 = r3.f85127n0
            java.lang.String r1 = r4.getStatus()
            java.lang.String r2 = "Y"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0074
            int r1 = p366bk.C10318g.f28640b1
            goto L_0x0076
        L_0x0074:
            int r1 = p366bk.C10318g.color_invert_background_popup
        L_0x0076:
            int r1 = g91.C32355x0.m95514e(r1, r3)
            r0.setColor(r1)
            android.graphics.drawable.GradientDrawable r0 = r3.f85128o0
            java.lang.String r4 = r4.getStatus()
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x008c
            int r4 = p366bk.C10318g.f28640b1
            goto L_0x008e
        L_0x008c:
            int r4 = p366bk.C10318g.color_invert_background_popup
        L_0x008e:
            int r4 = g91.C32355x0.m95514e(r4, r3)
            r0.setColor(r4)
            goto L_0x00aa
        L_0x0096:
            android.graphics.drawable.GradientDrawable r4 = r3.f85127n0
            int r0 = p366bk.C10318g.color_invert_background_popup
            int r1 = g91.C32355x0.m95514e(r0, r3)
            r4.setColor(r1)
            android.graphics.drawable.GradientDrawable r4 = r3.f85128o0
            int r0 = g91.C32355x0.m95514e(r0, r3)
            r4.setColor(r0)
        L_0x00aa:
            p90.q0 r4 = r3.f85098K
            p90.p7 r4 = r4.f69578p
            p90.o7 r4 = r4.f69544g
            android.view.View r4 = r4.f69489j
            android.graphics.drawable.GradientDrawable r0 = r3.f85127n0
            r4.setBackground(r0)
            p90.q0 r4 = r3.f85098K
            p90.n7 r4 = r4.f69577o
            p90.o7 r4 = r4.f69397e
            android.view.View r4 = r4.f69489j
            android.graphics.drawable.GradientDrawable r0 = r3.f85128o0
            r4.setBackground(r0)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.MapActivity.onMapObjectStatusEvent(ge.bog.mobilebank.eventbus.events.MapObjectStatusEvent):void");
    }

    @C41452l
    public void onMapObjectsEvent(MapObjectsEvent mapObjectsEvent) {
        if (this.f85109V != mapObjectsEvent) {
            this.f85109V = mapObjectsEvent;
            int state = mapObjectsEvent.getState();
            if (state == 10) {
                m104312p4(10);
            } else if (state == 20) {
                m104250J3(this.f85110W, false);
                m104312p4(0);
                this.f85094I.syncMapObject(mapObjectsEvent.getMapObjects());
            } else if (state == 30) {
                m104312p4(-10);
            } else if (state == 40) {
                m104312p4(-10);
            }
        }
        m104254L3();
    }

    @C41452l
    public void onMapRegionsEvent(MapRegionsEvent mapRegionsEvent) {
        int state = mapRegionsEvent.getState();
        if (state == 10) {
            this.f85098K.f69573k.setEnabled(false);
        } else if (state == 20) {
            this.f85099L = mapRegionsEvent.getMapRegions();
            this.f85098K.f69573k.setEnabled(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (this.f85119f0.mo90037a()) {
            this.f85119f0.mo90040d();
        }
        C40769c cVar = this.f85091G0;
        if (cVar != null) {
            cVar.mo95011W0(C40992a.m118827a());
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1 && strArr.length > 0 && strArr[0].equals("android.permission.ACCESS_FINE_LOCATION") && iArr[0] == 0) {
            m104324v4();
            m104330y4();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f85119f0.mo90037a()) {
            this.f85119f0.mo90039c();
        }
        C40769c cVar = this.f85091G0;
        if (cVar != null) {
            cVar.mo95016c(m104268S3(this.f85093H0));
        }
    }

    public void onStart() {
        super.onStart();
        C32343x.m95423W0(this.f85092H, this);
        if (this.f85104Q != null) {
            if (this.f85126m0 == null) {
                this.f85090G.requestMapObjects(false);
            } else {
                m104250J3(this.f85110W, false);
                m104312p4(0);
                m104254L3();
            }
        }
        this.f85090G.requestMapRegions();
        MapObjectDetailsEvent mapObjectDetailsEvent = this.f85123j0;
        if (!(mapObjectDetailsEvent == null || this.f85124k0 == null)) {
            this.f85090G.requestMapObjectDetails(false, mapObjectDetailsEvent.getMapObject());
            this.f85090G.requestMapObjectStatus(false, this.f85123j0.getMapObject());
        }
        if (!this.f85129p0.mo72839z(1)) {
            m104324v4();
        }
    }

    public void onStop() {
        super.onStop();
        this.f85092H.mo96186s(this);
        m104326w4();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C27950a.m86284a("search.modules.atms.and.branches");
    }
}
