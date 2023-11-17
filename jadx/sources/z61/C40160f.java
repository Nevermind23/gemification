package z61;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import g91.C32356y;
import g91.C32358z;
import g91.C32359z0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ju0.C36790b;
import p341ge.bog.mobilebank.model.AttachmentExtension;
import p341ge.bog.mobilebank.model.AttachmentType;
import p341ge.bog.mobilebank.model.AttachmentTypeConst;
import p341ge.bog.mobilebank.model.FileAttachmentInfo;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p341ge.bog.mobilebank.transfers.foreign.FileAttachment;
import p366bk.C10328q;

/* renamed from: z61.f */
public class C40160f extends C36790b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C40159e f95417b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Integer f95418c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public FileAttachmentInfo f95419d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Set f95420e = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public MimeTypeMap f95421f = MimeTypeMap.getSingleton();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List f95422g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f95423h;

    /* renamed from: z61.f$a */
    class C40161a extends RestCallback {
        C40161a() {
        }

        public void onFailure(Throwable th) {
            C40160f.this.f95417b.mo94114j0(C10328q.f28955d2);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            if (bankApiResponse.isSuccess()) {
                C40160f.this.f95418c = (Integer) bankApiResponse.getResult();
            } else {
                C40160f.this.f95417b.mo94114j0(C10328q.f28955d2);
            }
        }
    }

    /* renamed from: z61.f$b */
    class C40162b extends RestCallback {
        C40162b() {
        }

        public void onFailure(Throwable th) {
            C40160f.this.f95417b.mo94112c();
            C40160f.this.f95417b.mo94114j0(C10328q.f28955d2);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            C40160f.this.f95417b.mo94112c();
            if (bankApiResponse.isSuccess()) {
                C40160f.this.f95419d = (FileAttachmentInfo) bankApiResponse.getResult();
                C40160f.this.f95417b.mo94115l0(C32359z0.m95590r((long) C40160f.this.f95419d.getAttachmentType().getMaxSize()));
                C40160f.this.f95420e.clear();
                StringBuilder sb = new StringBuilder();
                for (AttachmentExtension fileExtension : C40160f.this.f95419d.getAttachmentExtensions()) {
                    String lowerCase = fileExtension.getFileExtension().toLowerCase();
                    sb.append(lowerCase);
                    sb.append(" ");
                    C40160f.this.f95420e.add(C40160f.this.f95421f.getMimeTypeFromExtension(lowerCase));
                }
                C40160f.this.f95423h = sb.toString();
                return;
            }
            C40160f.this.f95417b.mo94114j0(C10328q.f28955d2);
        }
    }

    /* renamed from: z61.f$c */
    class C40163c extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ String f95426a;

        C40163c(String str) {
            this.f95426a = str;
        }

        public void onFailure(Throwable th) {
            C40160f.this.f95417b.mo94112c();
            C40160f.this.f95417b.mo94114j0(C10328q.cant_upload_file);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            C40160f.this.f95417b.mo94112c();
            if (bankApiResponse.isSuccess()) {
                FileAttachment fileAttachment = new FileAttachment(this.f95426a, (Integer) bankApiResponse.getResult());
                C40160f.this.f95422g.add(fileAttachment);
                C40160f.this.f95417b.mo94111K(fileAttachment);
                return;
            }
            C40160f.this.f95417b.mo94114j0(C10328q.cant_upload_file);
        }
    }

    C40160f(C40159e eVar, List list) {
        ArrayList arrayList = new ArrayList();
        this.f95422g = arrayList;
        this.f95423h = "";
        this.f95417b = eVar;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    /* renamed from: i */
    private boolean m116347i() {
        if (this.f95422g.size() < this.f95418c.intValue()) {
            return true;
        }
        this.f95417b.mo94119z0(this.f95418c.intValue());
        return false;
    }

    /* renamed from: j */
    private boolean m116348j(long j) {
        FileAttachmentInfo fileAttachmentInfo = this.f95419d;
        if (fileAttachmentInfo != null) {
            AttachmentType attachmentType = fileAttachmentInfo.getAttachmentType();
            if (j >= ((long) attachmentType.getMinSize()) && j <= ((long) attachmentType.getMaxSize())) {
                return true;
            }
            this.f95417b.mo94116o(attachmentType.getMinSize(), attachmentType.getMaxSize());
        }
        return false;
    }

    /* renamed from: k */
    public void mo94120k(int i) {
        this.f95422g.remove(i);
        this.f95417b.mo94118y(i);
    }

    /* renamed from: l */
    public List mo94121l() {
        return this.f95422g;
    }

    /* renamed from: m */
    public void mo94122m() {
        this.f88761a.getMaxInvoiceCount(new C40161a());
        this.f95417b.mo94113e();
        this.f88761a.getFileAttachmentInfo(AttachmentTypeConst.TRANSFER_INVOICE, new C40162b());
    }

    /* renamed from: n */
    public String[] mo94123n() {
        return (String[]) this.f95420e.toArray(new String[this.f95420e.size()]);
    }

    /* renamed from: o */
    public void mo94124o(Context context, Uri uri) {
        long j;
        if (m116347i()) {
            String type = context.getContentResolver().getType(uri);
            if (this.f95420e.contains(type)) {
                C32358z zVar = C32358z.f79794a;
                C32356y a = zVar.mo72860a(context, uri);
                if (a.mo72855a() == null && a.mo72856b() == null) {
                    this.f95417b.mo94114j0(C10328q.cant_upload_file);
                    return;
                }
                byte[] b = zVar.mo72861b(context, uri);
                String a2 = a.mo72855a();
                if (a.mo72856b() != null) {
                    j = a.mo72856b().longValue();
                } else {
                    j = (long) b.length;
                }
                if (m116348j(j)) {
                    String upperCase = this.f95421f.getExtensionFromMimeType(type).toUpperCase();
                    String y = C32359z0.m95597y(b);
                    this.f95417b.mo94113e();
                    this.f88761a.attachFile(y, a2, upperCase, AttachmentTypeConst.TRANSFER_INVOICE, new C40163c(a2));
                    return;
                }
                return;
            }
            this.f95417b.mo94117x(this.f95423h);
        }
    }
}
