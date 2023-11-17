package p341ge.bog.sso_client.common.util.crop;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import ba1.C10216u;
import ba1.C10217v;
import com.theartofdev.edmodo.cropper.CropImageView;
import gb1.C32368d;
import ha1.C15454a;
import he1.C41217g;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oa1.C26917a;
import ua1.C28630c;
import ue1.C43064a;

/* renamed from: ge.bog.sso_client.common.util.crop.CropImageActivity */
public final class CropImageActivity extends C15454a {

    /* renamed from: v */
    public static final C24697b f63578v = new C24697b((DefaultConstructorMarker) null);

    /* renamed from: s */
    private final C41217g f63579s = C41219i.m119470b(new C24698c(this));

    /* renamed from: t */
    private Uri f63580t;

    /* renamed from: u */
    private Bitmap f63581u;

    /* renamed from: ge.bog.sso_client.common.util.crop.CropImageActivity$AspectRatio */
    private static final class AspectRatio implements Parcelable {
        public static final Parcelable.Creator<AspectRatio> CREATOR = new C24695a();

        /* renamed from: d */
        private final int f63582d;

        /* renamed from: e */
        private final int f63583e;

        /* renamed from: ge.bog.sso_client.common.util.crop.CropImageActivity$AspectRatio$a */
        public static final class C24695a implements Parcelable.Creator {
            /* renamed from: a */
            public final AspectRatio createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new AspectRatio(parcel.readInt(), parcel.readInt());
            }

            /* renamed from: b */
            public final AspectRatio[] newArray(int i) {
                return new AspectRatio[i];
            }
        }

        public AspectRatio(int i, int i2) {
            this.f63582d = i;
            this.f63583e = i2;
        }

        /* renamed from: a */
        public final int mo63090a() {
            return this.f63582d;
        }

        /* renamed from: b */
        public final int mo63091b() {
            return this.f63583e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AspectRatio)) {
                return false;
            }
            AspectRatio aspectRatio = (AspectRatio) obj;
            return this.f63582d == aspectRatio.f63582d && this.f63583e == aspectRatio.f63583e;
        }

        public int hashCode() {
            return (this.f63582d * 31) + this.f63583e;
        }

        public String toString() {
            return "AspectRatio(x=" + this.f63582d + ", y=" + this.f63583e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f63582d);
            parcel.writeInt(this.f63583e);
        }
    }

    /* renamed from: ge.bog.sso_client.common.util.crop.CropImageActivity$a */
    public static final class C24696a {

        /* renamed from: a */
        private Uri f63584a;

        /* renamed from: b */
        private Bitmap f63585b;

        /* renamed from: c */
        private Integer f63586c;

        /* renamed from: d */
        private Integer f63587d;

        /* renamed from: e */
        private boolean f63588e;

        /* renamed from: a */
        private final Intent m79236a(Intent intent) {
            Uri uri = this.f63584a;
            if (uri != null) {
                intent.putExtra("EXTRA_REQUEST_URI", uri);
            }
            Bitmap bitmap = this.f63585b;
            if (bitmap != null) {
                intent.putExtra("EXTRA_REQUEST_BMP", bitmap);
            }
            if (!(this.f63586c == null || this.f63587d == null)) {
                Integer num = this.f63586c;
                C41536l.m120486f(num);
                int intValue = num.intValue();
                Integer num2 = this.f63587d;
                C41536l.m120486f(num2);
                intent.putExtra("EXTRA_ASPECT_RATIO", new AspectRatio(intValue, num2.intValue()));
            }
            intent.putExtra("EXTRA_IS_OVAL", this.f63588e);
            return intent;
        }

        /* renamed from: b */
        public final C24696a mo63101b(int i, int i2) {
            this.f63586c = Integer.valueOf(i);
            this.f63587d = Integer.valueOf(i2);
            return this;
        }

        /* renamed from: c */
        public final C24696a mo63102c(Uri uri) {
            C41536l.m120489i(uri, "uri");
            this.f63584a = uri;
            return this;
        }

        /* renamed from: d */
        public final C24696a mo63103d(boolean z) {
            this.f63588e = z;
            return this;
        }

        /* renamed from: e */
        public final void mo63104e(Context context, Fragment fragment) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(fragment, "fragment");
            if (this.f63584a != null || this.f63585b != null) {
                fragment.startActivityForResult(m79236a(new Intent(context, CropImageActivity.class)), 1001);
            }
        }
    }

    /* renamed from: ge.bog.sso_client.common.util.crop.CropImageActivity$b */
    public static final class C24697b {
        private C24697b() {
        }

        public /* synthetic */ C24697b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.sso_client.common.util.crop.CropImageActivity$c */
    static final class C24698c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CropImageActivity f63589d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24698c(CropImageActivity cropImageActivity) {
            super(0);
            this.f63589d = cropImageActivity;
        }

        /* renamed from: b */
        public final C28630c invoke() {
            C28630c a = C28630c.m87617a(this.f63589d.findViewById(C10216u.f28338s2));
            C41536l.m120488h(a, "bind(findViewById(R.id.root))");
            return a;
        }
    }

    public CropImageActivity() {
        super(C10217v.activity_crop_image);
    }

    /* renamed from: V0 */
    private final C28630c m79221V0() {
        return (C28630c) this.f63579s.getValue();
    }

    /* renamed from: W0 */
    private final void m79222W0() {
        m79221V0().f72685g.setVisibility(8);
    }

    /* renamed from: X0 */
    private final boolean m79223X0() {
        if (this.f63580t != null) {
            this.f63580t = Uri.fromFile(C26917a.m83683a(this));
            m79221V0().f72683e.mo31794q(this.f63580t, Bitmap.CompressFormat.JPEG, 89, 999, 999);
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("EXTRA_REQUEST_BMP", m79221V0().f72683e.mo31783h(999, 999));
        C41238w wVar = C41238w.f97225a;
        setResult(-1, intent);
        return true;
    }

    /* renamed from: Y0 */
    private final void m79224Y0(Bitmap bitmap) {
        m79221V0().f72683e.setImageBitmap(bitmap);
    }

    /* renamed from: a1 */
    private final void m79225a1() {
        m79221V0().f72687i.setOnClickListener(new C24699a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b1 */
    public static final void m79226b1(CropImageActivity cropImageActivity, View view) {
        C41536l.m120489i(cropImageActivity, "this$0");
        if (cropImageActivity.m79223X0()) {
            cropImageActivity.finish();
        } else {
            cropImageActivity.m79231g1();
        }
    }

    /* renamed from: c1 */
    private final boolean m79227c1() {
        Uri uri = this.f63580t;
        Bitmap bitmap = this.f63581u;
        if (uri != null) {
            m79228d1(uri);
            return true;
        } else if (bitmap == null) {
            return false;
        } else {
            m79224Y0(bitmap);
            return true;
        }
    }

    /* renamed from: d1 */
    private final void m79228d1(Uri uri) {
        m79221V0().f72683e.setImageUriAsync(uri);
    }

    /* renamed from: e1 */
    private final void m79229e1() {
        CropImageView.C11849c cVar;
        AspectRatio aspectRatio = (AspectRatio) getIntent().getParcelableExtra("EXTRA_ASPECT_RATIO");
        this.f63580t = (Uri) getIntent().getParcelableExtra("EXTRA_REQUEST_URI");
        this.f63581u = (Bitmap) getIntent().getParcelableExtra("EXTRA_REQUEST_BMP");
        boolean booleanExtra = getIntent().getBooleanExtra("EXTRA_IS_OVAL", false);
        if (!m79227c1()) {
            finish();
        }
        CropImageView cropImageView = m79221V0().f72683e;
        if (booleanExtra) {
            cVar = CropImageView.C11849c.OVAL;
        } else {
            cVar = CropImageView.C11849c.RECTANGLE;
        }
        cropImageView.setCropShape(cVar);
        if (aspectRatio != null) {
            cropImageView.mo31796s(aspectRatio.mo63090a(), aspectRatio.mo63091b());
        }
        m79221V0().f72683e.setOnCropImageCompleteListener(new C24700b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: f1 */
    public static final void m79230f1(CropImageActivity cropImageActivity, CropImageView cropImageView, CropImageView.C11848b bVar) {
        C41536l.m120489i(cropImageActivity, "this$0");
        cropImageActivity.m79222W0();
        cropImageActivity.setResult(-1, new Intent().setData(bVar.mo31828h()));
        cropImageActivity.finish();
    }

    /* renamed from: g1 */
    private final void m79231g1() {
        m79221V0().f72685g.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m79229e1();
        m79225a1();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C41536l.m120489i(strArr, "permissions");
        C41536l.m120489i(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 2011) {
            return;
        }
        if (C32368d.m95605a(strArr, iArr, "android.permission.READ_EXTERNAL_STORAGE")) {
            m79221V0().f72683e.setImageUriAsync(this.f63580t);
        } else {
            finish();
        }
    }
}
