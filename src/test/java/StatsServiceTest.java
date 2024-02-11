import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.JavaHW6.services.StatsService;

public class StatsServiceTest {
    @Test
    void shouldFindSumNum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.allSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void shouldFindMiddleSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMidSum = 15;
        int actualMidSum = service.midSum(sales);

        Assertions.assertEquals(expectedMidSum, actualMidSum);
    }

    @Test
    void shouldFindMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    void shouldFindMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    void shouldFindMinMid() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMid = 5;
        int actualMinMid = service.minMid(sales);

        Assertions.assertEquals(expectedMinMid, actualMinMid);
    }

    @Test
    void shouldFindMaxMid() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMid = 5;
        int actualMaxMid = service.maxMid(sales);

        Assertions.assertEquals(expectedMaxMid, actualMaxMid);
    }
}