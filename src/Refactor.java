import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Refactor {
    public static void main(String[] args) {
        List<Integer> invoices = new ArrayList<>();
        List<Invoice> oracleAndTrainingInvoices = invoices.stream()
                .filter(inv -> inv.getCustomer() == Cutomer.ORACLE)
                .filter(inv -> inv.getTitle().contains("Training"))
                .sorted()
                .collect(Collectors.toList());

        List<Invoice> ids = invoices.stream()
                .map(inv -> inv.getId())
                .collect(Collectors.toList());

        List<Invoice> firstFiveIds = ids.stream()
                .limit(5)
                .collect(Collectors.toList());
    }
}
