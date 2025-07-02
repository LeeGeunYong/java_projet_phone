package exam_database;

import java.sql.*;

public class DBMetadataViewer {

    // ✅ 1. 테이블 목록 조회 - Connection 인자로 받음
    public static void listTables(Connection conn) {
        try {
            DatabaseMetaData meta = conn.getMetaData();
            ResultSet tables = meta.getTables(null, conn.getSchema(), "%", new String[]{"TABLE"});

            System.out.println("📄 테이블 목록:");
            System.out.println("------------------------");

            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                System.out.println("▶ " + tableName);
            }

        } catch (Exception e) {
            System.err.println("테이블 목록 조회 중 오류: " + e.getMessage());
        }
    }

    // ✅ 2. 특정 테이블 컬럼 DESC 조회 - Connection + 테이블명 인자
    public static void describeTable(Connection conn, String tableName) {
        try {
            DatabaseMetaData meta = conn.getMetaData();

            System.out.println("📌 TABLE: " + tableName.toUpperCase());
            System.out.println("--------------------------------------------------");
            System.out.printf("%-20s %-15s %-10s\n", "컬럼명", "데이터 타입", "NULL 허용");

            ResultSet columns = meta.getColumns(null, conn.getSchema(), tableName.toUpperCase(), null);
            while (columns.next()) {
                String columnName = columns.getString("COLUMN_NAME");
                String dataType = columns.getString("TYPE_NAME");
                String isNullable = columns.getString("IS_NULLABLE");
                System.out.printf("%-20s %-15s %-10s\n", columnName, dataType, isNullable);
            }

        } catch (Exception e) {
            System.err.println("[" + tableName + "] 테이블 조회 중 오류: " + e.getMessage());
        }
    }
}
