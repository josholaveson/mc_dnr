package messages;

import org.bukkit.ChatColor;

/**
 * Created by josh on 5/29/15.
 */
@SuppressWarnings("ALL")
public class Message {

    private static final ChatColor red = ChatColor.RED;
    private static final ChatColor blue = ChatColor.BLUE;
    private static final ChatColor green = ChatColor.GREEN;
    private static final ChatColor white = ChatColor.WHITE;

    @SuppressWarnings("WeakerAccess")
    private static String C_PREFIX = green+"["+white+"MC_DNR"+green+"] ";
    public static String NC_PREFIX = "[MC_DNR] ";
    public static String NO_PERMS = red+"you do not have permission";
    public static String M_TEXT = C_PREFIX+blue;
}
