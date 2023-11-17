package p341ge.bog.mobilebank.app;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.C1358e;
import androidx.databinding.C1359f;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ge.bog.mobilebank.app.DataBinderMapperImpl */
public class DataBinderMapperImpl extends C1358e {

    /* renamed from: a */
    private static final SparseIntArray f40618a = new SparseIntArray(0);

    /* renamed from: a */
    public List mo3957a() {
        ArrayList arrayList = new ArrayList(45);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.autoliabilityinsurance.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.bnpl.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.cardapplications.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.cardproducts.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.categorypackages.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.consumerloanapplication.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.ddsto.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.depositapplication.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.deposits.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.dictionary.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.endyearcampaign2022.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.galtandtaggart.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.gamification.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.giftcards.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.googlepay.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.hubmenu.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.insurance.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.junior.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.kyc.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.lifestyleoffers.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.linksharing.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.loanactivation.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.loanoffers.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.loans.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.loyaltyandbonusprograms.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.loyaltyprogress.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.nbo.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.openbanking.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.p2p.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.paymentconfiguration.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.payments.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.products.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.qrwithdrawal.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.releasenotes.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.settings.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.shared.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.shared2.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.statements.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.stories.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.templates.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.transportcard.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.travelinsurance.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.wishcampaign.DataBinderMapperImpl());
        return arrayList;
    }

    /* renamed from: b */
    public ViewDataBinding mo3888b(C1359f fVar, View view, int i) {
        if (f40618a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    /* renamed from: c */
    public ViewDataBinding mo3889c(C1359f fVar, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f40618a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
