package h50;

import d50.C19907a;
import hd0.C24978b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.model.payment.DeviceType;
import p760fw.C20575a;
import p793iw.C25261a;
import p793iw.C25263b;

/* renamed from: h50.b */
public abstract class C24882b {
    /* renamed from: a */
    public static final String m79533a(C25263b bVar) {
        C41536l.m120489i(bVar, "<this>");
        StringBuilder sb = new StringBuilder("");
        if (bVar.mo63841x() != null) {
            sb.append(bVar.mo63841x().mo49112j());
        }
        if (bVar.mo63826j() != null) {
            sb.append(" > ");
            sb.append(bVar.mo63826j().mo49112j());
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "StringBuilder(\"\").apply …       }\n    }.toString()");
        return sb2;
    }

    /* renamed from: b */
    public static final boolean m79534b(C25263b bVar) {
        C41536l.m120489i(bVar, "<this>");
        return false;
    }

    /* renamed from: c */
    public static final String m79535c(C25263b bVar) {
        C41536l.m120489i(bVar, "<this>");
        return bVar.mo63834r();
    }

    /* renamed from: d */
    public static final AccountOperation m79536d(C25263b bVar) {
        C24978b bVar2;
        DeviceType deviceType;
        TransactionCategoryModel transactionCategoryModel;
        C41536l.m120489i(bVar, "<this>");
        AccountOperation accountOperation = new AccountOperation();
        accountOperation.setEntryId(bVar.mo63831o());
        accountOperation.setDocKey(bVar.mo63829m());
        accountOperation.setEssId(bVar.mo63832p());
        accountOperation.setNomination(bVar.mo63838u());
        accountOperation.setPostDate(bVar.mo63807K());
        accountOperation.setAmount(bVar.mo63817c());
        accountOperation.setCcy(bVar.mo63827k());
        accountOperation.setStatus(bVar.mo63810N());
        accountOperation.setBonusPoint(bVar.mo63821f());
        accountOperation.setMerchantName(bVar.mo63835s());
        accountOperation.setMerchantNameInt(bVar.mo63836t());
        accountOperation.setEntryGroupDKey(bVar.mo63830n());
        accountOperation.setEssServiceId(bVar.mo63833q());
        accountOperation.setBonusPointType(bVar.mo63822g());
        accountOperation.setRepeatAllowed(bVar.mo63813Q());
        accountOperation.setTemplateAllowed(bVar.mo63815S());
        accountOperation.setCanSplit(bVar.mo63823h());
        accountOperation.setDDSTOAlllowed(bVar.mo63811O());
        accountOperation.setOperationTitle(bVar.mo63840w());
        accountOperation.setImageUrl(bVar.mo63834r());
        accountOperation.setCashbackAmount(bVar.mo63825i());
        accountOperation.setGroupImageUrl(bVar.mo63834r());
        accountOperation.setPrintFormType(bVar.mo63808L());
        accountOperation.setIsPrintable(bVar.mo63812P());
        accountOperation.setOperationDate(bVar.mo63839v());
        if (bVar.mo63819e()) {
            bVar2 = C24978b.YES;
        } else {
            bVar2 = C24978b.NO;
        }
        accountOperation.setBackTransferAllowed(bVar2);
        accountOperation.setReversalAvailable(bVar.mo63814R());
        C25261a l = bVar.mo63828l();
        TransactionCategoryModel transactionCategoryModel2 = null;
        if (l != null) {
            deviceType = DeviceType.valueOf(l.name());
        } else {
            deviceType = null;
        }
        accountOperation.setDeviceType(deviceType);
        accountOperation.setBenefProfilePicture(bVar.mo63834r());
        accountOperation.setPfmId(bVar.mo63799C());
        accountOperation.setPfmForecast(bVar.mo63798B());
        accountOperation.setPfmCatId(bVar.mo63842y());
        accountOperation.setPfmCatName(bVar.mo63843z());
        accountOperation.setPfmParentCatId(bVar.mo63800D());
        accountOperation.setPfmParentCatName(bVar.mo63801E());
        accountOperation.setPfmRecurring(bVar.mo63803G());
        accountOperation.setPfmSplit(bVar.mo63804H());
        accountOperation.setPfmParentOpId(bVar.mo63802F());
        accountOperation.setPfmTagId(bVar.mo63805I());
        accountOperation.setPfmTagName(bVar.mo63806J());
        accountOperation.setPfmComputable(bVar.mo63797A());
        C20575a j = bVar.mo63826j();
        if (j != null) {
            transactionCategoryModel = C19907a.m65797a(j);
        } else {
            transactionCategoryModel = null;
        }
        accountOperation.setTransactionCategory(transactionCategoryModel);
        C20575a x = bVar.mo63841x();
        if (x != null) {
            transactionCategoryModel2 = C19907a.m65797a(x);
        }
        accountOperation.setParentCategory(transactionCategoryModel2);
        return accountOperation;
    }

    /* renamed from: e */
    public static final List m79537e(List list) {
        C41536l.m120489i(list, "<this>");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m79536d((C25263b) it.next()));
        }
        return arrayList;
    }
}
