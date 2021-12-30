package constants;

public interface JpaConst {


    String PERSISTENCE_UNIT_NAME="daily_report_system";

    int ROW_PER_PAGE=15;

    String TABLE_EMP="employees";

    String EMP_COL_ID= "id";
    String EMP_COL_CODE = "name";
    String EMP_COL_NAME= "name"
;    String EMP_COL_PASS ="password";
    String EMP_COL_ADMIN_FLAG= "admin_flag";
    String EMP_COL_CREATED_AT= "created_at";
    String EMP_COL_UPDATE_AT ="update_at";
    String EMP_COL_DALETE_FLAG= "delete_flag";

    int ROLE_ADMIN= 1;
    int ROLE_GENERAL = 0;
    int EMP_DEL_TRUE =1;
    int EMP_DEL_FALSE =0;

    String TABLE_REP= "reports";

    String REP_COL_ID="id";
    String REP_COL_EMP= "employee_id";
    String REP_COL_REP_DATA="report_data";
    String REP_COL_TITLE="title";
    String REP_COL_CONTENT= "content";
    String REP_COL_CREATED_AT="created_at";
    String REP_COL_UPDATED_AT="updatef_at";

    String ENTITY_EMP="employee";
    String ENTITY_REP="report";

    String JPQL_PARM_CODE="code";
    String JPQL_PARM_PASSWORD="password";
    String JPQL_PARM_EMPLOYEE="employee";

    String Q_EMP_GET_ALL=ENTITY_EMP +".getAll";
    String Q_EMP_ALL_DEF="SELECT e FROM Employee AS e ORDER BY e. id DESC";


    String Q_EMP_COUNT= ENTITY_EMP +".count";
    String Q_EMP_COUNT_DEF="SELECT COUNT(e) FROM Employee AS e";

    String Q_EMP_GET_BY_CODE_AND_PASS_DEF="SELECT e FROM Employee AS e WHERE e. deleterFlag ="
    + JPQL_PARM_CODE + "AND e.password =:" + JPQL_PARM_PASSWORD;

    String Q_EMP_COUNT_RESISTEREDBYCODE = ENTITY_EMP + ".countRegisteredByCode";
    String Q_EMP_COUNT_RESISTERED_BYCODE_DEF = "SELECT COUNT (e) FROM Employee AS e WHERE e. code = :" + JPQL_PARM_CODE;

    String Q_REP_GET_ALL= ENTITY_REP + "/getALL";
    String Q_REP_COUNT_GETALL_DEF ="SELECT r FROM Report AS r ORDER by r. id DESC";

    String Q_REP_COUNT= ENTITY_REP + ".count";
    String Q_REP_COUTNT_DEF= "SELECT COUNT(r) FROM Report AS r";

    String Q_REPGET_ALL_MINE= ENTITY_REP +"getAllMine";
    String Q_REP_GET_ALL_MINE_DEF ="SELECT r FROM Report AS r WHERE r. employee=:" + JPQL_PARM_EMPLOYEE + "ORDER BY r.id DESC";

    String Q_REP_COUNT_ALL_MINE = ENTITY_REP+ ".countAllMine"
;
    String Q_REP_COUNT_ALL_MINE_DEF ="SELECT COUNT(r) EROM Report AS r WHERE r.employee= :" + JPQL_PARM_EMPLOYEE;
}
