package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30521a2;
import a81.C30522a3;
import a81.C30523a4;
import a81.C30535b2;
import a81.C30536b3;
import a81.C30537b4;
import a81.C30549c2;
import a81.C30550c3;
import a81.C30551c4;
import a81.C30563d2;
import a81.C30564d3;
import a81.C30565d4;
import a81.C30577e2;
import a81.C30578e3;
import a81.C30579e4;
import a81.C30591f2;
import a81.C30592f3;
import a81.C30593f4;
import a81.C30605g2;
import a81.C30606g3;
import a81.C30607g4;
import a81.C30619h2;
import a81.C30620h3;
import a81.C30621h4;
import a81.C30633i2;
import a81.C30634i3;
import a81.C30635i4;
import a81.C30647j2;
import a81.C30648j3;
import a81.C30649j4;
import a81.C30659k1;
import a81.C30660k2;
import a81.C30661k3;
import a81.C30662k4;
import a81.C30672l1;
import a81.C30674l3;
import a81.C30675l4;
import a81.C30685m1;
import a81.C30686m2;
import a81.C30688m4;
import a81.C30698n1;
import a81.C30699n2;
import a81.C30700n3;
import a81.C30701n4;
import a81.C30711o1;
import a81.C30712o2;
import a81.C30714o4;
import a81.C30724p1;
import a81.C30725p2;
import a81.C30726p3;
import a81.C30737q1;
import a81.C30739q3;
import a81.C30750r1;
import a81.C30751r2;
import a81.C30752r3;
import a81.C30753r4;
import a81.C30763s1;
import a81.C30764s2;
import a81.C30765s3;
import a81.C30776t1;
import a81.C30777t2;
import a81.C30778t3;
import a81.C30789u1;
import a81.C30790u2;
import a81.C30791u3;
import a81.C30802v1;
import a81.C30803v2;
import a81.C30804v3;
import a81.C30815w1;
import a81.C30816w2;
import a81.C30817w3;
import a81.C30828x1;
import a81.C30829x2;
import a81.C30830x3;
import a81.C30841y1;
import a81.C30842y2;
import a81.C30843y3;
import a81.C30854z1;
import a81.C30855z2;
import a81.C30856z3;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0840b;
import androidx.fragment.app.C1464a0;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1620q0;
import androidx.viewpager2.widget.ViewPager2;
import ba1.C10146d0;
import c60.C19499f;
import c60.C19511i;
import c60.C19513j;
import com.bumptech.glide.C2379b;
import com.github.mikephil.charting.utils.Utils;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import de1.C40640a;
import e20.C20129c;
import f20.C20334c;
import g91.C32288b;
import g91.C32297d;
import g91.C32300e0;
import g91.C32303f;
import g91.C32312j;
import g91.C32313j0;
import g91.C32319m;
import g91.C32330r0;
import g91.C32335t0;
import g91.C32343x;
import g91.C32355x0;
import gd1.C40992a;
import h00.C24849e;
import hc1.C41185v;
import hd1.C41205b;
import he1.C41224m;
import he1.C41232r;
import he1.C41238w;
import ih0.C25210c;
import ih0.C25211d;
import ih0.C25212e;
import iu0.C36546y;
import j51.C36735g;
import j51.C36742n;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import jd1.C41399f;
import jg1.C41438c;
import jg1.C41452l;
import l20.C25800a;
import m41.C37223a;
import m41.C37224b;
import m50.C26143a;
import m50.C26146d;
import m51.C37228a;
import n41.C37353c;
import n50.C26370a;
import org.parceler.C42035e;
import p045d.C5769a;
import p050d4.C5817c;
import p063e4.C6032d;
import p30.C27185o;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.dialog.ModalDialog;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.cleanarch.mainactivity.model.ExpiringCardPopUpData;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21507e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.DialogManager;
import p341ge.bog.mobilebank.cleanarch.presentation.common.manager.popupmanager.C21546a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.manager.popupmanager.PopupManager;
import p341ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity;
import p341ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity;
import p341ge.bog.mobilebank.eventbus.event.ExternalUserStoredEvent;
import p341ge.bog.mobilebank.eventbus.events.ConvertSmsToPushEvent;
import p341ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent;
import p341ge.bog.mobilebank.eventbus.events.NotificationCountEvent;
import p341ge.bog.mobilebank.eventbus.events.SmsToPushStateEvent;
import p341ge.bog.mobilebank.eventbus.events.TemplatesAndConfigEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.ToastNotificationArgumentsWrapper;
import p341ge.bog.mobilebank.model.search.SearchResultType;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateGroup;
import p341ge.bog.mobilebank.model.usrinfo.ClientPlusLabelChange;
import p341ge.bog.mobilebank.model.usrinfo.StatusDialogIcon;
import p341ge.bog.mobilebank.model.usrinfo.StatusDialogType;
import p341ge.bog.mobilebank.p975ui.fragments.C35612i1;
import p341ge.bog.mobilebank.p975ui.fragments.C35635k0;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.p975ui.fragments.C35660q1;
import p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter;
import p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenterImpl;
import p341ge.bog.mobilebank.payment.activities.PaymentFormActivity;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.GooglePayState;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.rest.model.otpparameter.TrustDeviceParams;
import p341ge.bog.mobilebank.shared.OtherTransferTypeState;
import p341ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow;
import p341ge.bog.mobilebank.shared2.environment.EnvironmentType;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p341ge.bog.mobilebank.sso.presentation.C34709c;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p349ah.C9860d;
import p366bk.C10316e;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10325n;
import p366bk.C10328q;
import p380ck.C10457a;
import p380ck.C10464h;
import p420fh.C12902d;
import p420fh.C12910e;
import p642vh.C18368l;
import p644vj.C18394d;
import p657wj.C18601e;
import p714az.C19288a;
import p714az.C19289b;
import p714az.C19290c;
import p719bu.C19411a;
import p725cr.C19788a;
import p729cv.C19799c;
import p745er.C20288a;
import p748eu.C20292b;
import p758fu.C20557a;
import p769gr.C24776a;
import p779hr.C25052b;
import p802jv.C25505j;
import p843nw.C26625h;
import p843nw.C26630l;
import p843nw.C26633o;
import p843nw.C26635p;
import p863pw.C27631i;
import p863pw.C27634l;
import p863pw.C27635m;
import p863pw.C27637o;
import p90.C27371n0;
import p942xq.C29824b;
import pc0.C27494a;
import q31.C38122f;
import q31.C38125h;
import q81.C38174g;
import q81.C38194r;
import q81.C38223z;
import r50.C27942j;
import r90.C27950a;
import y00.C29884b;
import y60.C29932d;

/* renamed from: ge.bog.mobilebank.ui.activities.MainActivity */
public class MainActivity extends C35514u implements C19499f.C19500a, C41185v.C41186a {

    /* renamed from: A0 */
    private C41399f f84889A0;

    /* renamed from: G */
    private final AtomicInteger f84890G = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C27371n0 f84891H;

    /* renamed from: I */
    private JuniorRequestDataUiModel f84892I;

    /* renamed from: J */
    protected PreferencesApiManager f84893J;

    /* renamed from: K */
    public C21546a f84894K;

    /* renamed from: L */
    public C26146d f84895L;

    /* renamed from: M */
    public C19411a f84896M;

    /* renamed from: N */
    protected C27494a f84897N;

    /* renamed from: O */
    C25505j f84898O;

    /* renamed from: P */
    C19799c f84899P;

    /* renamed from: Q */
    C26630l f84900Q;

    /* renamed from: R */
    C26633o f84901R;

    /* renamed from: S */
    C36742n f84902S;

    /* renamed from: T */
    C26625h f84903T;

    /* renamed from: U */
    C29824b f84904U;

    /* renamed from: V */
    C26635p f84905V;

    /* renamed from: W */
    C36735g f84906W;

    /* renamed from: X */
    protected BankApi f84907X;

    /* renamed from: Y */
    protected Client f84908Y;

    /* renamed from: Z */
    protected C41438c f84909Z;

    /* renamed from: a0 */
    protected C20292b f84910a0;

    /* renamed from: b0 */
    protected TargetEnvironment f84911b0;

    /* renamed from: c0 */
    private TemplatesAndConfigEvent f84912c0;

    /* renamed from: d0 */
    private String f84913d0;

    /* renamed from: e0 */
    private boolean f84914e0;

    /* renamed from: f0 */
    private boolean f84915f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public C35202l f84916g0;

    /* renamed from: h0 */
    private MainBottomNavigationViewPresenter f84917h0;

    /* renamed from: i0 */
    private final DialogManager f84918i0 = new DialogManager();

    /* renamed from: j0 */
    public PopupManager f84919j0;

    /* renamed from: k0 */
    public C26143a f84920k0;

    /* renamed from: l0 */
    private int f84921l0 = 0;

    /* renamed from: m0 */
    private int f84922m0 = 0;

    /* renamed from: n0 */
    private final Handler f84923n0 = new Handler(Looper.getMainLooper());

    /* renamed from: o0 */
    private View f84924o0;

    /* renamed from: p0 */
    private PopupWindow f84925p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public MainActivityViewModel$ViewModel f84926q0;

    /* renamed from: r0 */
    private boolean f84927r0 = false;

    /* renamed from: s0 */
    private ViewTreeObserver.OnGlobalLayoutListener f84928s0 = new C35193c();

    /* renamed from: t0 */
    private boolean f84929t0;

    /* renamed from: u0 */
    private float f84930u0 = -1.0f;

    /* renamed from: v0 */
    Long f84931v0 = null;

    /* renamed from: w0 */
    boolean f84932w0 = false;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public C21507e f84933x0 = null;

    /* renamed from: y0 */
    private final ViewPager2.C1928i f84934y0 = new C35191a();

    /* renamed from: z0 */
    private SmsToPushStateEvent f84935z0;

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivity$a */
    class C35191a extends ViewPager2.C1928i {
        C35191a() {
        }

        /* renamed from: a */
        private void m103912a(int i) {
            MainActivity.this.m103763a5(i);
        }

        public void onPageSelected(int i) {
            MainActivity.this.mo86159s7(false);
            Fragment z = MainActivity.this.f84916g0.mo70156z(i);
            if (z instanceof C20334c) {
                MainActivity.this.mo86159s7(true);
            }
            if (MainActivity.this.f84933x0 != null) {
                MainActivity.this.f84933x0.mo41972d3();
            }
            if (z instanceof C21507e) {
                MainActivity.this.f84933x0 = (C21507e) z;
                MainActivity.this.f84933x0.mo41971b3();
            } else {
                MainActivity.this.f84933x0 = null;
            }
            if (z == MainActivity.this.f84916g0.m103928H()) {
                C27185o oVar = (C27185o) z;
                if (oVar != null) {
                    oVar.mo66478a2();
                }
                C36546y.m108282F().mo27137H("open_payments", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
                MedalliaDigital.disableIntercept();
            } else {
                MedalliaDigital.enableIntercept();
            }
            MainActivity.this.m103891z7(i);
            m103912a(i);
            MainActivity.this.f84926q0.f84958F.mo70945Hn(i);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivity$b */
    static /* synthetic */ class C35192b {

        /* renamed from: a */
        static final /* synthetic */ int[] f84937a;

        /* renamed from: b */
        static final /* synthetic */ int[] f84938b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0079 */
        static {
            /*
                az.c[] r0 = p714az.C19290c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f84938b = r0
                r1 = 1
                az.c r2 = p714az.C19290c.DARK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f84938b     // Catch:{ NoSuchFieldError -> 0x001d }
                az.c r3 = p714az.C19290c.LIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f84938b     // Catch:{ NoSuchFieldError -> 0x0028 }
                az.c r4 = p714az.C19290c.FILLED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$NavigationItem[] r3 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter.NavigationItem.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f84937a = r3
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$NavigationItem r4 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter.NavigationItem.HOME     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f84937a     // Catch:{ NoSuchFieldError -> 0x0043 }
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$NavigationItem r3 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter.NavigationItem.CARDS     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f84937a     // Catch:{ NoSuchFieldError -> 0x004d }
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$NavigationItem r1 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter.NavigationItem.PRODUCTS     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f84937a     // Catch:{ NoSuchFieldError -> 0x0058 }
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$NavigationItem r1 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter.NavigationItem.PAYMENTS     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f84937a     // Catch:{ NoSuchFieldError -> 0x0063 }
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$NavigationItem r1 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter.NavigationItem.TRANSFERS     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f84937a     // Catch:{ NoSuchFieldError -> 0x006e }
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$NavigationItem r1 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter.NavigationItem.STATEMENTS     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f84937a     // Catch:{ NoSuchFieldError -> 0x0079 }
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$NavigationItem r1 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter.NavigationItem.DISCOVER     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = f84937a     // Catch:{ NoSuchFieldError -> 0x0085 }
                ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenter$NavigationItem r1 = p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenter.NavigationItem.HUB     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.MainActivity.C35192b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivity$c */
    class C35193c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        private int f84939d = -1;

        C35193c() {
        }

        public void onGlobalLayout() {
            boolean z;
            Rect rect = new Rect();
            if (MainActivity.this.f84891H != null) {
                MainActivity.this.f84891H.mo3946b().getWindowVisibleDisplayFrame(rect);
                int height = MainActivity.this.f84891H.mo3946b().getHeight() - rect.bottom;
                if (height != this.f84939d) {
                    this.f84939d = height;
                    MainActivity mainActivity = MainActivity.this;
                    if (height > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mainActivity.m103748X7(z);
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivity$d */
    class C35194d implements ViewTreeObserver.OnGlobalLayoutListener {
        C35194d() {
        }

        public void onGlobalLayout() {
            MainActivity.this.m103787e5();
            MainActivity.this.m103731U7();
            C32355x0.m95523n(MainActivity.this.f85671t, this);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivity$e */
    class C35195e extends C5817c {

        /* renamed from: g */
        final /* synthetic */ C19289b f84942g;

        C35195e(C19289b bVar) {
            this.f84942g = bVar;
        }

        /* renamed from: c */
        public void mo7276b(Bitmap bitmap, C6032d dVar) {
            C19290c cVar;
            MainActivity.this.f84891H.mo3946b().setBackground(MainActivity.this.m103829m7(new BitmapDrawable(MainActivity.this.getResources(), bitmap)));
            MainActivity mainActivity = MainActivity.this;
            if (this.f84942g.mo47518b()) {
                cVar = C19290c.DARK;
            } else {
                cVar = C19290c.LIGHT;
            }
            mainActivity.m103876w7(cVar);
        }

        /* renamed from: i */
        public void mo7284i(Drawable drawable) {
        }

        /* renamed from: k */
        public void mo7288k(Drawable drawable) {
            MainActivity.this.m103866u7();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivity$f */
    class C35196f implements Animator.AnimatorListener {
        C35196f() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m103918b() {
            MainActivity.this.f84891H.f69338s.setVisibility(8);
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            MainActivity.this.f84891H.f69338s.animate().alpha(Utils.FLOAT_EPSILON).withEndAction(new C35543y0(this));
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivity$g */
    class C35197g implements Animator.AnimatorListener {
        C35197g() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m103920b() {
            MainActivity.this.f84891H.f69332m.setVisibility(8);
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            MainActivity.this.f84891H.f69332m.animate().alpha(Utils.FLOAT_EPSILON).withEndAction(new C35547z0(this));
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivity$h */
    class C35198h implements Animator.AnimatorListener {
        C35198h() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            MainActivity.this.m103737V7();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivity$i */
    class C35199i extends RestCallback {
        C35199i() {
        }

        public void onEnqueue(C41205b bVar) {
            MainActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            C32297d.m95153a(MainActivity.this);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivity$j */
    class C35200j extends RestCallback {
        C35200j() {
        }

        public void onEnqueue(C41205b bVar) {
            MainActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            MainActivity.this.m103888z4();
            C32297d.m95153a(MainActivity.this);
            super.onFailure(th);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (MainActivity.this.m103745X4() != null) {
                MainActivity.this.m103745X4().mo95635L2(false);
            }
            if (bankApiResponse.isSuccess()) {
                MainActivity mainActivity = MainActivity.this;
                C32297d.m95160h(mainActivity, mainActivity.getString(C10328q.device_trusted_successfully));
                MainActivity.this.m103888z4();
            } else if (!bankApiResponse.isScaError() || MainActivity.this.m103745X4() == null) {
                MainActivity.this.m103888z4();
                MainActivity mainActivity2 = MainActivity.this;
                C32297d.m95154b(mainActivity2, mainActivity2.getString(C10328q.device_trust_error));
            } else {
                MainActivity.this.m103745X4().mo95634K2(C27950a.m86284a(bankApiResponse.getKey()));
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivity$k */
    private enum C35201k {
        SAVE_TRUSTED,
        SMS_TO_PUSH
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.MainActivity$l */
    private class C35202l extends C29884b {
        C35202l(FragmentManager fragmentManager, C1593j jVar) {
            super(fragmentManager, jVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: F */
        public C20334c m103926F() {
            Fragment z = mo70156z(0);
            if (z instanceof C20334c) {
                return (C20334c) z;
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: G */
        public Fragment m103927G() {
            Fragment z = mo70156z(3);
            if (!(z instanceof C35635k0)) {
                return z;
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: H */
        public C27185o m103928H() {
            Fragment z = mo70156z(2);
            if (z instanceof C27185o) {
                return (C27185o) z;
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: I */
        public C35612i1 m103929I() {
            Fragment z = mo70156z(1);
            if (z instanceof C35612i1) {
                return (C35612i1) z;
            }
            return null;
        }

        /* renamed from: A */
        public Fragment mo70155A(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return C27185o.m84186L1(true);
                    }
                    if (i != 3) {
                        if (i != 4) {
                            return new Fragment();
                        }
                        if (MainActivity.this.f84908Y.isAuthorized()) {
                            return MainActivity.this.m103682M4().mo91627r0(true);
                        }
                        return MainActivity.this.m103682M4().mo91621o0(true);
                    } else if (MainActivity.this.f84908Y.isAuthorized()) {
                        return MainActivity.this.m103682M4().mo91633u0(true);
                    } else {
                        return C35635k0.m105842j1(true);
                    }
                } else if (MainActivity.this.f84908Y.isAuthorized()) {
                    return new C35612i1();
                } else {
                    return C35660q1.m105895i1(true);
                }
            } else if (MainActivity.this.f84908Y.isAuthorized()) {
                return C20334c.m66429Q1();
            } else {
                return C34709c.m101936l1();
            }
        }

        /* renamed from: J */
        public void mo86177J() {
            notifyDataSetChanged();
        }

        /* renamed from: g */
        public boolean mo6570g(long j) {
            return (!MainActivity.this.f84908Y.isAuthorized() && j >= 5) || (MainActivity.this.f84908Y.isAuthorized() && j < 5 && j >= 0);
        }

        public int getItemCount() {
            return 5;
        }

        public long getItemId(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return super.getItemId(i);
                            }
                            if (MainActivity.this.f84908Y.isAuthorized()) {
                                return 4;
                            }
                            return 9;
                        } else if (MainActivity.this.f84908Y.isAuthorized()) {
                            return 3;
                        } else {
                            return 8;
                        }
                    } else if (MainActivity.this.f84908Y.isAuthorized()) {
                        return 2;
                    } else {
                        return 7;
                    }
                } else if (MainActivity.this.f84908Y.isAuthorized()) {
                    return 1;
                } else {
                    return 6;
                }
            } else if (MainActivity.this.f84908Y.isAuthorized()) {
                return 0;
            } else {
                return 5;
            }
        }
    }

    /* renamed from: A4 */
    private void m103613A4() {
        this.f84891H.f69328i.postDelayed(new C30662k4(this), 1400);
        this.f84891H.f69322A.postDelayed(new C30675l4(this), 1200);
    }

    /* access modifiers changed from: private */
    /* renamed from: A5 */
    public /* synthetic */ void m103614A5(C13310d dVar, String str, Button button) {
        this.f84893J.saveCheckSmsToPush(false);
        dVar.mo4577k1();
        C36546y.m108282F().mo27152s("smstopush", str, "no");
    }

    /* access modifiers changed from: private */
    /* renamed from: A6 */
    public /* synthetic */ void m103615A6(C27637o oVar) {
        this.f84919j0.mo53846i(PopupManager.C21539b.DIGITAL_CARD_ON_BOARDING_DIALOG_ID, m103653H4(m103659I4(oVar)), true);
    }

    /* renamed from: A7 */
    private void m103616A7() {
        this.f85671t.setNavigationIcon(C10320i.icons_16_general_qr);
        this.f85671t.setNavigationEnabled(true);
        this.f85671t.setNavigationOnClickListener(new C30828x1(this));
    }

    /* renamed from: B4 */
    private void m103619B4() {
        this.f84891H.f69330k.animate().alpha(1.0f).setDuration(600);
        this.f84891H.f69333n.animate().alpha(Utils.FLOAT_EPSILON).setDuration(700);
        this.f84891H.f69334o.animate().alpha(1.0f).setDuration(600).setStartDelay(200).y((float) this.f84891H.f69330k.getBottom()).setInterpolator(new DecelerateInterpolator()).setListener(new C35197g());
        this.f84891H.f69322A.postDelayed(new C30675l4(this), 900);
    }

    /* access modifiers changed from: private */
    /* renamed from: B5 */
    public /* synthetic */ void m103620B5(C19513j jVar, C13310d dVar, String str, Button button) {
        if ((jVar instanceof C19513j.C19515b) || (jVar instanceof C19513j.C19516c)) {
            C19499f.m65082M1(jVar.mo47751a()).mo4576A1(getSupportFragmentManager(), "SmsToPushChooseNumbersDialogFragment");
        } else {
            mo47739X(jVar.mo47751a());
        }
        dVar.mo4577k1();
        C36546y.m108282F().mo27152s("smstopush", str, "yes");
    }

    /* access modifiers changed from: private */
    /* renamed from: B6 */
    public /* synthetic */ void m103621B6(Throwable th) {
        this.f84919j0.mo53846i(PopupManager.C21539b.DIGITAL_CARD_ON_BOARDING_DIALOG_ID, m103653H4((Long) null), true);
    }

    /* renamed from: B7 */
    private void m103622B7() {
        this.f84916g0 = new C35202l(getSupportFragmentManager(), getLifecycle());
        if (this.f84908Y.isAuthorized()) {
            this.f84917h0.updateStateFor(MainBottomNavigationViewPresenter.NavigationItem.PRODUCTS);
            this.f84917h0.updateStateFor(MainBottomNavigationViewPresenter.NavigationItem.DISCOVER);
        } else {
            this.f84917h0.updateStateFor(MainBottomNavigationViewPresenter.NavigationItem.CARDS);
            this.f84917h0.updateStateFor(MainBottomNavigationViewPresenter.NavigationItem.STATEMENTS);
        }
        this.f84917h0.onHubMenuUpdated(this.f84908Y.isAuthorized());
        this.f84891H.f69322A.setSaveFromParentEnabled(false);
        this.f84891H.f69322A.setAdapter(this.f84916g0);
        this.f84891H.f69322A.setOffscreenPageLimit(5);
        mo86145n7(0);
        mo86159s7(true);
    }

    /* renamed from: C4 */
    private void m103625C4() {
        this.f84891H.f69336q.animate().alpha(1.0f).setDuration(600);
        this.f84891H.f69339t.animate().alpha(Utils.FLOAT_EPSILON).setDuration(700);
        this.f84891H.f69340u.animate().alpha(1.0f).setDuration(600).setStartDelay(200).y((float) this.f84891H.f69336q.getBottom()).setInterpolator(new DecelerateInterpolator()).setListener(new C35196f());
        this.f84891H.f69322A.postDelayed(new C30675l4(this), 900);
    }

    /* access modifiers changed from: private */
    /* renamed from: C5 */
    public /* synthetic */ void m103626C5(ToastNotificationArgumentsWrapper toastNotificationArgumentsWrapper) {
        m103765a7(toastNotificationArgumentsWrapper.getCopiedText());
    }

    /* access modifiers changed from: private */
    /* renamed from: C6 */
    public void m103627C6(MainBottomNavigationViewPresenter.NavigationItem navigationItem) {
        String str;
        switch (C35192b.f84937a[navigationItem.ordinal()]) {
            case 1:
                str = "home";
                break;
            case 2:
                str = "cards";
                break;
            case 3:
                str = "products";
                break;
            case 4:
            case 5:
                str = "payment_transfers";
                break;
            case 6:
                str = "statement";
                break;
            case 7:
                C36546y.m108282F().mo27137H("life_style_offers", "OPEN_LIFESTYLE_OFFERS", "offers", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
                str = "offers";
                break;
            case 8:
                str = "hub";
                break;
            default:
                str = "";
                break;
        }
        C36546y.m108282F().mo27152s("main", str, "select_tab");
    }

    /* renamed from: D4 */
    private void m103630D4(Intent intent) {
        this.f84914e0 = intent.getBooleanExtra("QUICK_LINKS_OPEN_TRANSFERS", false);
        this.f84915f0 = "ge.bog.mobilebank.appshortcuts.PAYMENTS".equals(intent.getAction());
    }

    /* access modifiers changed from: private */
    /* renamed from: D5 */
    public /* synthetic */ void m103631D5(ToastNotificationArgumentsWrapper toastNotificationArgumentsWrapper) {
        m103819k7(toastNotificationArgumentsWrapper.getCopiedText());
    }

    /* renamed from: D6 */
    private void m103632D6() {
        C37224b.m109963b(this.f84926q0.f84959G.mo70970e9(), this, new C30764s2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: D7 */
    public void m103633D7() {
        if (TextUtils.isEmpty(this.f84913d0) || !TextUtils.isEmpty(this.f84893J.getUsername())) {
            m103797g5();
            return;
        }
        m103797g5();
        Intent intent = new Intent(this, PaymentFormActivity.class);
        intent.putExtra("PAYMENT_SERVICE_ID", "bog-comp-mobilepayments");
        intent.putExtra(C32313j0.f79741a, this.f84913d0);
        this.f84913d0 = null;
        startActivity(intent);
    }

    /* renamed from: E4 */
    private C1483c m103636E4(C27634l lVar) {
        if (!lVar.mo67096e()) {
            return null;
        }
        getSupportFragmentManager().mo4367F1("REQUEST_KEY_AMEX_OFFER", this, new C30635i4(this, lVar));
        Long amexOfferPopupCloseDate = this.f84893J.getAmexOfferPopupCloseDate();
        if (amexOfferPopupCloseDate.longValue() != -1) {
            if (TimeUnit.DAYS.convert(System.currentTimeMillis() - amexOfferPopupCloseDate.longValue(), TimeUnit.MILLISECONDS) < 14) {
                return null;
            }
        }
        return C20129c.m66110E1(lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: E5 */
    public /* synthetic */ void m103637E5() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f84891H.f69344y, View.TRANSLATION_Y, new float[]{this.f84930u0, 0.0f}).setDuration(500);
        duration.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f84891H.f69322A, View.TRANSLATION_Y, new float[]{0.0f}).setDuration(600);
        duration2.setInterpolator(new DecelerateInterpolator());
        animatorSet.playTogether(new Animator[]{duration, duration2});
        animatorSet.start();
        animatorSet.addListener(new C35198h());
    }

    /* renamed from: E6 */
    private void m103638E6() {
        C37224b.m109963b(this.f84926q0.f84959G.mo70964S3(), this, new C30763s1(this));
    }

    /* renamed from: E7 */
    private void m103639E7() {
        C19788a G4 = m103648G4();
        if (!G4.isAdded()) {
            G4.mo4576A1(getSupportFragmentManager(), "FRAGMENT_TAG_DARK_MODE");
        }
    }

    /* renamed from: F4 */
    private Long m103642F4() {
        C37228a a;
        C36735g gVar = this.f84906W;
        if (gVar == null || (a = gVar.mo89562a()) == null) {
            return null;
        }
        return Long.valueOf(a.mo90305b());
    }

    /* access modifiers changed from: private */
    /* renamed from: F5 */
    public /* synthetic */ C41238w m103643F5(C19288a aVar) {
        C1483c cVar;
        PopupManager popupManager = this.f84919j0;
        PopupManager.C21539b bVar = PopupManager.C21539b.CLIENT_BIRTHDAY_DIALOG_ID;
        if (aVar.mo47512a()) {
            cVar = m103682M4().mo91629s0(aVar.mo47513b());
        } else {
            cVar = null;
        }
        popupManager.mo53846i(bVar, cVar, true);
        return C41238w.f97225a;
    }

    /* renamed from: F6 */
    private void m103644F6() {
        C37224b.m109963b(this.f84926q0.f84959G.mo70980t9(), this, new C30699n2(this));
    }

    /* renamed from: F7 */
    private void m103645F7() {
        if (!this.f84893J.getDidCloseContactUsHint()) {
            if (this.f84924o0 == null) {
                this.f84924o0 = LayoutInflater.from(this).inflate(C10324m.layout_chat_hint, (ViewGroup) null);
                PopupWindow popupWindow = new PopupWindow(this.f84924o0, -1, -2);
                this.f84925p0 = popupWindow;
                popupWindow.setBackgroundDrawable(new ColorDrawable());
                this.f84925p0.setOutsideTouchable(false);
                this.f84925p0.getContentView().setOnClickListener(new C30701n4(this));
            }
            TextView textView = (TextView) this.f84924o0.findViewById(C10322k.chat_hint_text);
            if (this.f84908Y.getUserInfo().isSolo()) {
                textView.setText(getString(C10328q.chat_hint_connect_to_bog_solo));
            } else {
                textView.setText(getString(C10328q.chat_hint_connect_to_bog_retail));
            }
            this.f84925p0.showAsDropDown(this.f85671t, 0, -((int) getResources().getDimension(C10319h.toolbar_chat_hint_y_offset)), 8388613);
        }
    }

    /* renamed from: G4 */
    private C19788a m103648G4() {
        Fragment k0 = getSupportFragmentManager().mo4418k0("FRAGMENT_TAG_DARK_MODE");
        if (k0 instanceof C19788a) {
            return (C19788a) k0;
        }
        return C38125h.m112239d(this).mo91649a();
    }

    /* access modifiers changed from: private */
    /* renamed from: G5 */
    public /* synthetic */ void m103649G5() {
        m103682M4().mo91637w0(C24849e.CLIENT_LIMIT, this);
    }

    /* renamed from: G6 */
    private void m103650G6() {
        C37224b.m109963b(this.f84926q0.f84959G.mo70979sa(), this, new C30750r1(this));
    }

    /* renamed from: H4 */
    private C1483c m103653H4(Long l) {
        C38174g G1 = C38174g.m112338G1(getString(C10328q.registration_digital_card_title), getString(C10328q.registration_digital_card_text), C32343x.m95420V("text.do.digital.card.popup.button", getString(C10328q.digital_card_popup_button), new Object[0]), C10320i.ic_onboarding_digital_card);
        G1.mo91715I1(new C30621h4(this, l));
        return G1;
    }

    /* access modifiers changed from: private */
    /* renamed from: H5 */
    public /* synthetic */ void m103654H5() {
        this.f84926q0.f84958F.mo70947Rq();
    }

    /* renamed from: H6 */
    private void m103655H6() {
        C37224b.m109963b(this.f84926q0.f84959G.mo70961Do(), this, new C30841y1(this));
    }

    /* renamed from: H7 */
    private void m103656H7() {
        this.f84926q0.mo86181Ex();
    }

    /* renamed from: I4 */
    private Long m103659I4(C27637o oVar) {
        for (List it : oVar.mo67167a().values()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C27635m mVar = (C27635m) it2.next();
                    if (mVar.mo67111K().mo63390c()) {
                        return Long.valueOf(mVar.mo67126j());
                    }
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: I5 */
    public /* synthetic */ C41238w m103660I5(Boolean bool) {
        C13310d dVar;
        PopupManager popupManager = this.f84919j0;
        PopupManager.C21539b bVar = PopupManager.C21539b.CALCULATE_LIMITS;
        if (bool.booleanValue()) {
            dVar = C35367c.m105016c(new C30606g3(this), new C30620h3(this));
        } else {
            dVar = null;
        }
        popupManager.mo53846i(bVar, dVar, false);
        return C41238w.f97225a;
    }

    /* renamed from: I6 */
    private void m103661I6() {
        this.f84926q0.f84959G.mo70977ql().mo4819k(this, new C30647j2(this));
    }

    /* renamed from: I7 */
    private void m103662I7() {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_ICON_TWO_BUTTON);
        dVar.mo35646Z1(getString(C10328q.start));
        dVar.mo35642U1(getString(C10328q.later));
        dVar.mo35648c2(C27950a.m86284a("rbc.kyc.survery.popup.title"));
        dVar.mo35639Q1(C27950a.m86284a("rbc.kyc.survery.popup.description"));
        dVar.mo35641T1(new C30842y2(dVar));
        dVar.mo35645Y1(new C30855z2(this, dVar));
        dVar.mo35637O1(Integer.valueOf(C10320i.kyc_pop_up));
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: J4 */
    private ModalDialog m103665J4() {
        return new ModalDialog.C13300a().mo35624f(C32343x.m95388F("text.popup.title.gamification", new Object[0])).mo35623e(C32343x.m95388F("text.popup.description.gamification", new Object[0])).mo35620b(C32300e0.m95169g(C10320i.img_gamification_modal)).mo35622d(C32343x.m95388F("text.popup.button.gamification", new Object[0]), new C30648j3(this)).mo35621c(new C30661k3(this)).mo35619a();
    }

    /* access modifiers changed from: private */
    /* renamed from: J5 */
    public /* synthetic */ C41238w m103666J5(List list) {
        C1483c cVar;
        if (list.isEmpty()) {
            cVar = null;
        } else {
            cVar = C38125h.m112237b(this).mo91648c(list);
        }
        this.f84919j0.mo53846i(PopupManager.C21539b.CLIENT_GIFT_CARDS, cVar, false);
        return C41238w.f97225a;
    }

    /* renamed from: J6 */
    private void m103667J6() {
        m103713R6();
        m103719S6();
        m103638E6();
        m103707Q6();
        m103701P6();
        m103678L6();
        m103632D6();
        m103644F6();
        m103655H6();
        m103753Y6();
        m103661I6();
        m103736V6();
        m103747X6();
        m103650G6();
        m103742W6();
        m103684M6();
    }

    /* renamed from: K4 */
    private String m103670K4(String str) {
        String format = new SimpleDateFormat("dd.MM.yyyy|HH").format(new Date(System.currentTimeMillis()));
        return str + "," + format;
    }

    /* access modifiers changed from: private */
    /* renamed from: K5 */
    public /* synthetic */ C41238w m103671K5(String str, List list) {
        Intent intent = new Intent();
        intent.putExtra("type", str);
        intent.putExtra("parameters", C42035e.m122121c(list));
        PushNotificationHandlerActivity.m72287O5(this, intent);
        return null;
    }

    /* renamed from: K6 */
    private void m103672K6() {
        mo86438k1(this.f84896M.mo47641a().mo95027o0(C40992a.m118827a()).mo94981F0(new C30815w1(this)));
    }

    /* renamed from: K7 */
    private void m103673K7(Long l) {
        C29932d.m90810s2(l.longValue(), false).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: L4 */
    private C13310d m103676L4() {
        String valueOf = String.valueOf(m103642F4());
        Long juniorPopUpCloseDate = this.f84893J.getJuniorPopUpCloseDate(valueOf);
        if (juniorPopUpCloseDate.longValue() != -1) {
            if (TimeUnit.DAYS.convert(System.currentTimeMillis() - juniorPopUpCloseDate.longValue(), TimeUnit.MILLISECONDS) < 14) {
                return null;
            }
        }
        C13310d dVar = new C13310d();
        dVar.mo35637O1(Integer.valueOf(C10320i.f28700v7));
        dVar.mo35648c2(C27950a.m86284a("text.junior.popup.title"));
        dVar.mo35639Q1(C27950a.m86284a(C32312j.f79733c));
        dVar.mo35647a2(C13310d.C13312b.TITLE_ICON_TWO_BUTTON);
        dVar.mo35646Z1(C27950a.m86284a(C32312j.f79735e));
        dVar.mo35642U1(C27950a.m86284a(C32312j.f79734d));
        dVar.mo35645Y1(new C30564d3(this, dVar, valueOf));
        dVar.mo35641T1(new C30578e3(this, valueOf, dVar));
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: L5 */
    public /* synthetic */ C41238w m103677L5(String str) {
        this.f84926q0.f84958F.mo70948pu(str);
        return null;
    }

    /* renamed from: L6 */
    private void m103678L6() {
        C37224b.m109963b(this.f84926q0.f84959G.mo70978rr(), this, new C30633i2(this));
    }

    /* renamed from: L7 */
    private void m103679L7() {
        if (this.f84908Y.isAuthorized()) {
            m103685M7();
        }
        m103781d5();
    }

    /* access modifiers changed from: private */
    /* renamed from: M4 */
    public C38122f m103682M4() {
        return C38125h.m112238c(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: M5 */
    public /* synthetic */ C41238w m103683M5(C41224m mVar) {
        C25052b bVar;
        if (((Boolean) mVar.mo95678e()).booleanValue()) {
            bVar = m103682M4().mo91591a0((C24776a) mVar.mo95680f(), new C30522a3(this), new C30536b3(this));
        } else {
            bVar = null;
        }
        this.f84919j0.mo53846i(PopupManager.C21539b.COMMON_POPUP, bVar, false);
        return C41238w.f97225a;
    }

    /* renamed from: M6 */
    private void m103684M6() {
        C37224b.m109963b(this.f84926q0.f84959G.mo70972er(), this, new C30686m2(this));
    }

    /* renamed from: M7 */
    private void m103685M7() {
        m103790e8(C10322k.notification_menu_item, true);
    }

    /* renamed from: N4 */
    private TrustDeviceParams m103688N4(String str, String str2, String str3) {
        return new TrustDeviceParams((String) null, BankApi.IDENTITY_TRUST_DEVICE, str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: N5 */
    public /* synthetic */ C41238w m103689N5(GooglePayState googlePayState) {
        C20334c B;
        if ((googlePayState == GooglePayState.ACTIVE || googlePayState == GooglePayState.WALLET_NEEDS_CREATION) && (B = this.f84916g0.m103926F()) != null) {
            B.mo48815G1();
        }
        return C41238w.f97225a;
    }

    /* renamed from: N6 */
    private void m103690N6() {
        this.f84926q0.f84959G.mo70981xi().mo4819k(this, new C30634i3(this));
    }

    /* renamed from: O4 */
    private C1483c m103693O4() {
        if (this.f84908Y.canJoinToPlusProgram()) {
            String d = this.f84908Y.getLoginInfo().mo90307d();
            if (!this.f84893J.wasPlusActivationDialogShown(d)) {
                return C38223z.m112426C1(d);
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: O5 */
    public /* synthetic */ void m103694O5(Integer num) {
        mo86146o7(num.intValue(), true);
    }

    /* renamed from: O6 */
    private void m103695O6() {
        this.f84926q0.f84959G.mo70962Dt().mo4819k(this, new C30592f3(this));
    }

    /* renamed from: O7 */
    private void m103696O7(String str, HashMap hashMap, String str2) {
        m103888z4();
        C41185v.m119403r2(str, hashMap).mo4576A1(getSupportFragmentManager(), str2);
    }

    /* renamed from: P4 */
    private C13310d m103699P4() {
        String str;
        if (this.f84908Y.getUserInfo().getClientPlusLabelChange() == null) {
            return null;
        }
        C13310d dVar = new C13310d();
        dVar.mo4586v1(false);
        dVar.mo35647a2(C13310d.C13312b.TITLE_ICON_TWO_BUTTON);
        ClientPlusLabelChange clientPlusLabelChange = this.f84908Y.getUserInfo().getClientPlusLabelChange();
        dVar.mo35648c2(C27950a.m86284a("plus.status.popup.title") + " " + clientPlusLabelChange.getLabelTypeNewDesc());
        if (this.f84893J.getLanguage() == C37353c.KA) {
            str = this.f84908Y.getUserInfo().getVocativeNames().f81383ge;
        } else {
            str = this.f84908Y.getUserInfo().getVocativeNames().f81382en;
        }
        String str2 = "";
        if (clientPlusLabelChange.getDictionaryValue() != null) {
            String replace = clientPlusLabelChange.getDictionaryValue().replace("{clientName}", str);
            if (clientPlusLabelChange.getLabelTypeNewDesc() != null) {
                str2 = clientPlusLabelChange.getLabelTypeNewDesc();
            }
            str2 = replace.replace("{clientStatus}", str2);
        }
        dVar.mo35639Q1(str2);
        dVar.mo35642U1(C27950a.m86284a("plus.status.popup.button.close"));
        dVar.mo35641T1(new C30752r3(this, dVar));
        dVar.mo35646Z1(C27950a.m86284a("plus.status.popup.button.details"));
        dVar.mo35645Y1(new C30765s3(this, dVar));
        String statusProgress = clientPlusLabelChange.getStatusProgress();
        if (statusProgress == null || StatusDialogType.Companion.getByShortName(statusProgress) != StatusDialogType.NEW_CLIENT) {
            StatusDialogIcon byLabelType = StatusDialogIcon.Companion.getByLabelType(clientPlusLabelChange.getLabelTypeNew());
            if (byLabelType == null) {
                return dVar;
            }
            dVar.mo35637O1(Integer.valueOf(byLabelType.getIconRes()));
            return dVar;
        }
        dVar.mo35637O1(Integer.valueOf(C10320i.statuses_dialog_all));
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: P5 */
    public /* synthetic */ void m103700P5(C41238w wVar) {
        this.f84917h0.selectItem(MainBottomNavigationViewPresenter.NavigationItem.PRODUCTS);
        this.f84926q0.mo86195yx();
    }

    /* renamed from: P6 */
    private void m103701P6() {
        C37224b.m109963b(this.f84926q0.f84959G.mo70975jm(), this, new C30790u2(this));
    }

    /* renamed from: P7 */
    private void m103702P7() {
        m103708Q7();
        m103775c5();
    }

    /* renamed from: Q4 */
    private C1483c m103705Q4(String str, boolean z) {
        Long referralsPopupCloseDate = this.f84893J.getReferralsPopupCloseDate();
        if (referralsPopupCloseDate.longValue() != -1) {
            if (TimeUnit.DAYS.convert(System.currentTimeMillis() - referralsPopupCloseDate.longValue(), TimeUnit.MILLISECONDS) < 14) {
                return null;
            }
        }
        C20557a b = this.f84910a0.mo48775b(str);
        if (b == null || b.mo49084a() == null || !b.mo49084a().booleanValue() || !this.f84908Y.getUserInfo().isRBClient() || this.f84893J.getReferralsPopupShowCount() > 3) {
            return null;
        }
        getSupportFragmentManager().mo4367F1("REQUEST_KEY_REFERRALS_POPUP", this, new C30817w3(this, str));
        this.f84893J.increaseReferralsPopupShowCount();
        return C27942j.m86260F1(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q5 */
    public /* synthetic */ C41238w m103706Q5(ExpiringCardPopUpData expiringCardPopUpData) {
        C1483c cVar;
        PopupManager popupManager = this.f84919j0;
        PopupManager.C21539b bVar = PopupManager.C21539b.EXPIRING_CARD_POPUP;
        if (expiringCardPopUpData.mo52885e()) {
            cVar = m103682M4().mo91585X0(expiringCardPopUpData);
        } else {
            cVar = null;
        }
        popupManager.mo53846i(bVar, cVar, false);
        return C41238w.f97225a;
    }

    /* renamed from: Q6 */
    private void m103707Q6() {
        C37224b.m109963b(this.f84926q0.f84959G.mo70960Bp(), this, new C30789u1(this));
    }

    /* renamed from: Q7 */
    private void m103708Q7() {
        m103790e8(C10322k.search_menu_item, true);
    }

    /* renamed from: R4 */
    private C1483c m103711R4() {
        if (this.f84893J.isLocationPermissionTimeout()) {
            return new C32330r0((Activity) this).mo72832k(new C30551c4(this));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: R5 */
    public /* synthetic */ C41238w m103712R5(Boolean bool) {
        ModalDialog modalDialog;
        if (bool.booleanValue()) {
            modalDialog = m103665J4();
        } else {
            modalDialog = null;
        }
        this.f84919j0.mo53846i(PopupManager.C21539b.GAMIFICATION_POPUP, modalDialog, false);
        return C41238w.f97225a;
    }

    /* renamed from: R6 */
    private void m103713R6() {
        this.f84926q0.f84959G.getHasKycLiveData().mo4819k(this, new C30803v2(this));
    }

    /* renamed from: R7 */
    private void m103714R7() {
        boolean z;
        C20557a b = this.f84910a0.mo48775b("EASY_LOGIN_OFFER_PERIOD");
        if (b == null || b.mo49086c() == null || b.mo49086c().doubleValue() * 24.0d * 60.0d * 60.0d * 100.0d > ((double) (Calendar.getInstance().getTimeInMillis() - this.f84893J.getEasyLoginOfferDate()))) {
            z = false;
        } else {
            z = true;
        }
        C9860d o = C10146d0.C10148b.m37116o(z);
        if (o != null) {
            this.f84893J.saveEasyLoginOfferDate(Calendar.getInstance().getTimeInMillis());
        }
        this.f84919j0.mo53846i(PopupManager.C21539b.TRUSTED_DEVICE_DIALOG_ID, o, true);
    }

    /* renamed from: S4 */
    private C1483c m103717S4() {
        if (!this.f84893J.isNotificationPermissionTimeout() || Build.VERSION.SDK_INT < 33) {
            return null;
        }
        return new C32330r0((Activity) this).mo72833l(new C30804v3(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: S5 */
    public /* synthetic */ void m103718S5(C37223a aVar) {
        C25210c cVar = (C25210c) aVar.mo90296a();
        if (cVar != null && cVar.mo63722c() != C25211d.NONE && cVar.mo63723d() != null) {
            C38125h.m112236a(this).mo91644a(this, cVar);
        }
    }

    /* renamed from: S6 */
    private void m103719S6() {
        C37224b.m109963b(this.f84926q0.f84959G.mo70968ck(), this, new C30737q1(this));
    }

    /* renamed from: S7 */
    private void m103720S7(Intent intent) {
        String stringExtra;
        if (intent != null && (stringExtra = intent.getStringExtra("ACCOUNT_DEACTIVATION_SUCCESS_TEXT")) != null) {
            C12910e.m48793k(this, stringExtra, C12902d.C12905b.C12908c.f38105a);
            m103799g7();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T5 */
    public /* synthetic */ void m103723T5(C25212e eVar) {
        this.f84927r0 = eVar.mo63731b();
        MainBottomNavigationViewPresenter mainBottomNavigationViewPresenter = this.f84917h0;
        if (mainBottomNavigationViewPresenter != null) {
            mainBottomNavigationViewPresenter.setHubGamificationEnabled(eVar.mo63730a());
        }
        invalidateOptionsMenu();
    }

    /* renamed from: T6 */
    private void m103724T6() {
        mo86438k1(this.f84902S.mo89567a().mo94990M(new C30698n1()).mo95027o0(C40992a.m118827a()).mo94981F0(new C30711o1(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: T7 */
    public void m103725T7() {
        if (C32335t0.m95361f() == 0) {
            m103613A4();
        } else if (C32335t0.m95361f() == 2) {
            m103625C4();
        } else {
            m103619B4();
        }
    }

    /* renamed from: U4 */
    private C1483c m103728U4() {
        SmsToPushStateEvent smsToPushStateEvent;
        if (!this.f84908Y.isAuthorized() || (smsToPushStateEvent = this.f84935z0) == null) {
            return null;
        }
        C19513j jVar = smsToPushStateEvent.smsToPushState;
        String b = jVar.mo47752b();
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35648c2(getString(C10328q.sms_to_push_popup_title));
        dVar.mo35639Q1(C27950a.m86284a(b));
        dVar.mo4586v1(true);
        dVar.mo35642U1(getString(C10328q.sms_to_push_popup_no));
        dVar.mo35641T1(new C30714o4(this, dVar, b));
        dVar.mo35646Z1(getString(C10328q.sms_to_push_popup_yes));
        dVar.mo35641T1(new C30672l1(this, jVar, dVar, b));
        this.f84935z0 = null;
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: U5 */
    public /* synthetic */ C41238w m103729U5(Boolean bool) {
        C1483c cVar;
        if (bool.booleanValue()) {
            cVar = m103682M4().mo91604g();
        } else {
            cVar = null;
        }
        this.f84919j0.mo53846i(PopupManager.C21539b.GOOGLE_PAY_ID, cVar, false);
        return C41238w.f97225a;
    }

    /* renamed from: U6 */
    private void m103730U6() {
        mo86438k1(this.f84898O.mo64055b().mo95027o0(C40992a.m118827a()).mo94983G0(new C30565d4(this), new C30579e4(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: U7 */
    public void m103731U7() {
        this.f84930u0 = this.f84891H.f69344y.getY();
        this.f84891H.f69344y.setY((float) C32355x0.m95519j(this));
        this.f84891H.f69322A.setY((float) C32355x0.m95519j(this));
        m103622B7();
        this.f84891H.f69341v.animate().alpha(Utils.FLOAT_EPSILON).withEndAction(new C30726p3(this));
        this.f84891H.f69326g.animate().setDuration(400).alpha(Utils.FLOAT_EPSILON).withEndAction(new C30739q3(this));
    }

    /* renamed from: V4 */
    private C41185v m103734V4() {
        return C20288a.m66330e(getSupportFragmentManager(), C35201k.SMS_TO_PUSH.name());
    }

    /* access modifiers changed from: private */
    /* renamed from: V5 */
    public /* synthetic */ C41238w m103735V5(List list) {
        C13310d L4 = m103676L4();
        if (list.size() <= 0 || L4 == null) {
            this.f84919j0.mo53846i(PopupManager.C21539b.JUNIOR_DIALOG_ID, (C1483c) null, true);
        } else {
            this.f84892I = (JuniorRequestDataUiModel) list.get(0);
            this.f84919j0.mo53846i(PopupManager.C21539b.JUNIOR_DIALOG_ID, L4, true);
        }
        return C41238w.f97225a;
    }

    /* renamed from: V6 */
    private void m103736V6() {
        this.f84926q0.f84959G.mo70963Kq().mo4819k(this, new C30725p2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: V7 */
    public void m103737V7() {
        if (!mo86449z2()) {
            return;
        }
        if (this.f84908Y.isAuthorized()) {
            mo86428V1(getIntent(), !m103802h5(), true);
        } else if (!m103802h5()) {
            C32303f.m95188H(this);
        } else {
            mo86428V1(getIntent(), true ^ m103802h5(), false);
        }
    }

    /* renamed from: W4 */
    private C18394d m103740W4(ToastNotificationArgumentsWrapper toastNotificationArgumentsWrapper) {
        if (toastNotificationArgumentsWrapper == null || toastNotificationArgumentsWrapper.getArguments() == null || toastNotificationArgumentsWrapper.getCopiedText() == null) {
            return null;
        }
        C18394d a = C18394d.f51852A.mo46199a(toastNotificationArgumentsWrapper.getArguments());
        a.mo46194I1(new C30816w2(this, toastNotificationArgumentsWrapper));
        a.mo46196K1(new C30829x2(this, toastNotificationArgumentsWrapper));
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: W5 */
    public /* synthetic */ void m103741W5(Boolean bool) {
        if (bool.booleanValue()) {
            m103662I7();
        }
    }

    /* renamed from: W6 */
    private void m103742W6() {
        this.f84926q0.f84959G.mo70966Wr().mo4819k(this, new C30712o2(this));
        m103695O6();
        m103690N6();
    }

    /* access modifiers changed from: private */
    /* renamed from: X4 */
    public C41185v m103745X4() {
        return C20288a.m66330e(getSupportFragmentManager(), C35201k.SAVE_TRUSTED.name());
    }

    /* access modifiers changed from: private */
    /* renamed from: X5 */
    public /* synthetic */ C41238w m103746X5(C25800a aVar) {
        C1483c cVar;
        PopupManager popupManager = this.f84919j0;
        PopupManager.C21539b bVar = PopupManager.C21539b.LIABILITY_OVERDUE_DIALOG;
        if (aVar.mo64430a() != null) {
            cVar = m103682M4().mo91623p0(aVar.mo64430a());
        } else {
            cVar = null;
        }
        popupManager.mo53846i(bVar, cVar, false);
        return C41238w.f97225a;
    }

    /* renamed from: X6 */
    private void m103747X6() {
        this.f84926q0.f84959G.mo70973fs().mo4819k(this, new C30724p1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: X7 */
    public void m103748X7(boolean z) {
        int i;
        int g = C32355x0.m95516g(C10319h.login_tab_height);
        this.f84891H.f69344y.getLayoutTransition().enableTransitionType(4);
        this.f84891H.f69322A.getLayoutTransition().enableTransitionType(4);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f84891H.f69344y.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f84891H.f69322A.getLayoutParams();
        if (z) {
            i = 0;
        } else {
            i = g;
        }
        marginLayoutParams.height = i;
        if (z) {
            g = 0;
        }
        marginLayoutParams2.bottomMargin = g;
        this.f84891H.f69344y.setLayoutParams(marginLayoutParams);
        this.f84891H.f69322A.setLayoutParams(marginLayoutParams2);
    }

    /* renamed from: Y4 */
    private void m103751Y4() {
        C36546y.m108282F().mo27137H("Conversion_Google_Pay", C10457a.f29785f, (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }

    /* renamed from: Y6 */
    private void m103753Y6() {
        C37224b.m109963b(this.f84926q0.f84959G.mo70969cl(), this, new C30563d2(this));
        C37224b.m109963b(this.f84926q0.f84959G.mo70976pk(), this, new C30577e2(this));
        C37224b.m109963b(this.f84926q0.f84959G.mo70971el(), this, new C30591f2(this));
        C37224b.m109963b(this.f84926q0.f84959G.mo70965U3(), this, new C30619h2(this));
    }

    /* renamed from: Y7 */
    private void m103754Y7() {
        Boolean bool = this.f84908Y.getUserInfo().clientMustSeeDOConditions;
        if (bool == null || !bool.booleanValue()) {
            this.f84919j0.mo53846i(PopupManager.C21539b.DIGITAL_CARD_ON_BOARDING_DIALOG_ID, (C1483c) null, true);
        } else {
            mo86438k1(this.f84901R.mo65885b().mo95027o0(C40992a.m118827a()).mo94983G0(new C30830x3(this), new C30856z3(this)));
        }
    }

    /* renamed from: Z4 */
    private void m103757Z4(BadgeRelativeLayout badgeRelativeLayout, int i) {
        badgeRelativeLayout.setBadgeVisible(i > 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z5 */
    public /* synthetic */ void m103758Z5(Boolean bool) {
        if (!isFinishing() && !isDestroyed()) {
            m103886y7();
            C27371n0 n0Var = this.f84891H;
            if (n0Var != null) {
                n0Var.mo3946b().getViewTreeObserver().removeOnGlobalLayoutListener(this.f84928s0);
            }
            if (((ViewGroup.MarginLayoutParams) this.f84891H.f69344y.getLayoutParams()).height == 0) {
                m103748X7(false);
            }
            this.f84916g0.mo86177J();
            m103730U6();
            m103809i7();
            m103814j7();
            m103760Z7();
            this.f84891H.f69322A.post(new C30674l3(this));
            this.f84908Y.requestTemplatesWithConfig(false);
            m103804h7();
            this.f84917h0.onHubMenuUpdated(bool.booleanValue());
            this.f84926q0.f84958F.mo70953um();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z6 */
    public void m103759Z6(String str, Bundle bundle) {
        if (bundle.getBoolean("RESULT_KEY_MCC_UPDATED", false)) {
            C12910e.m48793k(this, C32343x.m95420V("card.mcc.opearation.completed.successfully", getString(C10328q.f28939S8), new Object[0]), C12902d.C12905b.C12908c.f38105a);
        }
    }

    /* renamed from: Z7 */
    private void m103760Z7() {
        this.f84926q0.f84958F.mo70951tf();
        this.f84919j0.mo53846i(PopupManager.C21539b.POST_NOTIFICATION_PERMISSION, m103717S4(), true);
        this.f84919j0.mo53846i(PopupManager.C21539b.LOCATION_PERMISSION_DIALOG_ID, m103711R4(), true);
        this.f84919j0.mo53846i(PopupManager.C21539b.REFERRALS_POPUP_DIALOG_ID, m103705Q4("MBANK_REFERRAL_POPUP", false), false);
        this.f84919j0.mo53846i(PopupManager.C21539b.REFERRALS_PASSIVE_POPUP_DIALOG_ID, m103705Q4("MBANK_REFERRAL_PASSIVE_POPUP", true), false);
        this.f84919j0.mo53846i(PopupManager.C21539b.LOYALTY_PROGRESS_STATUS_CHANGE, m103699P4(), false);
        m103714R7();
        m103754Y7();
        m103656H7();
    }

    /* access modifiers changed from: private */
    /* renamed from: a5 */
    public void m103763a5(int i) {
        if (i == 4) {
            m103679L7();
        } else {
            m103702P7();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a6 */
    public /* synthetic */ void m103764a6(Integer num) {
        this.f84921l0 = num.intValue();
        m103778c8();
    }

    /* renamed from: a7 */
    private void m103765a7(String str) {
        TransferForm.startWith((Activity) this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_OTHER).setDestinationAcctNo(str).setWithinBank(true).setTransfertype(TransferForm.TRANSFERTYPE.ACCOUNT).start();
    }

    /* renamed from: a8 */
    private void m103766a8(int i, int i2) {
        if (i2 != 20 || i <= 0) {
            this.f84917h0.removeBadge(MainBottomNavigationViewPresenter.NavigationItem.HUB);
        } else {
            this.f84917h0.setBadgeCount(MainBottomNavigationViewPresenter.NavigationItem.HUB, Integer.valueOf(i));
        }
    }

    /* renamed from: b5 */
    private void m103769b5(int i) {
        C34709c cVar;
        if (m103802h5() && i == 0 && (cVar = (C34709c) this.f84916g0.mo70156z(this.f84891H.f69322A.getCurrentItem())) != null) {
            cVar.mo84785i1(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b6 */
    public /* synthetic */ void m103770b6(Throwable th) {
        this.f84921l0 = 0;
        m103778c8();
    }

    /* renamed from: b7 */
    private void m103771b7() {
        this.f84891H.f69322A.post(new C30550c3(this));
        C36546y.m108282F().mo27152s("quick_actions_menu", "payments", "force_touch");
    }

    /* renamed from: b8 */
    private void m103772b8(int i) {
        BadgeRelativeLayout b;
        MenuItem findItem = this.f85671t.getMenu().findItem(C10322k.notification_menu_item);
        if (findItem != null && (b = C18601e.m63154b(findItem)) != null) {
            m103757Z4(b, i);
        }
    }

    /* renamed from: c5 */
    private void m103775c5() {
        m103790e8(C10322k.notification_menu_item, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: c6 */
    public /* synthetic */ C41238w m103776c6(ToastNotificationArgumentsWrapper toastNotificationArgumentsWrapper) {
        this.f84919j0.mo53846i(PopupManager.C21539b.IBAN_NOTIFICATION_DIALOG, m103740W4(toastNotificationArgumentsWrapper), false);
        return C41238w.f97225a;
    }

    /* renamed from: c7 */
    private void m103777c7() {
        C36546y.m108282F().mo27152s("quick_links_widget", "transfer", "open_page");
        this.f84891H.f69322A.post(new C30685m1(this));
    }

    /* renamed from: c8 */
    private void m103778c8() {
        if (this.f84908Y.isAuthorized()) {
            int i = this.f84921l0 + this.f84922m0;
            if (i > 0) {
                this.f84917h0.setBadgeCount(MainBottomNavigationViewPresenter.NavigationItem.TRANSFERS, Integer.valueOf(i));
            } else {
                this.f84917h0.removeBadge(MainBottomNavigationViewPresenter.NavigationItem.TRANSFERS);
            }
        } else {
            int i2 = this.f84922m0;
            if (i2 > 0) {
                this.f84917h0.setBadgeCount(MainBottomNavigationViewPresenter.NavigationItem.PAYMENTS, Integer.valueOf(i2));
            } else {
                this.f84917h0.removeBadge(MainBottomNavigationViewPresenter.NavigationItem.PAYMENTS);
            }
        }
    }

    /* renamed from: d5 */
    private void m103781d5() {
        m103790e8(C10322k.search_menu_item, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: d6 */
    public /* synthetic */ C41238w m103782d6(C41238w wVar) {
        this.f84894K.mo53861c(PopupManager.C21539b.IBAN_NOTIFICATION_DIALOG);
        return C41238w.f97225a;
    }

    /* renamed from: d7 */
    private void m103783d7() {
        if (this.f84911b0.getType() != EnvironmentType.PRODUCTION) {
            ImageView imageView = this.f84891H.f69329j;
            int i = C10320i.icons_24_general_setting;
            imageView.setImageResource(i);
            this.f84891H.f69326g.setImageResource(i);
            this.f84891H.f69333n.setImageResource(i);
            this.f84891H.f69330k.setImageResource(i);
            this.f84891H.f69339t.setImageResource(i);
            this.f84891H.f69336q.setImageResource(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d8 */
    public void m103784d8(boolean z) {
        if (z) {
            this.f84917h0.setBadgeCount(MainBottomNavigationViewPresenter.NavigationItem.PRODUCTS, 1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e5 */
    public void m103787e5() {
        m103793f5((C19289b) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e6 */
    public /* synthetic */ C41238w m103788e6(C41238w wVar) {
        this.f84894K.mo53862d(true);
        return C41238w.f97225a;
    }

    /* renamed from: e7 */
    private void m103789e7(String str, String str2, String str3, String str4) {
        if (str4.equals(C35201k.SAVE_TRUSTED.name())) {
            m103852r7(str, str2, str3);
        } else if (this.f84889A0 != null) {
            try {
                this.f84889A0.accept(new C41232r(str, str2, str3));
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f84889A0 = null;
                throw th;
            }
            this.f84889A0 = null;
        }
    }

    /* renamed from: e8 */
    private void m103790e8(int i, boolean z) {
        MenuItem findItem = this.f85671t.getMenu().findItem(i);
        if (findItem != null) {
            findItem.setVisible(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f5 */
    public void m103793f5(C19289b bVar) {
        if (bVar != null && bVar.mo47519c()) {
            this.f84891H.mo3946b().setBackgroundColor(C18368l.m62755d(this, C10316e.f28607j));
            C32343x.m95444e1(this, C32343x.m95476p0(this));
            this.f84926q0.mo86182Gy(C19290c.FILLED);
        } else if (bVar == null || bVar.mo47517a() == null) {
            m103866u7();
        } else {
            m103842p7(bVar);
        }
        if (C32319m.m95287G()) {
            this.f84891H.f69325f.setVisibility(0);
        }
        m103783d7();
    }

    /* access modifiers changed from: private */
    /* renamed from: f6 */
    public /* synthetic */ C41238w m103794f6(C41238w wVar) {
        this.f84894K.mo53862d(false);
        return C41238w.f97225a;
    }

    /* renamed from: g5 */
    private void m103797g5() {
        this.f84891H.f69322A.post(new C30688m4(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g6 */
    public /* synthetic */ void m103798g6(NotificationCountEvent notificationCountEvent) {
        m103772b8(this.f84890G.get());
        m103766a8(this.f84890G.get(), notificationCountEvent.getState());
    }

    /* renamed from: g7 */
    private void m103799g7() {
        C20334c B = this.f84916g0.m103926F();
        if (B != null) {
            B.mo48817f2();
        }
    }

    /* renamed from: h5 */
    private boolean m103802h5() {
        C27371n0 n0Var;
        C35202l lVar = this.f84916g0;
        if (lVar == null || (n0Var = this.f84891H) == null || lVar.mo70156z(n0Var.f69322A.getCurrentItem()) == null) {
            return false;
        }
        return this.f84916g0.mo70156z(this.f84891H.f69322A.getCurrentItem()) instanceof C34709c;
    }

    /* renamed from: h7 */
    private void m103804h7() {
        Boolean bool = this.f84908Y.getUserInfo().clientMustSeeDOConditions;
        if (bool != null && bool.booleanValue()) {
            mo86438k1(this.f84904U.mo70088a(C36546y.m108285N().mo89315M(), "DO_RESTRICTIONS_NOTIFICATION_ID").mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a()).mo94888G(new C30523a4(this), new C30537b4()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i5 */
    public /* synthetic */ void m103807i5(String str, Bundle bundle) {
        C20334c B;
        if (bundle.getBoolean("RESULT_KEY_ADD_TO_GOOGLE_PAY_REQUESTED", false) && (B = this.f84916g0.m103926F()) != null) {
            B.mo48819l2();
        }
    }

    /* renamed from: i7 */
    private void m103809i7() {
        mo86438k1(this.f84899P.mo48087c().mo95027o0(C40992a.m118827a()).mo94983G0(new C30593f4(this), new C30607g4(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: j5 */
    public /* synthetic */ void m103812j5(String str, Bundle bundle) {
        if (bundle.getBoolean("RESULT_KEY_BIRTHDAY_DIALOG_DISMISSED", false)) {
            this.f84926q0.f84958F.mo70946Qd();
        }
    }

    /* renamed from: j7 */
    private void m103814j7() {
        mo86438k1(this.f84900Q.mo65884a().mo95063B(C40992a.m118827a()).mo95070I(new C30778t3(this), new C30791u3(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: k5 */
    public /* synthetic */ void m103817k5(String str, Bundle bundle) {
        if (bundle.getBoolean("RESULT_KEY_GIFT_CARD_TAB_OPENED", false)) {
            this.f84917h0.selectItem(MainBottomNavigationViewPresenter.NavigationItem.DISCOVER);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("RESULT_KEY_ON_GIFT_CARD_TAB_SWITCHED", true);
            getSupportFragmentManager().mo4364E1("REQUEST_KEY_SWITCH_ON_GIFT_CARD_TAB", bundle2);
        }
    }

    /* renamed from: k7 */
    private void m103819k7(String str) {
        this.f84893J.setLastShownIbanInfo(m103670K4(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: l5 */
    public static /* synthetic */ void m103822l5() {
    }

    /* access modifiers changed from: private */
    /* renamed from: l6 */
    public /* synthetic */ void m103823l6(List list, C41232r rVar) {
        this.f84908Y.convertSmsToPush(list, (String) rVar.mo95688a(), (String) rVar.mo95689b(), (String) rVar.mo95690c());
    }

    /* renamed from: l7 */
    private Drawable m103824l7(int i) {
        Drawable drawable;
        try {
            drawable = C5769a.m23210b(this, i);
        } catch (Exception unused) {
            drawable = null;
        }
        if (drawable == null) {
            return null;
        }
        return m103829m7(drawable);
    }

    /* access modifiers changed from: private */
    /* renamed from: m5 */
    public /* synthetic */ void m103827m5(long j) {
        mo86139N7();
        C27185o D = this.f84916g0.m103928H();
        if (D != null) {
            D.mo66477X1(j, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m6 */
    public /* synthetic */ void m103828m6() {
        mo86139N7();
        if (!this.f84908Y.isAuthorized()) {
            C32303f.m95188H(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m7 */
    public Drawable m103829m7(Drawable drawable) {
        Bitmap a = C0840b.m3173a(drawable, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), (Bitmap.Config) null);
        Point k = C32355x0.m95520k(C32355x0.m95518i(this));
        return new BitmapDrawable(getResources(), ThumbnailUtils.extractThumbnail(a, k.x, k.y));
    }

    /* access modifiers changed from: private */
    /* renamed from: n5 */
    public /* synthetic */ void m103832n5() {
        mo86139N7();
        m103682M4().mo91632u(this, new OtherTransferTypeState(-1, false, true));
    }

    /* access modifiers changed from: private */
    /* renamed from: n6 */
    public /* synthetic */ void m103833n6() {
        this.f84907X.setCustomerFlag("Y", "CLIENT_HAS_SEEN_DO_CONDITIONS", new C35199i());
    }

    /* access modifiers changed from: private */
    /* renamed from: o5 */
    public /* synthetic */ void m103836o5() {
        this.f84891H.f69328i.animate().alpha(Utils.FLOAT_EPSILON);
    }

    /* access modifiers changed from: private */
    /* renamed from: o6 */
    public static /* synthetic */ void m103837o6(Throwable th) {
    }

    /* access modifiers changed from: private */
    /* renamed from: p5 */
    public /* synthetic */ void m103840p5(C27634l lVar, String str, Bundle bundle) {
        this.f84893J.setAmexOfferPopupCloseDate();
        if (!bundle.getBoolean("RESULT_YES")) {
            return;
        }
        if (Boolean.TRUE.equals(lVar.mo67098f())) {
            m103682M4().mo91594b0(this, "PAYROLL", lVar.mo67094c(), true);
        } else {
            m103682M4().mo91544D(this, lVar.mo67094c(), true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p6 */
    public /* synthetic */ void m103841p6(List list) {
        this.f84908Y.updateProductTypes(list);
        this.f84919j0.mo53846i(PopupManager.C21539b.PLUS_ACTIVATION_DIALOG_ID, m103693O4(), false);
    }

    /* renamed from: p7 */
    private void m103842p7(C19289b bVar) {
        C2379b.m9213w(this).mo7740e().mo7726U0(bVar.mo47517a()).mo7716I0(new C35195e(bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: q5 */
    public /* synthetic */ void m103845q5(Long l, DialogInterface dialogInterface) {
        this.f84908Y.getUserInfo().clientMustSeeDOConditions = Boolean.FALSE;
        if (l != null) {
            m103673K7(l);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q6 */
    public /* synthetic */ void m103846q6(Throwable th) {
        this.f84908Y.updateProductTypes((List<ProductType>) null);
        this.f84919j0.mo53846i(PopupManager.C21539b.PLUS_ACTIVATION_DIALOG_ID, (C1483c) null, false);
    }

    /* renamed from: q7 */
    private void m103847q7(BadgeRelativeLayout badgeRelativeLayout) {
        if (badgeRelativeLayout != null) {
            badgeRelativeLayout.getBadgeView().setBadge(NotificationBadgeView.BadgeType.Empty.f39879d);
            m103757Z4(badgeRelativeLayout, this.f84890G.get());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r5 */
    public /* synthetic */ void m103850r5(ModalDialog.C13301b bVar) {
        C38125h.m112236a(this).mo91645b(this, (String) null);
        bVar.mo35625a().mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: r6 */
    public /* synthetic */ void m103851r6(C27634l lVar) {
        this.f84919j0.mo53846i(PopupManager.C21539b.CARD_CAMPAIGN_OFFER_ID, m103636E4(lVar), true);
    }

    /* renamed from: r7 */
    private void m103852r7(String str, String str2, String str3) {
        if (m103745X4() != null) {
            m103745X4().mo95635L2(true);
        }
        this.f84907X.useOtpForAction(this.f84897N.mo66809a(m103688N4(str, str2, str3)), new C35200j());
    }

    /* access modifiers changed from: private */
    /* renamed from: s5 */
    public /* synthetic */ void m103855s5() {
        this.f84926q0.f84958F.mo70952tj();
    }

    /* access modifiers changed from: private */
    /* renamed from: s6 */
    public /* synthetic */ void m103856s6(Throwable th) {
        this.f84919j0.mo53846i(PopupManager.C21539b.CARD_CAMPAIGN_OFFER_ID, (C1483c) null, false);
    }

    /* renamed from: t4 */
    private void m103858t4(String str, C1464a0 a0Var) {
        getSupportFragmentManager().mo4367F1(str, this, a0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: t5 */
    public /* synthetic */ void m103859t5(C13310d dVar, String str, Button button) {
        dVar.mo4577k1();
        this.f84893J.setJuniorPopupCloseDate(str);
        m103682M4().mo91540B(this, this.f84892I, NavigatorConstants$JuniorFlow.ACTIVATION, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: t6 */
    public /* synthetic */ void m103860t6(View view) {
        C36546y.m108282F().mo27152s("qr_pay", "action_bar", "open_camera");
        mo86447x2(QrScannerActivity.class);
    }

    /* renamed from: t7 */
    private void m103861t7() {
        if (!this.f84908Y.isAuthorized()) {
            this.f84891H.mo3946b().getViewTreeObserver().addOnGlobalLayoutListener(this.f84928s0);
        }
    }

    /* renamed from: u4 */
    private void m103863u4() {
        m103858t4("REQUEST_KEY_MCC_UPDATED", new C30854z1(this));
        m103858t4("REQUEST_KEY_GOOGLE_PAY_DIALOG", new C30521a2(this));
        m103858t4("REQUEST_KEY_BIRTHDAY_DIALOG", new C30535b2(this));
        m103858t4("REQUEST_KEY_OPEN_GIFT_CARD_TAB", new C30549c2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: u5 */
    public /* synthetic */ void m103864u5(String str, C13310d dVar, Button button) {
        this.f84893J.setJuniorPopupCloseDate(str);
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: u6 */
    public /* synthetic */ void m103865u6(C27631i iVar) {
        if (C26370a.m82430a(this.f84920k0.mo65059h(iVar))) {
            this.f84917h0.setBadgeCount(MainBottomNavigationViewPresenter.NavigationItem.PRODUCTS, (Integer) null);
        } else {
            this.f84917h0.removeBadge(MainBottomNavigationViewPresenter.NavigationItem.PRODUCTS);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u7 */
    public void m103866u7() {
        int i;
        C19290c cVar;
        int r = C32319m.m95311r();
        boolean z = true;
        if (r == 0 || r == 1) {
            i = C10320i.ic_morning_ny_bg;
            this.f84891H.f69335p.setImageResource(C10320i.ic_morning_sun);
        } else {
            i = C10320i.ic_night_ny_bg;
            this.f84891H.f69335p.setImageResource(C10320i.ic_night_moon);
        }
        int f = C32335t0.m95361f();
        if (f == 0) {
            CoordinatorLayout c = this.f84891H.mo3946b();
            if (C32303f.m95187G()) {
                i = C10320i.ic_splash_football;
            }
            c.setBackground(m103824l7(i));
            this.f84891H.f69335p.setVisibility(8);
        } else if (f == 1) {
            this.f84891H.mo3946b().setBackground(m103824l7(C10320i.background_solo));
            this.f84891H.f69335p.setVisibility(8);
            z = false;
        } else if (f == 2) {
            this.f84891H.mo3946b().setBackground(m103824l7(C10320i.ic_wealth_main_bg));
            this.f84891H.f69335p.setVisibility(8);
        }
        if (z) {
            cVar = C19290c.DARK;
        } else {
            cVar = C19290c.LIGHT;
        }
        m103876w7(cVar);
    }

    /* renamed from: v4 */
    private void m103868v4() {
        this.f84891H.mo3946b().getViewTreeObserver().addOnScrollChangedListener(new C30776t1());
    }

    /* access modifiers changed from: private */
    /* renamed from: v5 */
    public /* synthetic */ void m103869v5(C13310d dVar, Button button) {
        mo86438k1(this.f84905V.mo65888a().mo94886E());
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: v6 */
    public static /* synthetic */ void m103870v6(Throwable th) {
    }

    /* renamed from: v7 */
    private void m103871v7() {
        MenuItem findItem;
        ToolbarView toolbarView = this.f85671t;
        if (toolbarView != null && (findItem = toolbarView.getMenu().findItem(C10322k.notification_menu_item)) != null) {
            m103847q7(C18601e.m63154b(findItem));
        }
    }

    /* renamed from: w4 */
    private void m103873w4(Intent intent) {
        if (intent.getAction() == null) {
            this.f84923n0.postDelayed(new C30605g2(this), 200);
            return;
        }
        String action = intent.getAction();
        action.hashCode();
        char c = 65535;
        switch (action.hashCode()) {
            case -1781276305:
                if (action.equals("ACTION_OPEN_PAYMENTS_TAB")) {
                    c = 0;
                    break;
                }
                break;
            case -1307983333:
                if (action.equals("ACTION_OPEN_INSTALLMENT_POP_UP")) {
                    c = 1;
                    break;
                }
                break;
            case -1248943804:
                if (action.equals("ACTION_OPEN_MONEY_REQUEST")) {
                    c = 2;
                    break;
                }
                break;
            case -1217901283:
                if (action.equals("ACTION_OPEN_OPEN_BANKING")) {
                    c = 3;
                    break;
                }
                break;
            case -879484106:
                if (action.equals("ACTION_OPEN_GIFT_CARDS_TAB")) {
                    c = 4;
                    break;
                }
                break;
            case -647623351:
                if (action.equals("ACTION_OPEN_HUB")) {
                    c = 5;
                    break;
                }
                break;
            case 247521603:
                if (action.equals("ACTION_OPEN_LIFESTYLE_OFFERS_TAB")) {
                    c = 6;
                    break;
                }
                break;
            case 483606933:
                if (action.equals("ACTION_OPEN_DARK_MODE_ACTION_SHEET")) {
                    c = 7;
                    break;
                }
                break;
            case 557291506:
                if (action.equals("ACTION_OPEN_TRANSFERS_TAB")) {
                    c = 8;
                    break;
                }
                break;
            case 1287408395:
                if (action.equals("ACTION_OPEN_MY_PRODUCTS")) {
                    c = 9;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f84923n0.postDelayed(new C30550c3(this), 400);
                return;
            case 1:
                String stringExtra = intent.getStringExtra("REDIRECT_PROCESS_REF");
                String stringExtra2 = intent.getStringExtra("REDIRECT_PROCESS_URL");
                String stringExtra3 = intent.getStringExtra("REDIRECT_PROCESS_TYPE");
                String stringExtra4 = intent.getStringExtra("REDIRECT_PUSH_TYPE");
                if (stringExtra != null) {
                    IdentityVerificationActivity.m68163i3(this, stringExtra, stringExtra2, stringExtra3, stringExtra4, false);
                    return;
                }
                return;
            case 2:
                this.f84923n0.postDelayed(new C30751r2(this, intent.getLongExtra("PARAM_MONEY_REQUEST_ID", -1)), 400);
                return;
            case 3:
                mo86145n7(1);
                this.f84926q0.mo86178Ay(C30753r4.OPEN_BANKING_PRODUCTS);
                return;
            case 4:
                this.f84923n0.postDelayed(new C30843y3(this), 400);
                getSupportFragmentManager().mo4364E1("REQUEST_KEY_SWITCH_ON_GIFT_CARD_PUSH_NOTIFICATION", new Bundle());
                return;
            case 5:
                mo86145n7(4);
                return;
            case 6:
                this.f84923n0.postDelayed(new C30843y3(this), 400);
                return;
            case 7:
                mo86145n7(4);
                m103639E7();
                return;
            case 8:
                this.f84923n0.postDelayed(new C30700n3(this), 400);
                return;
            case 9:
                mo86145n7(1);
                this.f84926q0.mo86178Ay(C30753r4.BOG_PRODUCTS);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w5 */
    public /* synthetic */ void m103874w5(C13310d dVar, Button button) {
        dVar.mo4577k1();
        mo86438k1(this.f84905V.mo65888a().mo94886E());
        C38125h.m112238c(getApplicationContext()).mo91626r(this);
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: w6 */
    public /* synthetic */ void m103875w6(View view) {
        m103883y4();
    }

    /* access modifiers changed from: private */
    /* renamed from: w7 */
    public void m103876w7(C19290c cVar) {
        if (this.f85671t != null) {
            int i = C35192b.f84938b[cVar.ordinal()];
            if (i == 1) {
                this.f85671t.setControlsUnfillColor(getColor(C10318g.f28651z0));
                this.f85671t.mo37106h0(false, false);
            } else if (i == 2) {
                this.f85671t.setControlsUnfillColor(getColor(C10318g.f28646j1));
                this.f85671t.mo37106h0(false, false);
            } else if (i == 3) {
                boolean canScrollVertically = this.f84891H.f69322A.canScrollVertically(-1);
                this.f85671t.setControlsUnfillColor(C18368l.m62755d(this, C10316e.f28611o));
                this.f85671t.mo37106h0(canScrollVertically, false);
            }
        }
    }

    /* renamed from: x4 */
    private void m103878x4() {
        if (this.f84915f0) {
            m103771b7();
        } else if (this.f84914e0) {
            m103777c7();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x5 */
    public /* synthetic */ void m103879x5(String str, String str2, Bundle bundle) {
        int i;
        if (bundle.getBoolean("RESULT_YES")) {
            Intent intent = new Intent(this, ReferalsActivity.class);
            if (str.equals("MBANK_REFERRAL_PASSIVE_POPUP")) {
                i = 0;
            } else {
                i = null;
            }
            intent.putExtra("KEY_TAB", i);
            startActivity(intent);
        }
    }

    /* renamed from: x7 */
    private void m103881x7() {
        C27371n0 n0Var = this.f84891H;
        this.f84917h0 = new MainBottomNavigationViewPresenterImpl(n0Var.f69342w, n0Var.f69322A, new C30777t2(this));
        if (this.f84908Y.isAuthorized() || this.f84914e0 || this.f84915f0) {
            m103886y7();
            m103622B7();
            m103737V7();
            m103878x4();
            return;
        }
        this.f85671t.getViewTreeObserver().addOnGlobalLayoutListener(new C35194d());
    }

    /* renamed from: y4 */
    private void m103883y4() {
        PopupWindow popupWindow;
        if (this.f84924o0 != null && (popupWindow = this.f84925p0) != null) {
            popupWindow.dismiss();
            this.f84893J.setDidCloseContactUsHint(true);
            mo86160y2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y5 */
    public /* synthetic */ void m103884y5(boolean z) {
        this.f84893J.setLocationPermissionTime(System.currentTimeMillis());
    }

    /* access modifiers changed from: private */
    /* renamed from: y6 */
    public /* synthetic */ void m103885y6(C13310d dVar, Button button) {
        m103682M4().mo91547E0(this);
        dVar.mo4577k1();
    }

    /* renamed from: y7 */
    private void m103886y7() {
        m103891z7(this.f84891H.f69322A.getCurrentItem());
    }

    /* access modifiers changed from: private */
    /* renamed from: z4 */
    public void m103888z4() {
        if (m103734V4() != null) {
            m103734V4().mo4577k1();
        }
        if (m103745X4() != null) {
            m103745X4().mo4577k1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z5 */
    public /* synthetic */ void m103889z5(boolean z) {
        this.f84893J.setNotificationPermissionTime(System.currentTimeMillis());
    }

    /* access modifiers changed from: private */
    /* renamed from: z6 */
    public /* synthetic */ void m103890z6() {
        this.f84891H.f69341v.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: z7 */
    public void m103891z7(int i) {
        if (this.f84908Y.isAuthorized() || i != 0) {
            if (this.f84908Y.isAuthorized()) {
                this.f84891H.f69324e.setVisibility(8);
            }
            this.f84926q0.f84958F.mo70953um();
            return;
        }
        C32343x.m95444e1(this, true);
        getWindow().setStatusBarColor(0);
        this.f84926q0.f84958F.mo70950r9();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: C7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86136C7(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 1
            r10.mo86145n7(r0)
            ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel r1 = r10.f84926q0
            a81.r4 r2 = a81.C30753r4.BOG_PRODUCTS
            r1.mo86178Ay(r2)
            r11.hashCode()
            int r1 = r11.hashCode()
            java.lang.String r2 = "LOAN"
            r3 = 4
            r4 = 3
            r5 = 2
            java.lang.String r6 = "ACCOUNT"
            java.lang.String r7 = "DEPOSIT"
            r8 = 0
            r9 = -1
            switch(r1) {
                case -2022530434: goto L_0x006c;
                case -459336179: goto L_0x0063;
                case -373312384: goto L_0x0058;
                case -78778999: goto L_0x004d;
                case 2145: goto L_0x0042;
                case 2342128: goto L_0x0039;
                case 1878720662: goto L_0x002e;
                case 2023960877: goto L_0x0023;
                default: goto L_0x0020;
            }
        L_0x0020:
            r11 = r9
            goto L_0x0074
        L_0x0023:
            java.lang.String r1 = "OVERDRAFT"
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x002c
            goto L_0x0020
        L_0x002c:
            r11 = 7
            goto L_0x0074
        L_0x002e:
            java.lang.String r1 = "CREDIT_CARD"
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x0037
            goto L_0x0020
        L_0x0037:
            r11 = 6
            goto L_0x0074
        L_0x0039:
            boolean r11 = r11.equals(r2)
            if (r11 != 0) goto L_0x0040
            goto L_0x0020
        L_0x0040:
            r11 = 5
            goto L_0x0074
        L_0x0042:
            java.lang.String r1 = "CD"
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x004b
            goto L_0x0020
        L_0x004b:
            r11 = r3
            goto L_0x0074
        L_0x004d:
            java.lang.String r1 = "CREDITCARD"
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x0056
            goto L_0x0020
        L_0x0056:
            r11 = r4
            goto L_0x0074
        L_0x0058:
            java.lang.String r1 = "OVERDUE"
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x0061
            goto L_0x0020
        L_0x0061:
            r11 = r5
            goto L_0x0074
        L_0x0063:
            boolean r11 = r11.equals(r6)
            if (r11 != 0) goto L_0x006a
            goto L_0x0020
        L_0x006a:
            r11 = r0
            goto L_0x0074
        L_0x006c:
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x0073
            goto L_0x0020
        L_0x0073:
            r11 = r8
        L_0x0074:
            switch(r11) {
                case 0: goto L_0x00c9;
                case 1: goto L_0x0099;
                case 2: goto L_0x0088;
                case 3: goto L_0x0088;
                case 4: goto L_0x00c9;
                case 5: goto L_0x0079;
                case 6: goto L_0x0088;
                case 7: goto L_0x0099;
                default: goto L_0x0077;
            }
        L_0x0077:
            r0 = r9
            goto L_0x00d7
        L_0x0079:
            ge.bog.mobilebank.model.Client r11 = r10.f84908Y
            boolean r11 = r11.hasProduct(r2)
            if (r11 == 0) goto L_0x0086
            ge.bog.mobilebank.model.Client r11 = r10.f84908Y
            r11.requestLoans(r8)
        L_0x0086:
            r0 = r4
            goto L_0x00d7
        L_0x0088:
            ge.bog.mobilebank.model.Client r11 = r10.f84908Y
            java.lang.String r0 = "CREDITCARDACCOUNT"
            boolean r11 = r11.hasProduct(r0)
            if (r11 == 0) goto L_0x0097
            ge.bog.mobilebank.model.Client r11 = r10.f84908Y
            r11.requestCreditCards(r8)
        L_0x0097:
            r0 = r5
            goto L_0x00d7
        L_0x0099:
            ge.bog.mobilebank.model.Client r11 = r10.f84908Y
            boolean r11 = r11.hasProduct(r6)
            if (r11 == 0) goto L_0x00d7
            ge.bog.mobilebank.model.Client r11 = r10.f84908Y
            boolean r11 = r11.isAuthorized()
            if (r11 == 0) goto L_0x00d7
            nw.h r11 = r10.f84903T
            ed1.p r11 = r11.mo65878b()
            ed1.w r1 = gd1.C40992a.m118827a()
            ed1.p r11 = r11.mo95027o0(r1)
            a81.m3 r1 = new a81.m3
            r1.<init>(r10)
            a81.o3 r2 = new a81.o3
            r2.<init>()
            hd1.b r11 = r11.mo94983G0(r1, r2)
            r10.mo86438k1(r11)
            goto L_0x00d7
        L_0x00c9:
            ge.bog.mobilebank.model.Client r11 = r10.f84908Y
            boolean r11 = r11.hasProduct(r7)
            if (r11 == 0) goto L_0x00d6
            ge.bog.mobilebank.model.Client r11 = r10.f84908Y
            r11.requestDepositBonds(r8)
        L_0x00d6:
            r0 = r3
        L_0x00d7:
            if (r0 == r9) goto L_0x00de
            ge.bog.mobilebank.ui.activities.MainActivityViewModel$ViewModel r11 = r10.f84926q0
            r11.mo86179By(r0)
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.MainActivity.mo86136C7(java.lang.String):void");
    }

    /* renamed from: G7 */
    public void mo86137G7() {
        if (this.f84916g0.m103926F() != null) {
            mo86145n7(0);
        }
    }

    /* renamed from: J7 */
    public void mo86138J7() {
        if (this.f84916g0.m103927G() != null) {
            mo86145n7(3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_main;
    }

    /* renamed from: N7 */
    public void mo86139N7() {
        if (this.f84916g0.m103928H() != null) {
            mo86145n7(2);
        }
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        m103789e7(str, str2, str3, str4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27371n0 d = C27371n0.m84792d(getLayoutInflater());
        this.f84891H = d;
        setContentView((View) d.mo3946b());
        this.f84926q0 = (MainActivityViewModel$ViewModel) new C1620q0(this).mo4936a(MainActivityViewModel$ViewModel.class);
        this.f84919j0 = new PopupManager(this.f84918i0, getSupportFragmentManager(), this.f84894K);
        getLifecycle().mo4906a(this.f84919j0);
        getLifecycle().mo4906a(this.f84918i0);
        overridePendingTransition(0, 0);
        m103720S7(getIntent());
        m103630D4(getIntent());
        if (C32335t0.m95361f() == 1) {
            this.f84891H.f69328i.setVisibility(8);
            this.f84891H.f69338s.setVisibility(8);
            this.f84891H.f69332m.setVisibility(0);
        } else if (C32335t0.m95361f() == 2) {
            this.f84891H.f69328i.setVisibility(8);
            this.f84891H.f69338s.setVisibility(0);
            this.f84891H.f69332m.setVisibility(8);
        } else {
            this.f84891H.f69328i.setVisibility(0);
            this.f84891H.f69338s.setVisibility(8);
            this.f84891H.f69332m.setVisibility(8);
        }
        C32343x.m95423W0(this.f84909Z, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            this.f84913d0 = getIntent().getExtras().getString(C32313j0.f79741a);
        }
        m103881x7();
        this.f84891H.f69322A.mo6603h(this.f84934y0);
        this.f84891H.f69322A.setUserInputEnabled(false);
        m103616A7();
        m103724T6();
        m103667J6();
        m103672K6();
        m103861t7();
        m103863u4();
        m103868v4();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P1 */
    public void mo86140P1(C32288b bVar) {
        super.mo86140P1(bVar);
        if (bVar == C32288b.OpenPaymentOnMainActivity) {
            mo86139N7();
        }
        if (bVar == C32288b.OpenHomeOnMainActivity) {
            mo86137G7();
        } else if (bVar == C32288b.OpenProductsOnMainActivity) {
            mo86145n7(1);
            C35612i1 E = this.f84916g0.m103929I();
            if (E != null) {
                E.mo86685t1();
            }
        }
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C32297d.m95154b(this, str);
    }

    /* renamed from: R1 */
    public void mo86141R1(Intent intent, boolean z) {
        super.mo86141R1(intent, !m103802h5());
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        if (z) {
            mo86441o2();
        } else {
            mo86425J1();
        }
    }

    /* renamed from: T4 */
    public SearchResultType mo86142T4() {
        C35202l lVar;
        C27371n0 n0Var = this.f84891H;
        if (n0Var == null || (lVar = this.f84916g0) == null || lVar.mo70156z(n0Var.f69322A.getCurrentItem()) == null) {
            return null;
        }
        return ((C35651n1) this.f84916g0.mo70156z(this.f84891H.f69322A.getCurrentItem())).getSearchType();
    }

    /* access modifiers changed from: protected */
    /* renamed from: W1 */
    public int mo40034W1() {
        return C10325n.menu_toolbar_main_activity;
    }

    /* renamed from: W7 */
    public void mo86143W7() {
        boolean z;
        if (this.f84908Y.isAuthorized()) {
            this.f84917h0.updateStateFor(MainBottomNavigationViewPresenter.NavigationItem.DISCOVER);
        } else {
            this.f84917h0.updateStateFor(MainBottomNavigationViewPresenter.NavigationItem.STATEMENTS);
        }
        if (this.f84908Y.isAuthorized() && !TextUtils.isEmpty(this.f84913d0)) {
            Intent intent = new Intent(this, PaymentFormActivity.class);
            intent.putExtra("PAYMENT_SERVICE_ID", "bog-comp-mobilepayments");
            intent.putExtra(C32313j0.f79741a, this.f84913d0);
            this.f84913d0 = null;
            startActivity(intent);
        }
        if (!this.f84908Y.isAuthorized() || this.f84891H.f69322A.getCurrentItem() != 0) {
            z = false;
        } else {
            z = true;
        }
        mo86159s7(z);
        if (this.f84908Y.isAuthorized()) {
            this.f84917h0.updateStateFor(MainBottomNavigationViewPresenter.NavigationItem.PRODUCTS);
            this.f84917h0.updateStateFor(MainBottomNavigationViewPresenter.NavigationItem.TRANSFERS);
        } else {
            this.f84917h0.updateStateFor(MainBottomNavigationViewPresenter.NavigationItem.CARDS);
            this.f84917h0.updateStateFor(MainBottomNavigationViewPresenter.NavigationItem.PAYMENTS);
        }
        m103737V7();
    }

    /* renamed from: X */
    public void mo47739X(List list) {
        m103696O7("SMSNOTIFS_CONVERT_SMS_TO_PUSH", this.f84897N.mo66809a(C19511i.m65102a(C19511i.m65103b(list), this.f84893J.getExtCustomer(), (String) null, (String) null, (String) null)), C35201k.SMS_TO_PUSH.name());
        this.f84889A0 = new C30660k2(this, list);
    }

    /* renamed from: f7 */
    public void mo86144f7(TemplatesAndConfigEvent templatesAndConfigEvent) {
        int state = templatesAndConfigEvent.getState();
        if (state != 10) {
            if (state == 20) {
                this.f84922m0 = templatesAndConfigEvent.getTemplatesWithPaymentConfig().getDownloadedDebtTemplatesCount().getActualDebts() + 0;
                m103778c8();
                return;
            } else if (!(state == 30 || state == 40)) {
                return;
            }
        }
        this.f84922m0 = 0;
        m103778c8();
    }

    /* renamed from: n7 */
    public void mo86145n7(int i) {
        mo86146o7(i, false);
    }

    /* renamed from: o7 */
    public void mo86146o7(int i, boolean z) {
        if (this.f84891H != null) {
            m103769b5(i);
            if (z) {
                this.f84891H.f69322A.mo6614p(this.f84934y0);
            }
            this.f84891H.f69322A.mo6606l(i, false);
            if (z) {
                this.f84891H.f69322A.mo6603h(this.f84934y0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 9999) {
            this.f84908Y.updateClientProducts();
        } else if (i != 10029) {
            if (i == 10033) {
                C32297d.m95160h(this, getString(C10328q.payment_completed_successfully));
            } else if (i == 10036) {
                C20334c B = this.f84916g0.m103926F();
                if (B != null) {
                    B.mo48816T1();
                }
                C12910e.m48793k(this, C27950a.m86284a(C32312j.f79736f), C12902d.C12905b.C12907b.f38104a);
                m103751Y4();
            } else if (i == 10037) {
                this.f84926q0.f84958F.mo70949qh();
                C20334c B2 = this.f84916g0.m103926F();
                if (B2 != null) {
                    B2.mo48815G1();
                    B2.mo48819l2();
                }
            }
        } else if (intent != null && intent.getBooleanExtra("ProductConfirmationActivity.EXTRA_CONFIRMATION_RESULT_REJECT", false)) {
            C32297d.m95160h(this, C27950a.m86284a("product.confirmation.successfully.declined"));
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f84908Y.isAuthorized()) {
            m103645F7();
        }
    }

    public void onBackPressed() {
        if (this.f84891H.f69322A.getCurrentItem() > 0) {
            mo86145n7(0);
        } else {
            super.onBackPressed();
        }
    }

    @C41452l
    public void onCarDebtEvent(TemplateGroup templateGroup) {
        mo86144f7(this.f84912c0);
    }

    @C41452l
    public void onConvertSmsToPushEvent(ConvertSmsToPushEvent convertSmsToPushEvent) {
        int state = convertSmsToPushEvent.getState();
        if (state != 10) {
            if (state == 20) {
                m103888z4();
                C32297d.m95160h(this, getString(C10328q.sms_to_push_success_msg));
            } else if (state == 30) {
                m103888z4();
                C32297d.m95153a(this);
            } else if (state == 40) {
                m103888z4();
                C32297d.m95154b(this, C27950a.m86284a(convertSmsToPushEvent.getErrorKey()));
            }
        } else if (m103734V4() != null) {
            m103734V4().mo95635L2(true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        m103871v7();
        m103763a5(this.f84891H.f69322A.getCurrentItem());
        return onCreateOptionsMenu;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        getLifecycle().mo4909d(this.f84918i0);
        C32343x.m95489t1(this.f84909Z, this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PopupWindow popupWindow = this.f84925p0;
        if (popupWindow != null) {
            if (popupWindow.isShowing()) {
                this.f84925p0.dismiss();
            }
            this.f84925p0 = null;
            this.f84924o0 = null;
        }
    }

    @C41452l
    public void onExternalUserStoredEvent(ExternalUserStoredEvent externalUserStoredEvent) {
        int state = externalUserStoredEvent.getState();
        if (state == 30 || state == 40) {
            mo86430Z1();
        }
    }

    @C41452l
    public void onFeatureFeedbackResponse(FeatureFeedBackEvent featureFeedBackEvent) {
        if (featureFeedBackEvent.getState() == 20 && this.f84932w0) {
            this.f84932w0 = false;
            C38194r.m112360A(this, featureFeedBackEvent, FeatureFeedBackEvent.Location.HOME_TABS);
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m103630D4(intent);
        m103878x4();
        m103873w4(intent);
        m103720S7(intent);
    }

    @C41452l
    public void onNotificationsCount(NotificationCountEvent notificationCountEvent) {
        this.f84890G.set(notificationCountEvent.getNotificationTotalCount());
        this.f84891H.mo3946b().post(new C30649j4(this, notificationCountEvent));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int i;
        if (menuItem.getItemId() == C10322k.search_menu_item) {
            C36546y.m108282F().mo27152s("search", "", "open_search_form");
            overridePendingTransition(0, 0);
            Intent intent = new Intent(this, SearchActivity.class);
            if (mo86142T4() != null) {
                i = mo86142T4().getIntValue();
            } else {
                i = -1;
            }
            intent.putExtra("SEARCH_TYPE", i);
            startActivity(intent);
            return true;
        } else if (menuItem.getItemId() != C10322k.notification_menu_item) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            C36546y.m108282F().mo27152s("search", "", "open_search_form");
            NotificationListActivity.m104382O2(this);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.f84919j0.mo53849p(true);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 909) {
            if (i == 910) {
                if (iArr.length > 0 && iArr[0] == 0) {
                    if (Build.VERSION.SDK_INT < 29) {
                        SFMCSdk.requestSdk(new C30659k1());
                    } else {
                        new C32330r0((Activity) this).mo72834u();
                    }
                }
            } else {
                return;
            }
        }
        if (iArr.length > 0 && iArr[0] == 0 && C32330r0.m95338m(this, "android.permission.ACCESS_FINE_LOCATION")) {
            SFMCSdk.requestSdk(new C30802v1());
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        ViewPager2 viewPager2;
        super.onResume();
        C35202l lVar = this.f84916g0;
        if (lVar != null && (viewPager2 = this.f84891H.f69322A) != null) {
            if (lVar.mo70156z(viewPager2.getCurrentItem()) == this.f84916g0.m103928H()) {
                MedalliaDigital.disableIntercept();
            } else {
                MedalliaDigital.enableIntercept();
            }
            m103763a5(this.f84891H.f69322A.getCurrentItem());
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:support:fragments");
    }

    @C41452l
    public void onSmsToPushStateEvent(SmsToPushStateEvent smsToPushStateEvent) {
        int state = smsToPushStateEvent.getState();
        if (state == 20) {
            this.f84935z0 = smsToPushStateEvent;
            this.f84919j0.mo53846i(PopupManager.C21539b.SMS_TO_PUSH_DIALOG_ID, m103728U4(), false);
        } else if (state == 30 || state == 40) {
            this.f84919j0.mo53846i(PopupManager.C21539b.SMS_TO_PUSH_DIALOG_ID, (C1483c) null, false);
        }
    }

    public void onStart() {
        super.onStart();
        this.f84908Y.requestTemplatesWithConfig(false);
    }

    @C41452l
    public void onTemplateBasketItemChanged(TemplateBasketItem templateBasketItem) {
        mo86144f7(this.f84912c0);
    }

    @C41452l
    public void onTemplatesWithConfigEvent(TemplatesAndConfigEvent templatesAndConfigEvent) {
        this.f84912c0 = templatesAndConfigEvent;
        mo86144f7(templatesAndConfigEvent);
        if (!this.f84908Y.isAuthorized() && templatesAndConfigEvent.getState() == 20 && templatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplates() != null && templatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplates().size() > 0) {
            this.f84929t0 = true;
        }
    }

    /* renamed from: s7 */
    public void mo86159s7(boolean z) {
        C20334c B;
        C35202l lVar = this.f84916g0;
        if (lVar != null && (B = lVar.m103926F()) != null) {
            B.mo48818h2(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public void mo86160y2() {
        ContactUsActivity.m103436P3(this);
    }
}
