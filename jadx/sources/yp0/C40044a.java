package yp0;

/* renamed from: yp0.a */
public enum C40044a {
    LOAN_OPEN_SUGGESTION_PAGE("PAL_Loan_suggestion_page", "open_suggestion_page"),
    LOAN_SUGGESTION_SELECTED("PAL_Loan_suggestion_page", "select_suggestion"),
    LOAN_OPEN_DETAILS_PAGE("PAL_Loan_activation", "open_details_page_from_url"),
    LOAN_ACTIVATION_PAGE_ERROR("PAL_Loan_activation", "page_load_error"),
    LOAN_ACTIVATION_AMOUNT_CHANGED("PAL_Loan_activation", "change_loan_amount"),
    LOAN_ACTIVATION_ACCOUNT_SELECTED("PAL_Loan_activation", "choose_account"),
    LOAN_ACTIVATION_REPAYMENT_TOGGLED("PAL_Loan_activation", "change_repayment_products"),
    LOAN_RECOMMENDER_OPENED("PAL_Loan_recommender_page", "page_loaded"),
    LOAN_RECOMMENDER_CLOSED("PAL_Loan_recommender_page", "page_close"),
    LOAN_RECOMMENDER_MAX_AMOUNT_CLICKED("PAL_Loan_recommender_page", "max_amount_button_click"),
    LOAN_RECOMMENDER_CONTINUE_CLICKED("PAL_Loan_recommender_page", "continue_button_click"),
    LOAN_RECOMMENDER_INITIAL_OFFER_CLICKED("PAL_Loan_recommender_page", "innitial_button_click"),
    CLOSE_DRAWDOWN_ACTION_SHEET("PAL_Loan_activation", "close_drawdown_action_sheet"),
    DRAWDOWN_ACTION_SHEET_GOT_IT("PAL_Loan_activation", "drawdown_action_sheet_gotit"),
    SWITCH_INS_INC_TOGGLE_ON("PAL_Loan_activation_page", "switch_insInc_toggle_ON"),
    SWITCH_INS_INC_TOGGLE_OFF("PAL_Loan_activation_page", "switch_insInc_toggle_OFF"),
    CLICK_NEXT_BUTTON("PAL_Loan_activation_page", "click_next_button"),
    CLICK_NEXT_BUTTON_INCOMPLETE_FIELDS("PAL_Loan_activation_page", "click_next_button_incomplete_fields"),
    SELECT_TERM("PAL_Loan_activation_page", "select_term"),
    SELECT_PAYMENT_DAY("PAL_Loan_activation_page", "select_payment_day"),
    SELECT_PROVIDER("PAL_Loan_activation_page_insurance_action_sheet", "select_provider"),
    INSURANCE_ACTION_SHEET_CLICK_SAVE("PAL_Loan_activation_page_insurance_action_sheet", "click_save"),
    LOAN_SUMMARY_PAGE_LOADED("PAL_Loan_summary_page", "summary_page_load"),
    LOAN_SUMMARY_ACTIVATE_CLICK("PAL_Loan_summary_page", "click_activate"),
    LOAN_PRECONTRACT_AGREE_CLICK("PAL_Loan_precontract", "click_agree"),
    LOAN_RESULT_SUCCESS("PAL_Loan_result_screen", "result_screen_success"),
    LOAN_RESULT_ERROR("PAL_Loan_result_screen", "activation_error");
    

    /* renamed from: d */
    private final String f95173d;

    /* renamed from: e */
    private final String f95174e;

    private C40044a(String str, String str2) {
        this.f95173d = str;
        this.f95174e = str2;
    }

    /* renamed from: b */
    public final String mo93917b() {
        return this.f95174e;
    }

    /* renamed from: c */
    public final String mo93918c() {
        return this.f95173d;
    }
}
