package r40;

import he1.C41233s;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import p366bk.C10320i;
import p366bk.C10328q;

/* renamed from: r40.d */
public final class C27918d {

    /* renamed from: a */
    public static final C27918d f71113a = new C27918d();

    /* renamed from: b */
    private static final Map f71114b;

    static {
        C27917c cVar = C27917c.ANALYSIS;
        int i = C10328q.finance_faq_title_analysis;
        int i2 = C10328q.faq_desc_analysis;
        int i3 = C10328q.faq_section_title_statement_transaction;
        List m = C41341q.m119910m(Integer.valueOf(C10328q.faq_section_title_analysis_use_filter), Integer.valueOf(C10328q.faq_section_title_analysis_subcategory), Integer.valueOf(C10328q.faq_section_title_analysis_subcategory_transaction), Integer.valueOf(i3), Integer.valueOf(C10328q.faq_section_title_analysis_edit));
        int i4 = C10320i.faq_pfm_analysis_transaction;
        int i5 = C10320i.faq_pfm_analysis_edit;
        f71114b = C41344r0.m119931m(C41233s.m119492a(cVar, new C27915a(i, i2, m, C41341q.m119910m(Integer.valueOf(C10320i.faq_pfm_analysis_use_filter), Integer.valueOf(C10320i.faq_pfm_analysis_subcategory), Integer.valueOf(C10320i.faq_pfm_analysis_subcategory_transaction), Integer.valueOf(i4), Integer.valueOf(i5)))), C41233s.m119492a(C27917c.CASH_FLOW, new C27915a(C10328q.finance_faq_title_cashflow, C10328q.faq_desc_cashflow, C41339p.m119900e(Integer.valueOf(C10328q.faq_section_title_cashflow_revenues)), C41339p.m119900e(Integer.valueOf(C10320i.faq_pfm_cashflow_revenues)))), C41233s.m119492a(C27917c.OPERATIONS, new C27915a(C10328q.finance_faq_title_statement, C10328q.faq_desc_statement, C41341q.m119910m(Integer.valueOf(i3), Integer.valueOf(C10328q.faq_section_title_statement_receipt), Integer.valueOf(C10328q.faq_section_title_statement_repeat), Integer.valueOf(C10328q.faq_section_title_statement_template), Integer.valueOf(C10328q.faq_section_title_statement_edit)), C41341q.m119910m(Integer.valueOf(i4), Integer.valueOf(C10320i.faq_pfm_statement_receipt), Integer.valueOf(C10320i.faq_pfm_statement_repeat), Integer.valueOf(C10320i.faq_pfm_statement_template), Integer.valueOf(i5)))), C41233s.m119492a(C27917c.CALENDAR, new C27915a(C10328q.finance_faq_title_calendar, C10328q.faq_desc_calendar, C41341q.m119910m(Integer.valueOf(C10328q.faq_section_title_calendar_filter), Integer.valueOf(i3)), C41341q.m119910m(Integer.valueOf(C10320i.faq_pfm_calendar_filter), Integer.valueOf(i4)))));
    }

    private C27918d() {
    }

    /* renamed from: a */
    public final C27915a mo67497a(C27917c cVar) {
        C41536l.m120489i(cVar, "type");
        return (C27915a) C41344r0.m119929k(f71114b, cVar);
    }
}
