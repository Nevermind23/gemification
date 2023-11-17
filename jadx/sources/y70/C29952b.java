package y70;

import com.google.gson.Gson;
import ed1.C40734b;
import ed1.C40762x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import n80.C26378b;
import n80.C26380d;
import o80.C26767a;
import p341ge.bog.mobilebank.consumerloanapplication.data.documents.entity.AttachmentInfoApiModel;
import ue1.C43075l;
import v70.C29000a;
import z70.C30235a;
import z70.C30236b;

/* renamed from: y70.b */
public final class C29952b implements C26767a {

    /* renamed from: a */
    private final C29000a f75745a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C30235a f75746b;

    /* renamed from: c */
    private final C30236b f75747c;

    /* renamed from: d */
    private final Gson f75748d;

    /* renamed from: y70.b$a */
    static final class C29953a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29952b f75749d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29953a(C29952b bVar) {
            super(1);
            this.f75749d = bVar;
        }

        /* renamed from: a */
        public final C26378b invoke(AttachmentInfoApiModel attachmentInfoApiModel) {
            C41536l.m120489i(attachmentInfoApiModel, "it");
            return this.f75749d.f75746b.mo70570b(attachmentInfoApiModel);
        }
    }

    public C29952b(C29000a aVar, C30235a aVar2, C30236b bVar, Gson gson) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "attachmentInfoMapper");
        C41536l.m120489i(bVar, "filesMapper");
        C41536l.m120489i(gson, "gson");
        this.f75745a = aVar;
        this.f75746b = aVar2;
        this.f75747c = bVar;
        this.f75748d = gson;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C26378b m90835e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26378b) lVar.invoke(obj);
    }

    /* renamed from: b */
    public C40762x mo66052b(String str) {
        C41536l.m120489i(str, "attachmentType");
        C40762x A = this.f75745a.mo68845b(str).mo95062A(new C29951a(new C29953a(this)));
        C41536l.m120488h(A, "override fun getAttachme…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: c */
    public C40734b mo66053c(long j, List list) {
        C41536l.m120489i(list, "files");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f75747c.mo70571a((C26380d) it.next()));
        }
        return this.f75745a.mo68841I(Long.valueOf(j), this.f75748d.mo18181w(arrayList));
    }
}
