package fz0;

import com.github.mikephil.charting.utils.Utils;
import ez0.C31898d;
import ez0.C31901f;
import g91.C32289b0;
import g91.C32307h;
import hd0.C24978b;
import i31.C36344a;
import i31.C36345b;
import i31.C36346c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;
import p341ge.bog.mobilebank.products.presentation.cardinsurance.model.CardInsuranceStatusUiModel;
import p341ge.bog.mobilebank.products.presentation.cardinsurance.model.OverallCardInsuranceStatusHeader;
import p341ge.bog.mobilebank.shared.helper.ImageSource;
import p863pw.C27635m;
import p863pw.C27636n;
import p863pw.C27637o;
import z31.C40143a;
import z31.C40144b;
import z31.C40145c;
import z31.C40146d;

/* renamed from: fz0.a */
public final class C32038a {
    /* renamed from: d */
    private final C40144b m94469d(DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel) {
        double d;
        if (debitCardInsuranceTypeUiModel instanceof DebitCardInsuranceTypeUiModel.InsuranceType) {
            DebitCardInsuranceTypeUiModel.InsuranceType insuranceType = (DebitCardInsuranceTypeUiModel.InsuranceType) debitCardInsuranceTypeUiModel;
            String g = insuranceType.mo49687g();
            String d2 = insuranceType.mo49682d();
            String e = insuranceType.mo49684e();
            String b = debitCardInsuranceTypeUiModel.mo49681b();
            String a = debitCardInsuranceTypeUiModel.mo49680a();
            DebitCardInsuranceTypeUiModel.InsuranceType insuranceType2 = (DebitCardInsuranceTypeUiModel.InsuranceType) debitCardInsuranceTypeUiModel;
            C36346c cVar = new C36346c(g, d2, e, b, a, insuranceType2.mo49690i(), insuranceType2.mo49688h());
            Double f = insuranceType2.mo49686f();
            if (f != null) {
                d = f.doubleValue();
            } else {
                d = Utils.DOUBLE_EPSILON;
            }
            return new C40143a(cVar, new C36344a(d, insuranceType2.mo49682d(), (Double) null), (C27636n) null, (String) null, 8, (DefaultConstructorMarker) null);
        } else if (C41536l.m120484d(debitCardInsuranceTypeUiModel, DebitCardInsuranceTypeUiModel.NoInsurance.f56170d)) {
            return C40146d.f95398a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public final CardInsuranceStatusUiModel mo72526a(C27635m mVar) {
        String str;
        C31901f fVar;
        ImageSource imageSource;
        String fileUrl;
        C41536l.m120489i(mVar, "card");
        long j = mVar.mo67126j();
        String y = mVar.mo67142y();
        if (y == null) {
            y = mVar.mo67105E();
        }
        String str2 = y;
        String w = mVar.mo67140w();
        String str3 = null;
        if (w != null) {
            str = C32307h.m95232i(w);
        } else {
            str = null;
        }
        if (str == null) {
            str = "****";
        } else {
            C41536l.m120488h(str, "lastFour?.let(CardUtils:…etMaskedCardNo) ?: \"****\"");
        }
        String str4 = str;
        C27636n v = mVar.mo67139v();
        if (v != null) {
            str3 = v.mo67155j();
        }
        if (str3 != null) {
            fVar = C31901f.INSURED;
        } else {
            fVar = C31901f.NOT_INSURED;
        }
        C31901f fVar2 = fVar;
        CardExternalFile f = mVar.mo67121f();
        if (f == null || (fileUrl = f.getFileUrl()) == null) {
            imageSource = new ImageSource.Resource(C32307h.m95224a(mVar.mo67105E()));
        } else {
            String c = C32289b0.m95091c(fileUrl);
            C41536l.m120488h(c, "generateImageUrl(it)");
            imageSource = new ImageSource.Url(c, (Integer) null, (Integer) null, 6, (DefaultConstructorMarker) null);
        }
        return new CardInsuranceStatusUiModel(j, str2, str4, fVar2, imageSource, mVar.mo67105E());
    }

    /* renamed from: b */
    public final List mo72527b(C36345b bVar, C27635m mVar) {
        Object obj;
        C27636n nVar;
        C41536l.m120489i(bVar, "info");
        List<C36346c> b = bVar.mo89065b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
        for (C36346c cVar : b) {
            Iterator it = bVar.mo89064a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((C36344a) obj).mo89059b(), cVar.mo89077g())) {
                    break;
                }
            }
            C36344a aVar = (C36344a) obj;
            if (mVar != null) {
                nVar = mVar.mo67139v();
            } else {
                nVar = null;
            }
            arrayList.add(new C40143a(cVar, aVar, nVar, (String) null, 8, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List mo72528c(C27637o oVar) {
        boolean z;
        int i;
        C31898d dVar;
        boolean z2;
        C24978b bVar;
        C41536l.m120489i(oVar, "cardsAndDetails");
        List w = C41343r.m119927w(oVar.mo67167a().values());
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : w) {
            if (hashSet.add(Long.valueOf(((C27635m) next).mo67126j()))) {
                arrayList.add(next);
            }
        }
        ArrayList<C27635m> arrayList2 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            C27636n v = ((C27635m) next2).mo67139v();
            if (v != null) {
                bVar = v.mo67154i();
            } else {
                bVar = null;
            }
            if (bVar != C24978b.YES) {
                z = false;
            }
            if (z) {
                arrayList2.add(next2);
            }
        }
        ArrayList<CardInsuranceStatusUiModel> arrayList3 = new ArrayList<>(C41343r.m119925u(arrayList2, 10));
        for (C27635m a : arrayList2) {
            arrayList3.add(mo72526a(a));
        }
        if (arrayList3.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (CardInsuranceStatusUiModel g : arrayList3) {
                if (g.mo82062g() == C31901f.INSURED) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (i = i + 1) < 0) {
                    C41341q.m119916s();
                }
            }
        }
        if (i == arrayList3.size()) {
            dVar = C31898d.ON;
        } else if (i == 0) {
            dVar = C31898d.OFF;
        } else {
            dVar = C31898d.SEMI_ON;
        }
        if (arrayList3.size() > 1) {
            z = false;
        }
        return C41358y.m120023m0(C41339p.m119900e(new OverallCardInsuranceStatusHeader(dVar, z)), arrayList3);
    }

    /* renamed from: e */
    public final List mo72529e(List list, DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel) {
        boolean z;
        C41536l.m120489i(list, "list");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel2 = (DebitCardInsuranceTypeUiModel) it.next();
            C40144b d = m94469d(debitCardInsuranceTypeUiModel2);
            if (debitCardInsuranceTypeUiModel == null || !C41536l.m120484d(debitCardInsuranceTypeUiModel2.mo49682d(), debitCardInsuranceTypeUiModel.mo49682d())) {
                z = false;
            } else {
                z = true;
            }
            arrayList.add(new C40145c(d, z));
        }
        return arrayList;
    }
}
