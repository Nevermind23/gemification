package p341ge.bog.chat.presentation.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2396k;
import com.bumptech.glide.load.resource.bitmap.C2520l;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p035c4.C2247a;
import p035c4.C2256h;
import p050d4.C5822f;
import p063e4.C6032d;
import p192o3.C7423a;
import p205p3.C7676d;
import p419fg.C12870a;
import p559pg.C17345a;
import p653wf.C18586o;
import p653wf.C18587p;
import p653wf.C18588q;

/* renamed from: ge.bog.chat.presentation.activity.n0 */
public final class C13045n0 implements C17345a {

    /* renamed from: e */
    public static final C13047b f38436e = new C13047b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f38437a;

    /* renamed from: b */
    private final boolean f38438b;

    /* renamed from: c */
    private final C2396k f38439c;

    /* renamed from: d */
    private final C2256h f38440d;

    /* renamed from: ge.bog.chat.presentation.activity.n0$a */
    public static final class C13046a {

        /* renamed from: a */
        private final C12870a f38441a;

        /* renamed from: b */
        private final View f38442b;

        public C13046a(C12870a aVar, View view) {
            C41536l.m120489i(aVar, "attachment");
            this.f38441a = aVar;
            this.f38442b = view;
        }

        /* renamed from: a */
        public final C12870a mo34324a() {
            return this.f38441a;
        }

        /* renamed from: b */
        public final View mo34325b() {
            return this.f38442b;
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.n0$b */
    public static final class C13047b {
        private C13047b() {
        }

        public /* synthetic */ C13047b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13045n0 mo34326a(C17345a aVar) {
            C41536l.m120489i(aVar, "imageLoader");
            if (aVar instanceof C13045n0) {
                return (C13045n0) aVar;
            }
            return null;
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.n0$c */
    private static final class C13048c extends C5822f {

        /* renamed from: n */
        public static final C13049a f38443n = new C13049a((DefaultConstructorMarker) null);

        /* renamed from: l */
        private final ImageView f38444l;

        /* renamed from: m */
        private final View f38445m;

        /* renamed from: ge.bog.chat.presentation.activity.n0$c$a */
        public static final class C13049a {
            private C13049a() {
            }

            public /* synthetic */ C13049a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final View mo34329a(View view) {
                C41536l.m120489i(view, "view");
                return view;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13048c(ImageView imageView, View view) {
            super(imageView);
            C41536l.m120489i(imageView, "imageView");
            this.f38444l = imageView;
            this.f38445m = view;
        }

        /* renamed from: g */
        public void mo7280g(Drawable drawable) {
            super.mo7280g(drawable);
            View view = this.f38445m;
            if (view != null) {
                view.setVisibility(0);
            }
        }

        /* renamed from: t */
        public void mo7276b(Bitmap bitmap, C6032d dVar) {
            C41536l.m120489i(bitmap, "resource");
            super.mo7276b(bitmap, dVar);
            View view = this.f38445m;
            if (view != null) {
                view.setVisibility(8);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public void mo19037r(Bitmap bitmap) {
            this.f38444l.setImageBitmap(bitmap);
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.n0$d */
    private static final class C13050d extends C2520l {

        /* renamed from: c */
        private final int f38446c;

        /* renamed from: d */
        private final int f38447d;

        /* renamed from: e */
        private final int f38448e;

        public C13050d(int i, int i2, int i3) {
            this.f38446c = i;
            this.f38447d = i2;
            this.f38448e = i3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Bitmap mo8005c(C7676d dVar, Bitmap bitmap, int i, int i2) {
            int i3;
            C41536l.m120489i(dVar, "pool");
            C41536l.m120489i(bitmap, "toTransform");
            if (bitmap.getWidth() >= bitmap.getHeight()) {
                i3 = this.f38447d;
            } else {
                i3 = this.f38448e;
            }
            Bitmap c = super.mo8005c(dVar, bitmap, this.f38446c, i3);
            C41536l.m120488h(c, "super.transform(pool, toTransform, width, height)");
            return c;
        }
    }

    public C13045n0(Context context, boolean z) {
        C41536l.m120489i(context, "context");
        this.f38437a = context;
        this.f38438b = z;
        C2396k t = C2379b.m9210t(context);
        C41536l.m120488h(t, "with(context)");
        this.f38439c = t;
        C2247a u0 = ((C2256h) ((C2256h) new C2256h().mo7228g(C7423a.f21686a)).mo7220c0(C18587p.chat_image_attachment_placeholder)).mo7252u0(new C13050d(context.getResources().getDimensionPixelSize(C18586o.chat_image_attachment_width), context.getResources().getDimensionPixelSize(C18586o.chat_image_attachment_min_height), context.getResources().getDimensionPixelSize(C18586o.chat_image_attachment_max_height)));
        C41536l.m120488h(u0, "RequestOptions()\n       …_attachment_max_height)))");
        this.f38440d = (C2256h) u0;
    }

    /* renamed from: c */
    private final void m49221c(ImageView imageView, C12870a aVar) {
        if (!(aVar instanceof C12870a.C12872b) || ((C12870a.C12872b) aVar).mo33558d() == null) {
            imageView.setOnClickListener((View.OnClickListener) null);
        } else {
            imageView.setOnClickListener(new C13043m0(this, aVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m49222d(C13045n0 n0Var, C12870a aVar, View view) {
        C41536l.m120489i(n0Var, "this$0");
        C12870a.C12872b bVar = (C12870a.C12872b) aVar;
        ImageViewerActivity.f38352u.mo34232a(n0Var.f38437a, bVar.mo33558d(), bVar.mo33555b(), bVar.mo33554a());
    }

    /* renamed from: a */
    public void mo34322a(ImageView imageView, String str, Object obj) {
        C13046a aVar;
        C12870a aVar2;
        int i;
        C41536l.m120489i(imageView, "imageView");
        int id = imageView.getId();
        if (id == C18588q.f52159a0) {
            if (this.f38438b) {
                i = C18587p.ic_chat_operator_avatar_solo;
            } else {
                i = C18587p.ic_chat_operator_avatar;
            }
            imageView.setImageResource(i);
        } else if (id == C18588q.messageImageAttachment) {
            View view = null;
            if (obj instanceof C13046a) {
                aVar = (C13046a) obj;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar2 = aVar.mo34324a();
            } else {
                aVar2 = null;
            }
            if (aVar != null) {
                view = aVar.mo34325b();
            }
            m49221c(imageView, aVar2);
            if (aVar2 instanceof C12870a.C12872b) {
                this.f38439c.mo7740e().mo7726U0(((C12870a.C12872b) aVar2).mo33558d()).mo7215a(this.f38440d).mo7716I0(new C13048c(imageView, view));
            } else if (aVar2 instanceof C12870a.C12871a) {
                imageView.setImageResource(C18587p.chat_image_attachment_placeholder);
                if (view != null) {
                    view.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo34323e(View view) {
        C41536l.m120489i(view, "view");
        this.f38439c.mo7742m(C13048c.f38443n.mo34329a(view));
    }
}
