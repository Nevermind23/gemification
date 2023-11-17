package p341ge.bog.chat.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import com.github.chrisbanes.photoview.PhotoView;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p447hg.C15497a;
import p642vh.C18368l;
import p653wf.C18570b;
import p653wf.C18574d;
import p653wf.C18585n;
import p653wf.C18588q;
import p653wf.C18589r;
import ue1.C43064a;

/* renamed from: ge.bog.chat.presentation.activity.ImageViewerActivity */
public final class ImageViewerActivity extends C13009b {

    /* renamed from: u */
    public static final C13005a f38352u = new C13005a((DefaultConstructorMarker) null);

    /* renamed from: o */
    public C15497a f38353o;

    /* renamed from: p */
    private PhotoView f38354p;

    /* renamed from: q */
    private View f38355q;

    /* renamed from: r */
    private View f38356r;

    /* renamed from: s */
    private View f38357s;

    /* renamed from: t */
    private final C41217g f38358t = C41219i.m119470b(new C13006b(this));

    /* renamed from: ge.bog.chat.presentation.activity.ImageViewerActivity$Arguments */
    private static final class Arguments implements Parcelable {
        public static final Parcelable.Creator<Arguments> CREATOR = new C13004a();

        /* renamed from: d */
        private final String f38359d;

        /* renamed from: e */
        private final String f38360e;

        /* renamed from: f */
        private final String f38361f;

        /* renamed from: ge.bog.chat.presentation.activity.ImageViewerActivity$Arguments$a */
        public static final class C13004a implements Parcelable.Creator {
            /* renamed from: a */
            public final Arguments createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Arguments(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final Arguments[] newArray(int i) {
                return new Arguments[i];
            }
        }

        public Arguments(String str, String str2, String str3) {
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            this.f38359d = str;
            this.f38360e = str2;
            this.f38361f = str3;
        }

        /* renamed from: a */
        public final String mo34220a() {
            return this.f38359d;
        }

        /* renamed from: b */
        public final String mo34221b() {
            return this.f38360e;
        }

        /* renamed from: d */
        public final String mo34222d() {
            return this.f38361f;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Arguments)) {
                return false;
            }
            Arguments arguments = (Arguments) obj;
            return C41536l.m120484d(this.f38359d, arguments.f38359d) && C41536l.m120484d(this.f38360e, arguments.f38360e) && C41536l.m120484d(this.f38361f, arguments.f38361f);
        }

        public int hashCode() {
            int hashCode = this.f38359d.hashCode() * 31;
            String str = this.f38360e;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f38361f;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            String str = this.f38359d;
            String str2 = this.f38360e;
            String str3 = this.f38361f;
            return "Arguments(url=" + str + ", name=" + str2 + ", mimeType=" + str3 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f38359d);
            parcel.writeString(this.f38360e);
            parcel.writeString(this.f38361f);
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.ImageViewerActivity$a */
    public static final class C13005a {
        private C13005a() {
        }

        public /* synthetic */ C13005a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo34232a(Context context, String str, String str2, String str3) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            Intent putExtra = new Intent(context, ImageViewerActivity.class).putExtra("args", new Arguments(str, str2, str3));
            C41536l.m120488h(putExtra, "Intent(context, ImageVie…nts(url, name, mimeType))");
            context.startActivity(putExtra);
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.ImageViewerActivity$b */
    static final class C13006b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ImageViewerActivity f38362d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13006b(ImageViewerActivity imageViewerActivity) {
            super(0);
            this.f38362d = imageViewerActivity;
        }

        /* renamed from: b */
        public final Arguments invoke() {
            Parcelable parcelableExtra = this.f38362d.getIntent().getParcelableExtra("args");
            C41536l.m120486f(parcelableExtra);
            return (Arguments) parcelableExtra;
        }
    }

    /* renamed from: T0 */
    private final void m49130T0() {
        View view = this.f38356r;
        View view2 = null;
        if (view == null) {
            C41536l.m120506z("closeButton");
            view = null;
        }
        view.setOnClickListener(new C13012c0(this));
        Arguments a1 = m49136a1();
        String a = a1.mo34220a();
        String b = a1.mo34221b();
        String d = a1.mo34222d();
        View view3 = this.f38357s;
        if (view3 == null) {
            C41536l.m120506z("downloadButton");
        } else {
            view2 = view3;
        }
        view2.setOnClickListener(new C13014d0(this, a, b, d));
    }

    /* access modifiers changed from: private */
    /* renamed from: U0 */
    public static final void m49131U0(ImageViewerActivity imageViewerActivity, View view) {
        C41536l.m120489i(imageViewerActivity, "this$0");
        imageViewerActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public static final void m49132V0(ImageViewerActivity imageViewerActivity, String str, String str2, String str3, View view) {
        C41536l.m120489i(imageViewerActivity, "this$0");
        C41536l.m120489i(str, "$url");
        imageViewerActivity.mo34219b1().mo42596a(str, imageViewerActivity, str2, str3);
    }

    /* renamed from: W0 */
    private final void m49133W0() {
        C2394j U0 = C2379b.m9213w(this).mo7740e().mo7726U0(m49136a1().mo34220a());
        PhotoView photoView = this.f38354p;
        if (photoView == null) {
            C41536l.m120506z("photoView");
            photoView = null;
        }
        U0.mo7718L0(photoView);
    }

    /* renamed from: X0 */
    private final void m49134X0() {
        View view;
        getWindow().getDecorView().setSystemUiVisibility(5890);
        int c = C0767a.m2893c(this, C18585n.f52133a);
        View findViewById = findViewById(16908290);
        View view2 = null;
        if (!(findViewById instanceof ViewGroup)) {
            findViewById = null;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById;
        if (viewGroup != null) {
            view = viewGroup.getChildAt(0);
        } else {
            view = null;
        }
        if (view != null) {
            view.setBackgroundColor(c);
        }
        getWindow().setFlags(67108864, 67108864);
        View view3 = this.f38355q;
        if (view3 == null) {
            C41536l.m120506z("actionsToolbar");
        } else {
            view2 = view3;
        }
        ViewCompat.m3550F0(view2, new C13010b0());
    }

    /* access modifiers changed from: private */
    /* renamed from: Y0 */
    public static final WindowInsetsCompat m49135Y0(View view, WindowInsetsCompat windowInsetsCompat) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = windowInsetsCompat.mo3496l() + C18368l.m62762k(13);
            view.requestLayout();
        }
        return windowInsetsCompat;
    }

    /* renamed from: a1 */
    private final Arguments m49136a1() {
        return (Arguments) this.f38358t.getValue();
    }

    /* renamed from: b1 */
    public final C15497a mo34219b1() {
        C15497a aVar = this.f38353o;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("downloadManager");
        return null;
    }

    public void onBackPressed() {
        PhotoView photoView = this.f38354p;
        PhotoView photoView2 = null;
        if (photoView == null) {
            C41536l.m120506z("photoView");
            photoView = null;
        }
        float scale = photoView.getScale();
        PhotoView photoView3 = this.f38354p;
        if (photoView3 == null) {
            C41536l.m120506z("photoView");
            photoView3 = null;
        }
        if (scale > photoView3.getMinimumScale()) {
            PhotoView photoView4 = this.f38354p;
            if (photoView4 == null) {
                C41536l.m120506z("photoView");
                photoView4 = null;
            }
            PhotoView photoView5 = this.f38354p;
            if (photoView5 == null) {
                C41536l.m120506z("photoView");
            } else {
                photoView2 = photoView5;
            }
            photoView4.mo10188d(photoView2.getMinimumScale(), true);
            return;
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C18570b b = C18574d.f52090a.mo46429b();
        if (b != null) {
            b.mo46403a(this);
        }
        super.onCreate(bundle);
        setContentView(C18589r.chat_image_viewer_layout);
        View findViewById = findViewById(C18588q.actionsToolbar);
        C41536l.m120488h(findViewById, "findViewById(R.id.actionsToolbar)");
        this.f38355q = findViewById;
        View findViewById2 = findViewById(C18588q.f52164m);
        C41536l.m120488h(findViewById2, "findViewById(R.id.close_btn)");
        this.f38356r = findViewById2;
        View findViewById3 = findViewById(C18588q.downloadBtn);
        C41536l.m120488h(findViewById3, "findViewById(R.id.downloadBtn)");
        this.f38357s = findViewById3;
        View findViewById4 = findViewById(C18588q.photoView);
        C41536l.m120488h(findViewById4, "findViewById(R.id.photoView)");
        this.f38354p = (PhotoView) findViewById4;
        m49130T0();
        m49133W0();
        m49134X0();
    }
}
