package com.identomat.subfragments.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.C0808h;
import com.github.mikephil.charting.utils.Utils;
import ef1.C40793d0;
import ef1.C40813h;
import ef1.C40814h0;
import ef1.C40818i0;
import ef1.C40822j0;
import ef1.C40845o1;
import ef1.C40867u0;
import he1.C41228o;
import he1.C41238w;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import me1.C41752f;
import oe1.C41862l;
import p485kc.C16346d;
import p513mc.C16663b;
import p513mc.C16664c;
import p678yc.C18877a;
import p692zc.C19002e;
import ue1.C43064a;
import ue1.C43079p;

public final class LoadingView extends View {

    /* renamed from: d */
    private final Paint f30292d = new Paint();

    /* renamed from: e */
    private final Drawable f30293e = C0808h.m3031f(getResources(), C16346d.identomat_idento_mask_vio, (Resources.Theme) null);

    /* renamed from: f */
    private int f30294f;

    /* renamed from: g */
    private RectF f30295g = new RectF();

    /* renamed from: h */
    private float f30296h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float f30297i = ((float) getHeight());
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f30298j = 1.0f;

    /* renamed from: k */
    private int f30299k;

    /* renamed from: l */
    private final Path f30300l = new Path();

    /* renamed from: m */
    private final int f30301m = 40;

    /* renamed from: n */
    private Timer f30302n;

    /* renamed from: com.identomat.subfragments.views.LoadingView$a */
    public static final class C10641a extends TimerTask {

        /* renamed from: d */
        private final C43064a f30303d;

        public C10641a(C43064a aVar) {
            C41536l.m120489i(aVar, "callBack");
            this.f30303d = aVar;
        }

        public void run() {
            this.f30303d.invoke();
        }
    }

    /* renamed from: com.identomat.subfragments.views.LoadingView$b */
    static final class C10642b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoadingView f30304d;

        /* renamed from: com.identomat.subfragments.views.LoadingView$b$a */
        static final class C10643a extends C41862l implements C43079p {

            /* renamed from: h */
            int f30305h;

            /* renamed from: i */
            final /* synthetic */ LoadingView f30306i;

            /* renamed from: com.identomat.subfragments.views.LoadingView$b$a$a */
            static final class C10644a extends C41862l implements C43079p {

                /* renamed from: h */
                int f30307h;

                /* renamed from: i */
                final /* synthetic */ LoadingView f30308i;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C10644a(LoadingView loadingView, Continuation continuation) {
                    super(2, continuation);
                    this.f30308i = loadingView;
                }

                /* renamed from: a */
                public final Continuation mo3708a(Object obj, Continuation continuation) {
                    return new C10644a(this.f30308i, continuation);
                }

                /* renamed from: f */
                public final Object mo3709f(Object obj) {
                    Object unused = C41793d.m121157c();
                    if (this.f30307h == 0) {
                        C41228o.m119483b(obj);
                        LoadingView loadingView = this.f30308i;
                        loadingView.f30297i = loadingView.f30297i - (((float) (this.f30308i.getHeight() / this.f30308i.getFPS())) / this.f30308i.f30298j);
                        if (this.f30308i.f30297i < ((float) (-this.f30308i.getHeight()))) {
                            LoadingView loadingView2 = this.f30308i;
                            loadingView2.f30297i = (float) loadingView2.getHeight();
                        }
                        return C41238w.f97225a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* renamed from: n */
                public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                    return ((C10644a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10643a(LoadingView loadingView, Continuation continuation) {
                super(2, continuation);
                this.f30306i = loadingView;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                return new C10643a(this.f30306i, continuation);
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                Object c = C41793d.m121157c();
                int i = this.f30305h;
                if (i == 0) {
                    C41228o.m119483b(obj);
                    C40793d0 a = C40867u0.m118467a();
                    C10644a aVar = new C10644a(this.f30306i, (Continuation) null);
                    this.f30305h = 1;
                    if (C40813h.m118303e(a, aVar, this) == c) {
                        return c;
                    }
                } else if (i == 1) {
                    C41228o.m119483b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f30306i.invalidate();
                return C41238w.f97225a;
            }

            /* renamed from: n */
            public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                return ((C10643a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10642b(LoadingView loadingView) {
            super(0);
            this.f30304d = loadingView;
        }

        public final void invoke() {
            C40845o1 unused = C40821j.m118316b(C40818i0.m118309a(), (C41752f) null, (C40822j0) null, new C10643a(this.f30304d, (Continuation) null), 3, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(attributeSet, "attrs");
    }

    /* renamed from: f */
    private final void m38789f() {
        int width = (getWidth() / 6) * 4;
        this.f30294f = (getHeight() - width) / 2;
        int width2 = (getWidth() - width) / 2;
        Drawable drawable = this.f30293e;
        if (drawable != null) {
            int i = this.f30294f;
            drawable.setBounds(width2, i, width2 + width, width + i);
        }
        this.f30296h = ((float) getWidth()) * 0.9f;
        RectF rectF = this.f30295g;
        rectF.left = Utils.FLOAT_EPSILON;
        rectF.right = (float) getWidth();
        RectF rectF2 = this.f30295g;
        float f = this.f30297i;
        rectF2.top = f;
        rectF2.bottom = f + this.f30296h;
    }

    /* renamed from: d */
    public final void mo27359d() {
        C10641a aVar = new C10641a(new C10642b(this));
        if (this.f30302n == null) {
            Timer timer = new Timer();
            this.f30302n = timer;
            timer.scheduleAtFixedRate(aVar, 0, (long) (1000 / this.f30301m));
        }
    }

    /* renamed from: e */
    public final void mo27360e(C18877a aVar) {
        Integer num;
        int i;
        C41536l.m120489i(aVar, "config");
        this.f30292d.setColor(-1);
        this.f30292d.setStrokeWidth(2.0f);
        C19002e a = aVar.mo46861a();
        if (a == null) {
            num = null;
        } else {
            Integer b = a.mo47099h().mo33034b();
            if (b == null) {
                i = 0;
            } else {
                i = b.intValue();
            }
            num = Integer.valueOf(i);
        }
        C41536l.m120486f(num);
        int intValue = num.intValue();
        this.f30299k = intValue;
        if (Build.VERSION.SDK_INT >= 29) {
            Drawable drawable = this.f30293e;
            if (drawable != null) {
                C16664c.m58987a();
                drawable.setColorFilter(C16663b.m58986a(this.f30299k, BlendMode.SRC_ATOP));
                return;
            }
            return;
        }
        Drawable drawable2 = this.f30293e;
        if (drawable2 != null) {
            drawable2.setColorFilter(intValue, PorterDuff.Mode.SRC_ATOP);
        }
    }

    public final int getFPS() {
        return this.f30301m;
    }

    public final Timer getTimer() {
        return this.f30302n;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m38789f();
        this.f30300l.reset();
        this.f30300l.addOval(this.f30295g, Path.Direction.CW);
        this.f30300l.setFillType(Path.FillType.EVEN_ODD);
        if (canvas != null) {
            canvas.clipPath(this.f30300l);
        }
        Drawable drawable = this.f30293e;
        if (drawable != null) {
            C41536l.m120486f(canvas);
            drawable.draw(canvas);
        }
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        if (!z) {
            Timer timer = this.f30302n;
            if (timer != null) {
                timer.cancel();
            }
            this.f30302n = null;
            return;
        }
        mo27359d();
    }

    public final void setTimer(Timer timer) {
        this.f30302n = timer;
    }
}
