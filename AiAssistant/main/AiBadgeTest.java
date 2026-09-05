package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AiBadgeTest {

    // 1. Constructor stores the badgeId correctly
    @Test
    void testConstructorSetsBadgeId() {
        Badge badge = new Badge("B001");
        assertEquals("B001", badge.getBadgeId());
    }
 
    // 2. Different instance with a different id - not hardcoded
    @Test
    void testGetBadgeIdDifferentInstance() {
        Badge badge = new Badge("B999");
        assertEquals("B999", badge.getBadgeId());
    }

    // 3. Empty string badgeId is stored as-is
    @Test
    void testConstructorWithEmptyString() {
        Badge badge = new Badge("");
        assertEquals("", badge.getBadgeId());
    }

    // 4. Null badgeId is stored as-is (no validation in constructor)
    @Test
    void testConstructorWithNull() {
        Badge badge = new Badge(null);
        assertNull(badge.getBadgeId());
    }

    // 5. Whitespace-only string is stored as-is
    @Test
    void testConstructorWithWhitespace() {
        Badge badge = new Badge("   ");
        assertEquals("   ", badge.getBadgeId());
    }

    // 6. Two Badge objects with the same id are distinct objects (no equals/hashCode override)
    @Test
    void testTwoBadgesWithSameIdAreNotSameReference() {
        Badge badge1 = new Badge("B001");
        Badge badge2 = new Badge("B001");
        assertNotSame(badge1, badge2);
        assertEquals(badge1.getBadgeId(), badge2.getBadgeId());
    }

    
    // 8. Long string badgeId is preserved
    @Test
    void testConstructorWithLongId() {
        String longId = "B".repeat(500);
        Badge badge = new Badge(longId);
        assertEquals(longId, badge.getBadgeId());
    }
}