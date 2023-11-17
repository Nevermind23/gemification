package com.identomat.fragments.scan_document;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1629r;
import com.identomat.activities.NavigationActivity;
import com.salesforce.marketingcloud.C11398b;
import ef1.C40813h;
import ef1.C40814h0;
import ef1.C40822j0;
import ef1.C40845o1;
import ef1.C40867u0;
import ef1.C40883y1;
import he1.C41224m;
import he1.C41228o;
import he1.C41233s;
import he1.C41238w;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe1.C41851b;
import oe1.C41862l;
import p017b.C2106d;
import p228r0.C8034d;
import p345ad.C9786e;
import p345ad.C9800j;
import p345ad.C9801k;
import p359bd.C10226a;
import p359bd.C10238k;
import p359bd.C10240m;
import p373cd.C10394a;
import p388dd.C12074b;
import p485kc.C16341a;
import p485kc.C16344b;
import p485kc.C16347e;
import p541oc.C17166t;
import p555pc.C17336a;
import p664xc.C18700l;
import p678yc.C18877a;
import p692zc.C19002e;
import p692zc.C19005g;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

public final class UploadDocumentFragment extends Fragment {

    /* renamed from: r */
    public static final C10631a f30204r = new C10631a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C9786e f30205d;

    /* renamed from: e */
    private final C18877a f30206e;

    /* renamed from: f */
    private final String f30207f = "upload_page";
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C17166t f30208g;

    /* renamed from: h */
    private boolean f30209h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f30210i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f30211j;

    /* renamed from: k */
    private boolean f30212k;

    /* renamed from: l */
    private String f30213l = "";

    /* renamed from: m */
    private Bitmap f30214m;

    /* renamed from: n */
    private boolean f30215n;

    /* renamed from: o */
    private Fragment f30216o;

    /* renamed from: p */
    private C0173b f30217p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Map f30218q;

    /* renamed from: com.identomat.fragments.scan_document.UploadDocumentFragment$a */
    public static final class C10631a {
        private C10631a() {
        }

        public /* synthetic */ C10631a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.identomat.fragments.scan_document.UploadDocumentFragment$b */
    static final class C10632b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ UploadDocumentFragment f30219d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10632b(UploadDocumentFragment uploadDocumentFragment) {
            super(1);
            this.f30219d = uploadDocumentFragment;
        }

        /* renamed from: a */
        public final void mo27327a(boolean z) {
            if (z) {
                this.f30219d.m38748z1();
            } else {
                this.f30219d.m38729D1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo27327a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: com.identomat.fragments.scan_document.UploadDocumentFragment$c */
    static final class C10633c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ UploadDocumentFragment f30220d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10633c(UploadDocumentFragment uploadDocumentFragment) {
            super(0);
            this.f30220d = uploadDocumentFragment;
        }

        public final void invoke() {
            this.f30220d.m38726A1();
        }
    }

    /* renamed from: com.identomat.fragments.scan_document.UploadDocumentFragment$d */
    static final class C10634d extends C41862l implements C43079p {

        /* renamed from: h */
        int f30221h;

        /* renamed from: i */
        final /* synthetic */ Context f30222i;

        /* renamed from: j */
        final /* synthetic */ Bitmap f30223j;

        /* renamed from: k */
        final /* synthetic */ UploadDocumentFragment f30224k;

        /* renamed from: com.identomat.fragments.scan_document.UploadDocumentFragment$d$a */
        static final class C10635a extends C41862l implements C43079p {

            /* renamed from: h */
            int f30225h;

            /* renamed from: i */
            final /* synthetic */ C9800j f30226i;

            /* renamed from: j */
            final /* synthetic */ UploadDocumentFragment f30227j;

            /* renamed from: k */
            final /* synthetic */ Bitmap f30228k;

            /* renamed from: com.identomat.fragments.scan_document.UploadDocumentFragment$d$a$a */
            public /* synthetic */ class C10636a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f30229a;

                static {
                    int[] iArr = new int[C9801k.values().length];
                    iArr[C9801k.SUCCESS.ordinal()] = 1;
                    iArr[C9801k.FAIL.ordinal()] = 2;
                    iArr[C9801k.NO_CONNECTION.ordinal()] = 3;
                    iArr[C9801k.SESSION_ENDED.ordinal()] = 4;
                    f30229a = iArr;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10635a(C9800j jVar, UploadDocumentFragment uploadDocumentFragment, Bitmap bitmap, Continuation continuation) {
                super(2, continuation);
                this.f30226i = jVar;
                this.f30227j = uploadDocumentFragment;
                this.f30228k = bitmap;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                return new C10635a(this.f30226i, this.f30227j, this.f30228k, continuation);
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                Object unused = C41793d.m121157c();
                if (this.f30225h == 0) {
                    C41228o.m119483b(obj);
                    int i = C10636a.f30229a[this.f30226i.mo26295c().ordinal()];
                    if (i == 1) {
                        String str = "";
                        if (this.f30227j.getLifecycle().mo4907b().mo4914b(C1593j.C1598b.RESUMED)) {
                            UploadDocumentFragment uploadDocumentFragment = this.f30227j;
                            String d = uploadDocumentFragment.mo27326t1().mo46864d().mo47124d(this.f30227j.getContext(), "upload_success");
                            if (d != null) {
                                str = d;
                            }
                            uploadDocumentFragment.m38747y1(true, str, this.f30228k);
                        } else {
                            UploadDocumentFragment uploadDocumentFragment2 = this.f30227j;
                            C41224m[] mVarArr = new C41224m[3];
                            mVarArr[0] = C41233s.m119492a("result", C41851b.m121254a(true));
                            String d2 = this.f30227j.mo27326t1().mo46864d().mo47124d(this.f30227j.getContext(), "upload_success");
                            if (d2 != null) {
                                str = d2;
                            }
                            mVarArr[1] = C41233s.m119492a("message", str);
                            mVarArr[2] = C41233s.m119492a("bitmap", this.f30228k);
                            uploadDocumentFragment2.f30218q = C41344r0.m119931m(mVarArr);
                        }
                    } else if (i == 2) {
                        Log.i("identomat_", "uploadImage: Fail");
                        if (this.f30227j.getLifecycle().mo4907b().mo4914b(C1593j.C1598b.RESUMED)) {
                            this.f30227j.m38747y1(false, this.f30226i.mo26294b(), this.f30228k);
                        } else {
                            this.f30227j.f30218q = C41344r0.m119931m(C41233s.m119492a("result", C41851b.m121254a(false)), C41233s.m119492a("message", this.f30226i.mo26294b()), C41233s.m119492a("bitmap", this.f30228k));
                        }
                    } else if (i == 3) {
                        this.f30227j.m38727B1();
                        Toast.makeText(this.f30227j.requireContext(), this.f30227j.mo27326t1().mo46864d().mo47124d(this.f30227j.getContext(), "no_connection"), 1).show();
                    } else if (i == 4) {
                        C10394a.m37798b("identomat_", (String) null, 2, (Object) null);
                    }
                    return C41238w.f97225a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: n */
            public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                return ((C10635a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
            }
        }

        /* renamed from: com.identomat.fragments.scan_document.UploadDocumentFragment$d$b */
        static final class C10637b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ UploadDocumentFragment f30230d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10637b(UploadDocumentFragment uploadDocumentFragment) {
                super(1);
                this.f30230d = uploadDocumentFragment;
            }

            /* renamed from: a */
            public final void mo27330a(int i) {
                String str = null;
                if (i == 100) {
                    C17166t i1 = this.f30230d.f30208g;
                    if (i1 != null) {
                        i1.f48161i.setText(this.f30230d.mo27326t1().mo46864d().mo47124d(this.f30230d.getContext(), "verifying"));
                    } else {
                        C41536l.m120506z("binding");
                        throw null;
                    }
                } else {
                    C17166t i12 = this.f30230d.f30208g;
                    if (i12 != null) {
                        TextView textView = i12.f48161i;
                        StringBuilder sb = new StringBuilder();
                        String d = this.f30230d.mo27326t1().mo46864d().mo47124d(this.f30230d.getContext(), "uploading");
                        if (d != null) {
                            str = C40439w.m117103B(d, "...", "", false, 4, (Object) null);
                        }
                        sb.append(str);
                        sb.append(": ");
                        sb.append(i);
                        sb.append('%');
                        textView.setText(sb.toString());
                        return;
                    }
                    C41536l.m120506z("binding");
                    throw null;
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo27330a(((Number) obj).intValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10634d(Context context, Bitmap bitmap, UploadDocumentFragment uploadDocumentFragment, Continuation continuation) {
            super(2, continuation);
            this.f30222i = context;
            this.f30223j = bitmap;
            this.f30224k = uploadDocumentFragment;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10634d(this.f30222i, this.f30223j, this.f30224k, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object obj2;
            Object c = C41793d.m121157c();
            int i = this.f30221h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C12074b bVar = C12074b.f35484a;
                Context context = this.f30222i;
                C41536l.m120488h(context, "it");
                File b = bVar.mo32220b(context, this.f30223j, 100);
                if (b == null) {
                    return C41238w.f97225a;
                }
                Log.i("identomat_", "sendImage: file size: " + (b.length() / ((long) C11398b.f33141t)) + " size :  " + this.f30223j.getWidth() + ' ' + this.f30223j.getHeight());
                C9786e s1 = this.f30224k.mo27325s1();
                Context requireContext = this.f30224k.requireContext();
                int width = this.f30223j.getWidth();
                int height = this.f30223j.getHeight();
                int k1 = this.f30224k.f30210i;
                int j1 = this.f30224k.f30211j;
                C10637b bVar2 = new C10637b(this.f30224k);
                this.f30221h = 1;
                obj2 = s1.mo26260w(requireContext, b, width, height, k1, j1, bVar2, this);
                if (obj2 == c) {
                    return c;
                }
            } else if (i == 1) {
                C41228o.m119483b(obj);
                obj2 = obj;
            } else if (i == 2) {
                C41228o.m119483b(obj);
                return C41238w.f97225a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C40883y1 c2 = C40867u0.m118469c();
            C10635a aVar = new C10635a((C9800j) obj2, this.f30224k, this.f30223j, (Continuation) null);
            this.f30221h = 2;
            if (C40813h.m118303e(c2, aVar, this) == c) {
                return c;
            }
            return C41238w.f97225a;
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C10634d) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    public UploadDocumentFragment(C9786e eVar, C18877a aVar) {
        C41536l.m120489i(eVar, "api");
        C41536l.m120489i(aVar, "identomatConfig");
        this.f30205d = eVar;
        this.f30206e = aVar;
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C18700l(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->\n            if (result.resultCode == Activity.RESULT_OK) {\n                val data: Intent? = result.data\n                val imageUri = data?.data\n\n                try {\n                    if (imageUri != null) {\n                        val bitmap: Bitmap? =\n                            if (android.os.Build.VERSION.SDK_INT >= 29) {\n                                val source = ImageDecoder.createSource(\n                                    requireContext().contentResolver,\n                                    imageUri\n                                )\n                                ImageDecoder.decodeBitmap(source)\n                            } else {\n                                MediaStore.Images.Media.getBitmap(\n                                    context?.contentResolver,\n                                    imageUri\n                                )\n                            }\n                        //bitmap = ImageTools.resize(bitmap, 1000)\n                        binding.uploadPreview.setImageBitmap(bitmap)\n                        uploadImage(bitmap)\n                    }\n                } catch (e: Exception) {\n                    e.message?.let { Log.i(TAG, it) }\n                }\n            }\n        }");
        this.f30217p = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public final void m38726A1() {
        Log.i("identomat_", "openLibrary");
        this.f30217p.mo404a(new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI));
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final void m38727B1() {
        if (!this.f30215n) {
            C17166t tVar = this.f30208g;
            if (tVar != null) {
                tVar.f48162j.setVisibility(8);
                C17166t tVar2 = this.f30208g;
                if (tVar2 != null) {
                    boolean z = false;
                    tVar2.f48159g.setVisibility(0);
                    C10240m mVar = new C10240m(this.f30206e, new C10633c(this));
                    Bundle bundle = new Bundle();
                    bundle.putInt("document_side", this.f30211j);
                    bundle.putInt("selected_document", this.f30210i);
                    mVar.setArguments(bundle);
                    C1493e0 p = getParentFragmentManager().mo4428p();
                    C41536l.m120488h(p, "parentFragmentManager.beginTransaction()");
                    p.mo4641t(C16344b.identomat_slide_in_left, C16344b.identomat_slide_out_right);
                    C17166t tVar3 = this.f30208g;
                    if (tVar3 != null) {
                        FragmentContainerView fragmentContainerView = tVar3.f48159g;
                        C41536l.m120488h(fragmentContainerView, "binding.fragmentContainerView");
                        if (fragmentContainerView.getChildCount() == 0) {
                            z = true;
                        }
                        if (z) {
                            p.mo4631b(C16347e.f46183Q, mVar);
                        } else {
                            p.mo4639r(C16347e.f46183Q, mVar);
                        }
                        p.mo4515i();
                        this.f30216o = mVar;
                        return;
                    }
                    C41536l.m120506z("binding");
                    throw null;
                }
                C41536l.m120506z("binding");
                throw null;
            }
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m38728C1(UploadDocumentFragment uploadDocumentFragment, ActivityResult activityResult) {
        Uri uri;
        Bitmap bitmap;
        ContentResolver contentResolver;
        C41536l.m120489i(uploadDocumentFragment, "this$0");
        if (activityResult.mo371b() == -1) {
            Intent a = activityResult.mo370a();
            if (a == null) {
                uri = null;
            } else {
                uri = a.getData();
            }
            if (uri != null) {
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        ImageDecoder.Source a2 = ImageDecoder.createSource(uploadDocumentFragment.requireContext().getContentResolver(), uri);
                        C41536l.m120488h(a2, "createSource(\n                                    requireContext().contentResolver,\n                                    imageUri\n                                )");
                        bitmap = ImageDecoder.decodeBitmap(a2);
                    } else {
                        Context context = uploadDocumentFragment.getContext();
                        if (context == null) {
                            contentResolver = null;
                        } else {
                            contentResolver = context.getContentResolver();
                        }
                        bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
                    }
                    C17166t tVar = uploadDocumentFragment.f30208g;
                    if (tVar != null) {
                        tVar.f48164l.setImageBitmap(bitmap);
                        uploadDocumentFragment.m38732G1(bitmap);
                        return;
                    }
                    C41536l.m120506z("binding");
                    throw null;
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message != null) {
                        Log.i("identomat_", message);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public final void m38729D1() {
        this.f30215n = false;
        m38727B1();
    }

    /* renamed from: E1 */
    private final File m38730E1(Bitmap bitmap) {
        File file;
        Context context = getContext();
        if (context == null) {
            file = null;
        } else {
            file = context.getCacheDir();
        }
        File file2 = new File(file, "bitmap.png");
        file2.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file2;
    }

    /* renamed from: F1 */
    private final void m38731F1() {
        FragmentManager fragmentManager;
        C17166t tVar = this.f30208g;
        C1493e0 e0Var = null;
        if (tVar != null) {
            tVar.f48162j.setVisibility(0);
            if (this.f30216o != null) {
                C17166t tVar2 = this.f30208g;
                if (tVar2 != null) {
                    tVar2.f48159g.setVisibility(8);
                    C1505h activity = getActivity();
                    if (activity == null) {
                        fragmentManager = null;
                    } else {
                        fragmentManager = activity.getSupportFragmentManager();
                    }
                    if (fragmentManager != null) {
                        e0Var = fragmentManager.mo4428p();
                    }
                    if (e0Var != null) {
                        e0Var.mo4641t(C16344b.identomat_appear, C16344b.identomat_disappear);
                    }
                    if (e0Var != null) {
                        e0Var.mo4639r(C16347e.f46183Q, new C10226a());
                    }
                    if (e0Var != null) {
                        e0Var.mo4515i();
                        return;
                    }
                    return;
                }
                C41536l.m120506z("binding");
                throw null;
            }
            return;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: G1 */
    private final void m38732G1(Bitmap bitmap) {
        Context context;
        this.f30218q = null;
        if (bitmap != null && (context = getContext()) != null) {
            m38731F1();
            C40845o1 unused = C40821j.m118316b(C1629r.m5683a(this), C40867u0.m118468b(), (C40822j0) null, new C10634d(context, bitmap, this, (Continuation) null), 2, (Object) null);
        }
    }

    /* renamed from: r1 */
    private final void m38743r1() {
        if (this.f30211j == 1 || !C17336a.f48645a.mo44746e(this.f30210i)) {
            m38748z1();
            return;
        }
        this.f30211j = 1;
        m38727B1();
    }

    /* renamed from: u1 */
    private final void m38744u1() {
        C17166t tVar = this.f30208g;
        if (tVar != null) {
            tVar.mo3946b().setBackgroundColor(this.f30206e.mo46861a().mo47093b().mo33033a());
            C17166t tVar2 = this.f30208g;
            if (tVar2 != null) {
                tVar2.f48161i.setTextColor(this.f30206e.mo46861a().mo47099h().mo33033a());
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            C41536l.m120506z("binding");
            throw null;
        }
    }

    /* renamed from: v1 */
    private final void m38745v1() {
        C19002e.C19003a aVar = C19002e.f53052q;
        C1505h activity = getActivity();
        C17166t tVar = this.f30208g;
        if (tVar != null) {
            ImageView imageView = tVar.f48157e;
            C41536l.m120488h(imageView, "binding.backButton");
            C17166t tVar2 = this.f30208g;
            if (tVar2 != null) {
                TextView textView = tVar2.f48158f;
                C41536l.m120488h(textView, "binding.backButtonTitleView");
                aVar.mo47118b(activity, imageView, textView, true, this.f30206e);
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* renamed from: x1 */
    private final void m38746x1() {
        if (this.f30215n) {
            C17166t tVar = this.f30208g;
            if (tVar != null) {
                tVar.f48160h.setVisibility(8);
                C17166t tVar2 = this.f30208g;
                if (tVar2 != null) {
                    tVar2.f48161i.setText("");
                } else {
                    C41536l.m120506z("binding");
                    throw null;
                }
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        } else {
            C17166t tVar3 = this.f30208g;
            if (tVar3 != null) {
                tVar3.f48161i.setText(this.f30206e.mo46864d().mo47124d(getContext(), "uploading"));
                View view = (View) C16341a.f46171a.mo43318f().invoke();
                if (view != null) {
                    try {
                        C17166t tVar4 = this.f30208g;
                        if (tVar4 != null) {
                            tVar4.f48160h.removeAllViews();
                            ViewParent parent = view.getParent();
                            if (parent != null) {
                                ((ViewGroup) parent).removeView(view);
                                C17166t tVar5 = this.f30208g;
                                if (tVar5 != null) {
                                    tVar5.f48160h.addView(view);
                                    view.setVisibility(0);
                                    return;
                                }
                                C41536l.m120506z("binding");
                                throw null;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                        }
                        C41536l.m120506z("binding");
                        throw null;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    C17166t tVar6 = this.f30208g;
                    if (tVar6 != null) {
                        tVar6.f48163k.mo27360e(this.f30206e);
                    } else {
                        C41536l.m120506z("binding");
                        throw null;
                    }
                }
            } else {
                C41536l.m120506z("binding");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public final void m38747y1(boolean z, String str, Bitmap bitmap) {
        this.f30214m = bitmap;
        this.f30212k = z;
        this.f30213l = str;
        if (z) {
            m38743r1();
            return;
        }
        C17166t tVar = this.f30208g;
        if (tVar != null) {
            tVar.f48162j.setVisibility(8);
            C17166t tVar2 = this.f30208g;
            if (tVar2 != null) {
                tVar2.f48159g.setVisibility(0);
                C10238k kVar = new C10238k(this.f30206e, new C10632b(this));
                Bundle bundle = new Bundle();
                bundle.putBoolean("success", z);
                bundle.putString("message", str);
                bundle.putString("bitmap", m38730E1(bitmap).getAbsolutePath());
                kVar.setArguments(bundle);
                C1493e0 p = getParentFragmentManager().mo4428p();
                C41536l.m120488h(p, "parentFragmentManager.beginTransaction()");
                p.mo4641t(C16344b.identomat_slide_in_left, C16344b.identomat_slide_out_right);
                p.mo4631b(C16347e.f46183Q, kVar);
                p.mo4515i();
                this.f30215n = true;
                this.f30216o = kVar;
                return;
            }
            C41536l.m120506z("binding");
            throw null;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public final void m38748z1() {
        C19005g.C19006a aVar;
        if (!this.f30209h) {
            aVar = this.f30206e.mo46865e().mo47128d();
        } else {
            aVar = this.f30206e.mo46865e().mo47129e();
        }
        if (aVar.mo47132b() != -1) {
            C8034d.m30522a(this).mo22119N(aVar.mo47132b(), aVar.mo47131a(), NavigationActivity.f29874v.mo27261a());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f30211j = bundle.getInt("side", 0);
            this.f30215n = bundle.getBoolean("is_result_shown", false);
            this.f30212k = bundle.getBoolean("result", false);
            String string = bundle.getString("message", "");
            C41536l.m120488h(string, "savedInstanceState.getString(\"message\", \"\")");
            this.f30213l = string;
            this.f30214m = BitmapFactory.decodeFile(bundle.getString("bitmap"));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        int i;
        C41536l.m120489i(layoutInflater, "inflater");
        C17166t d = C17166t.m60319d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f30208g = d;
        Bundle arguments = getArguments();
        if (arguments == null) {
            z = false;
        } else {
            z = arguments.getBoolean("general");
        }
        this.f30209h = z;
        if (z) {
            i = this.f30206e.mo46866f().mo47134b();
        } else {
            i = this.f30206e.mo46866f().mo47133a();
        }
        this.f30210i = i;
        m38746x1();
        m38745v1();
        m38744u1();
        m38727B1();
        C17166t tVar = this.f30208g;
        if (tVar != null) {
            RelativeLayout c = tVar.mo3946b();
            C41536l.m120488h(c, "binding.root");
            return c;
        }
        C41536l.m120506z("binding");
        throw null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f30216o = null;
    }

    public void onResume() {
        super.onResume();
        this.f30205d.mo26255q(getContext(), this.f30207f);
        if (this.f30215n) {
            boolean z = this.f30212k;
            String str = this.f30213l;
            Bitmap bitmap = this.f30214m;
            C41536l.m120486f(bitmap);
            m38747y1(z, str, bitmap);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C41536l.m120489i(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putInt("side", this.f30211j);
        bundle.putBoolean("is_result_shown", this.f30215n);
        if (this.f30215n) {
            bundle.putBoolean("result", this.f30212k);
            bundle.putString("message", this.f30213l);
            Bitmap bitmap = this.f30214m;
            C41536l.m120486f(bitmap);
            bundle.putString("bitmap", m38730E1(bitmap).getAbsolutePath());
        }
    }

    /* renamed from: s1 */
    public final C9786e mo27325s1() {
        return this.f30205d;
    }

    /* renamed from: t1 */
    public final C18877a mo27326t1() {
        return this.f30206e;
    }
}
