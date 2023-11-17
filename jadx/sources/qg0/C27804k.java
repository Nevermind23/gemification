package qg0;

import he1.C41233s;
import java.util.Map;
import tg0.C28387g;

/* renamed from: qg0.k */
public abstract class C27804k {

    /* renamed from: a */
    private static final Map f70903a;

    static {
        C28387g gVar = C28387g.DEFAULT;
        C27805l lVar = C27805l.TranWhen;
        C27805l lVar2 = C27805l.TranAmount;
        C27805l lVar3 = C27805l.Comment;
        C27805l lVar4 = C27805l.FinTranID;
        C27805l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        C28387g gVar2 = C28387g.CSR;
        C27805l[] lVarArr2 = {lVar, lVar2, lVar3, lVar4};
        C28387g gVar3 = C28387g.CADJ;
        C27805l[] lVarArr3 = {lVar, lVar2, lVar3, lVar4};
        C28387g gVar4 = C28387g.INT;
        C27805l[] lVarArr4 = {lVar, lVar2, lVar3, lVar4};
        C28387g gVar5 = C28387g.CSD;
        C27805l[] lVarArr5 = {lVar, lVar2, lVar4};
        C28387g gVar6 = C28387g.FEE;
        C27805l lVar5 = C27805l.OrderNo;
        C27805l[] lVarArr6 = {lVar, lVar2, lVar3, lVar4, lVar5};
        C28387g gVar7 = C28387g.JNLC;
        C27805l[] lVarArr7 = {lVar, lVar2, C27805l.AccountBalance, lVar3, lVar4, C27805l.FeeSec, C27805l.FeeBase, C27805l.FeeXtraShares, C27805l.FeeExchange};
        C28387g gVar8 = C28387g.SPUR;
        C27805l lVar6 = C27805l.InstrumentName;
        C27805l lVar7 = C27805l.InstrumentSymbol;
        C27805l lVar8 = C27805l.FillQty;
        C27805l lVar9 = C27805l.FillPx;
        C27805l[] lVarArr8 = {lVar, lVar6, lVar7, lVar2, lVar8, lVar9, lVar3, lVar4, lVar5};
        C28387g gVar9 = C28387g.SSAL;
        C27805l[] lVarArr9 = {lVar, lVar6, lVar7, lVar2, lVar8, lVar9, lVar3, lVar4, lVar5};
        C28387g gVar10 = C28387g.MERGER_ACQUISITION;
        C27805l[] lVarArr10 = {lVar, C27805l.MergerAcquisitionAcquirerName, C27805l.MergerAcquisitionAcquirerSymbol, C27805l.MergerAcquisitionAcquireeName, C27805l.MergerAcquisitionAcquireeSymbol, lVar2, lVar3, lVar4};
        C28387g gVar11 = C28387g.DIV;
        C27805l lVar10 = C27805l.DividendType;
        C27805l lVar11 = C27805l.DividendAmountPerShare;
        C27805l lVar12 = C27805l.DividendTaxCode;
        C27805l lVar13 = C27805l.DividendTaxRate;
        C27805l lVar14 = C27805l.DividendTaxType;
        C27805l[] lVarArr11 = {lVar, lVar6, lVar7, lVar2, lVar10, lVar11, lVar12, lVar13, lVar14, lVar3, lVar4};
        C28387g gVar12 = C28387g.DIVTAX;
        C27805l[] lVarArr12 = {lVar, lVar6, lVar7, lVar2, lVar10, lVar11, lVar12, lVar13, lVar14, lVar3, lVar4};
        C28387g gVar13 = C28387g.DIVNRA;
        C27805l[] lVarArr13 = {lVar, lVar6, lVar7, lVar2, lVar10, lVar11, lVar12, lVar13, lVar14, lVar3, lVar4};
        C28387g gVar14 = C28387g.STCK;
        C27805l[] lVarArr14 = {lVar, lVar6, lVar7, lVar2, lVar3, lVar4};
        C28387g gVar15 = C28387g.COMM;
        C27805l[] lVarArr15 = {lVar, lVar2, lVar3, lVar4, lVar5};
        C28387g gVar16 = C28387g.SPINOFF;
        C27805l[] lVarArr16 = {lVar, lVar6, lVar7, lVar2, lVar3, lVar4};
        C28387g gVar17 = C28387g.STOCK_SPLIT;
        C27805l[] lVarArr17 = {lVar, lVar6, lVar7, lVar2, lVar3, lVar4};
        C28387g gVar18 = C28387g.ACATS_CASH;
        C27805l[] lVarArr18 = {lVar, lVar2, lVar3, lVar4};
        C28387g gVar19 = C28387g.ACATS_STOCK;
        C27805l[] lVarArr19 = {lVar, lVar2, lVar3, lVar4};
        C28387g gVar20 = C28387g.ORDER_1_B;
        C27805l lVar15 = C27805l.AmountCash;
        C27805l lVar16 = C27805l.OrderQty;
        C27805l lVar17 = C27805l.LeavesQty;
        f70903a = C41344r0.m119931m(C41233s.m119492a(gVar, C41341q.m119910m(lVarArr)), C41233s.m119492a(gVar2, C41341q.m119910m(lVarArr2)), C41233s.m119492a(gVar3, C41341q.m119910m(lVarArr3)), C41233s.m119492a(gVar4, C41341q.m119910m(lVarArr4)), C41233s.m119492a(gVar5, C41341q.m119910m(lVarArr5)), C41233s.m119492a(gVar6, C41341q.m119910m(lVarArr6)), C41233s.m119492a(gVar7, C41341q.m119910m(lVarArr7)), C41233s.m119492a(gVar8, C41341q.m119910m(lVarArr8)), C41233s.m119492a(gVar9, C41341q.m119910m(lVarArr9)), C41233s.m119492a(gVar10, C41341q.m119910m(lVarArr10)), C41233s.m119492a(gVar11, C41341q.m119910m(lVarArr11)), C41233s.m119492a(gVar12, C41341q.m119910m(lVarArr12)), C41233s.m119492a(gVar13, C41341q.m119910m(lVarArr13)), C41233s.m119492a(gVar14, C41341q.m119910m(lVarArr14)), C41233s.m119492a(gVar15, C41341q.m119910m(lVarArr15)), C41233s.m119492a(gVar16, C41341q.m119910m(lVarArr16)), C41233s.m119492a(gVar17, C41341q.m119910m(lVarArr17)), C41233s.m119492a(gVar18, C41341q.m119910m(lVarArr18)), C41233s.m119492a(gVar19, C41341q.m119910m(lVarArr19)), C41233s.m119492a(gVar20, C41341q.m119910m(lVar, lVar6, lVar7, lVar15, lVar16, lVar17, C27805l.CumQtyB, lVar5)), C41233s.m119492a(C28387g.ORDER_1_S, C41341q.m119910m(lVar, lVar6, lVar7, lVar15, lVar16, lVar17, C27805l.CumQtyS, lVar5)));
    }

    /* renamed from: a */
    public static final Map m85979a() {
        return f70903a;
    }
}
