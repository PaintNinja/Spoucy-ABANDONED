package Ninja.Spoucy;

import Ninja.Spoucy.Lib.Reference;
import Ninja.Spoucy.Lib.Strings;
import Ninja.Spoucy.API.CustomBlocks;
import Ninja.Spoucy.API.CustomCarpet;
import Ninja.Spoucy.API.CustomGlass;
import Ninja.Spoucy.API.CustomPlant;
import Ninja.Spoucy.API.CustomSand;
import Ninja.Spoucy.API.ItemCustomBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

// Basic needed forge stuff
@Mod(modid=Reference.MOD_ID,name=Reference.MOD_NAME,version=Reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class SpoucyCore {
	
	public static final String modid = Reference.MOD_ID;
	
    @Instance(value = "Spoucy")
    public static SpoucyCore instance;
    
    public Block CustomStoneBlock;
    public Block CustomPlant;
    public Block CustomCarpet;
    public Block CustomSand;
    public Block CustomGlassBlock;
    public Item CustomItem;
    
    //Fallback Items and Blocks
    public static Item CustomStaticItem; //Used for the tab icon
    public static Item CustomStaticBlock; //Used if CustomStoneBlock fails - currently unused
    
	public static CreativeTabs tabSpoucy = new SpoucyTabs(CreativeTabs.getNextID(), "Spoucy");
	public static CreativeTabs tabSpoucyOther = new SpoucyTabs2(CreativeTabs.getNextID(), "Spoucy Other");
    
    /*
     * Mod startup
     */
    @EventHandler
    public void load(FMLInitializationEvent event) {
    	System.out.println("[Spoucy] Starting...");
		System.out.println("---------------------");
		
    	//define CustomStaticItem
		System.out.println("[Spoucy] Defining CustomStaticItem...");
		CustomStaticItem = new SpoucyItems(5000).setUnlocalizedName("CustomStaticItem");
		System.out.println("[Spoucy] Defined CustomStaticItem");
		
		//define CustomStoneBlock
		System.out.println("[Spoucy] Defining CustomStoneBlock...");
		CustomStoneBlock = new CustomBlocks(1000, Material.rock).setUnlocalizedName("spoucystoneblock").setHardness(2.0F);
		GameRegistry.registerBlock(CustomStoneBlock, ItemCustomBlock.class, modid + (CustomStoneBlock.getUnlocalizedName().substring(5)));
		System.out.println("[Spoucy] Defined CustomStoneBlock");
		
		//define CustomGlassBlock
		System.out.println("[Spoucy] Defining CustomGlassBlock...");
		CustomGlassBlock = new CustomGlass(1004, Material.glass).setUnlocalizedName("spoucyglassblock");
		GameRegistry.registerBlock(CustomGlassBlock, ItemCustomBlock.class, modid + (CustomGlassBlock.getUnlocalizedName().substring(5)));
		System.out.println("[Spoucy] Defined CustomGlassBlock");
		
		//define CustomPlant
		System.out.println("[Spoucy] Defining CustomPlant...");
		CustomPlant = new CustomPlant(1001, Material.plants).setUnlocalizedName("spoucyplant");
		GameRegistry.registerBlock(CustomPlant, ItemCustomBlock.class, modid + (CustomPlant.getUnlocalizedName().substring(5)));
		System.out.println("[Spoucy] Defined CustomPlant");
		
		//define CustomCarpet
		System.out.println("[Spoucy] Defining CustomCarpet...");
		CustomCarpet = new CustomCarpet(1002, Material.materialCarpet).setUnlocalizedName("spoucycarpet");
		GameRegistry.registerBlock(CustomCarpet, ItemCustomBlock.class, modid + (CustomCarpet.getUnlocalizedName().substring(5)));
		System.out.println("[Spoucy] Defined CustomCarpet");
		
		//define CustomSand
		System.out.println("[Spoucy] Defining CustomSand...");
		CustomSand = new CustomSand(1003, Material.sand).setUnlocalizedName("spoucysand");
		GameRegistry.registerBlock(CustomSand, ItemCustomBlock.class, modid + (CustomSand.getUnlocalizedName().substring(5)));
		System.out.println("[Spoucy] Defined CustomSand");
		
    	//define CustomItem TODO
/*		System.out.println("[Spoucy] Defining CustomItem...");
		CustomItem = new SpoucyItems(5001).setUnlocalizedName("CustomItem");
		System.out.println("[Spoucy] Defined CustomItem");
*/	
		//names
		System.out.println("[Spoucy] Defining default names...");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 0), Strings.CUSTOMSTONEBLOCK_NAME + "1");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 1), Strings.CUSTOMSTONEBLOCK_NAME + "2");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 2), Strings.CUSTOMSTONEBLOCK_NAME + "3");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 3), Strings.CUSTOMSTONEBLOCK_NAME + "4");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 4), Strings.CUSTOMSTONEBLOCK_NAME + "5");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 5), Strings.CUSTOMSTONEBLOCK_NAME + "6");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 6), Strings.CUSTOMSTONEBLOCK_NAME + "7");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 7), Strings.CUSTOMSTONEBLOCK_NAME + "8");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 8), Strings.CUSTOMSTONEBLOCK_NAME + "9");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 9), Strings.CUSTOMSTONEBLOCK_NAME + "10");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 10), Strings.CUSTOMSTONEBLOCK_NAME + "11");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 11), Strings.CUSTOMSTONEBLOCK_NAME + "12");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 12), Strings.CUSTOMSTONEBLOCK_NAME + "13");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 13), Strings.CUSTOMSTONEBLOCK_NAME + "14");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 14), Strings.CUSTOMSTONEBLOCK_NAME + "15");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 15), Strings.CUSTOMSTONEBLOCK_NAME + "16");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 16), Strings.CUSTOMSTONEBLOCK_NAME + "17");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 17), Strings.CUSTOMSTONEBLOCK_NAME + "18");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 18), Strings.CUSTOMSTONEBLOCK_NAME + "19");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 19), Strings.CUSTOMSTONEBLOCK_NAME + "20");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 20), Strings.CUSTOMSTONEBLOCK_NAME + "21");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 21), Strings.CUSTOMSTONEBLOCK_NAME + "22");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 22), Strings.CUSTOMSTONEBLOCK_NAME + "23");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 23), Strings.CUSTOMSTONEBLOCK_NAME + "24");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 24), Strings.CUSTOMSTONEBLOCK_NAME + "25");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 25), Strings.CUSTOMSTONEBLOCK_NAME + "26");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 26), Strings.CUSTOMSTONEBLOCK_NAME + "27");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 27), Strings.CUSTOMSTONEBLOCK_NAME + "28");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 28), Strings.CUSTOMSTONEBLOCK_NAME + "29");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 29), Strings.CUSTOMSTONEBLOCK_NAME + "30");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 30), Strings.CUSTOMSTONEBLOCK_NAME + "31");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 31), Strings.CUSTOMSTONEBLOCK_NAME + "32");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 32), Strings.CUSTOMSTONEBLOCK_NAME + "33");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 33), Strings.CUSTOMSTONEBLOCK_NAME + "34");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 34), Strings.CUSTOMSTONEBLOCK_NAME + "35");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 35), Strings.CUSTOMSTONEBLOCK_NAME + "36");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 36), Strings.CUSTOMSTONEBLOCK_NAME + "37");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 37), Strings.CUSTOMSTONEBLOCK_NAME + "38");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 38), Strings.CUSTOMSTONEBLOCK_NAME + "39");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 39), Strings.CUSTOMSTONEBLOCK_NAME + "40");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 40), Strings.CUSTOMSTONEBLOCK_NAME + "41");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 41), Strings.CUSTOMSTONEBLOCK_NAME + "42");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 42), Strings.CUSTOMSTONEBLOCK_NAME + "43");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 43), Strings.CUSTOMSTONEBLOCK_NAME + "44");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 44), Strings.CUSTOMSTONEBLOCK_NAME + "45");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 45), Strings.CUSTOMSTONEBLOCK_NAME + "46");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 46), Strings.CUSTOMSTONEBLOCK_NAME + "47");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 47), Strings.CUSTOMSTONEBLOCK_NAME + "48");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 48), Strings.CUSTOMSTONEBLOCK_NAME + "49");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 49), Strings.CUSTOMSTONEBLOCK_NAME + "50");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 50), Strings.CUSTOMSTONEBLOCK_NAME + "51");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 51), Strings.CUSTOMSTONEBLOCK_NAME + "52");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 52), Strings.CUSTOMSTONEBLOCK_NAME + "53");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 53), Strings.CUSTOMSTONEBLOCK_NAME + "54");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 54), Strings.CUSTOMSTONEBLOCK_NAME + "55");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 55), Strings.CUSTOMSTONEBLOCK_NAME + "56");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 56), Strings.CUSTOMSTONEBLOCK_NAME + "57");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 57), Strings.CUSTOMSTONEBLOCK_NAME + "58");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 58), Strings.CUSTOMSTONEBLOCK_NAME + "59");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 59), Strings.CUSTOMSTONEBLOCK_NAME + "60");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 60), Strings.CUSTOMSTONEBLOCK_NAME + "61");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 61), Strings.CUSTOMSTONEBLOCK_NAME + "62");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 62), Strings.CUSTOMSTONEBLOCK_NAME + "63");
		LanguageRegistry.addName(new ItemStack(CustomStoneBlock, 1, 63), Strings.CUSTOMSTONEBLOCK_NAME + "64");
		
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 0), Strings.CUSTOMPLANT_NAME + "1");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 1), Strings.CUSTOMPLANT_NAME + "2");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 2), Strings.CUSTOMPLANT_NAME + "3");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 3), Strings.CUSTOMPLANT_NAME + "4");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 4), Strings.CUSTOMPLANT_NAME + "5");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 5), Strings.CUSTOMPLANT_NAME + "6");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 6), Strings.CUSTOMPLANT_NAME + "7");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 7), Strings.CUSTOMPLANT_NAME + "8");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 8), Strings.CUSTOMPLANT_NAME + "9");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 9), Strings.CUSTOMPLANT_NAME + "10");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 10), Strings.CUSTOMPLANT_NAME + "11");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 11), Strings.CUSTOMPLANT_NAME + "12");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 12), Strings.CUSTOMPLANT_NAME + "13");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 13), Strings.CUSTOMPLANT_NAME + "14");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 14), Strings.CUSTOMPLANT_NAME + "15");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 15), Strings.CUSTOMPLANT_NAME + "16");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 16), Strings.CUSTOMPLANT_NAME + "17");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 17), Strings.CUSTOMPLANT_NAME + "18");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 18), Strings.CUSTOMPLANT_NAME + "19");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 19), Strings.CUSTOMPLANT_NAME + "20");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 20), Strings.CUSTOMPLANT_NAME + "21");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 21), Strings.CUSTOMPLANT_NAME + "22");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 22), Strings.CUSTOMPLANT_NAME + "23");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 23), Strings.CUSTOMPLANT_NAME + "24");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 24), Strings.CUSTOMPLANT_NAME + "25");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 25), Strings.CUSTOMPLANT_NAME + "26");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 26), Strings.CUSTOMPLANT_NAME + "27");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 27), Strings.CUSTOMPLANT_NAME + "28");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 28), Strings.CUSTOMPLANT_NAME + "29");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 29), Strings.CUSTOMPLANT_NAME + "30");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 30), Strings.CUSTOMPLANT_NAME + "31");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 31), Strings.CUSTOMPLANT_NAME + "32");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 32), Strings.CUSTOMPLANT_NAME + "33");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 33), Strings.CUSTOMPLANT_NAME + "34");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 34), Strings.CUSTOMPLANT_NAME + "35");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 35), Strings.CUSTOMPLANT_NAME + "36");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 36), Strings.CUSTOMPLANT_NAME + "37");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 37), Strings.CUSTOMPLANT_NAME + "38");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 38), Strings.CUSTOMPLANT_NAME + "39");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 39), Strings.CUSTOMPLANT_NAME + "40");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 40), Strings.CUSTOMPLANT_NAME + "41");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 41), Strings.CUSTOMPLANT_NAME + "42");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 42), Strings.CUSTOMPLANT_NAME + "43");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 43), Strings.CUSTOMPLANT_NAME + "44");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 44), Strings.CUSTOMPLANT_NAME + "45");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 45), Strings.CUSTOMPLANT_NAME + "46");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 46), Strings.CUSTOMPLANT_NAME + "47");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 47), Strings.CUSTOMPLANT_NAME + "48");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 48), Strings.CUSTOMPLANT_NAME + "49");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 49), Strings.CUSTOMPLANT_NAME + "50");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 50), Strings.CUSTOMPLANT_NAME + "51");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 51), Strings.CUSTOMPLANT_NAME + "52");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 52), Strings.CUSTOMPLANT_NAME + "53");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 53), Strings.CUSTOMPLANT_NAME + "54");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 54), Strings.CUSTOMPLANT_NAME + "55");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 55), Strings.CUSTOMPLANT_NAME + "56");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 56), Strings.CUSTOMPLANT_NAME + "57");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 57), Strings.CUSTOMPLANT_NAME + "58");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 58), Strings.CUSTOMPLANT_NAME + "59");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 59), Strings.CUSTOMPLANT_NAME + "60");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 60), Strings.CUSTOMPLANT_NAME + "61");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 61), Strings.CUSTOMPLANT_NAME + "62");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 62), Strings.CUSTOMPLANT_NAME + "63");
		LanguageRegistry.addName(new ItemStack(CustomPlant, 1, 63), Strings.CUSTOMPLANT_NAME + "64");
		
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 0), Strings.CUSTOMCARPET_NAME + "1");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 1), Strings.CUSTOMCARPET_NAME + "2");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 2), Strings.CUSTOMCARPET_NAME + "3");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 3), Strings.CUSTOMCARPET_NAME + "4");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 4), Strings.CUSTOMCARPET_NAME + "5");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 5), Strings.CUSTOMCARPET_NAME + "6");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 6), Strings.CUSTOMCARPET_NAME + "7");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 7), Strings.CUSTOMCARPET_NAME + "8");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 8), Strings.CUSTOMCARPET_NAME + "9");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 9), Strings.CUSTOMCARPET_NAME + "10");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 10), Strings.CUSTOMCARPET_NAME + "11");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 11), Strings.CUSTOMCARPET_NAME + "12");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 12), Strings.CUSTOMCARPET_NAME + "13");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 13), Strings.CUSTOMCARPET_NAME + "14");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 14), Strings.CUSTOMCARPET_NAME + "15");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 15), Strings.CUSTOMCARPET_NAME + "16");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 16), Strings.CUSTOMCARPET_NAME + "17");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 17), Strings.CUSTOMCARPET_NAME + "18");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 18), Strings.CUSTOMCARPET_NAME + "19");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 19), Strings.CUSTOMCARPET_NAME + "20");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 20), Strings.CUSTOMCARPET_NAME + "21");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 21), Strings.CUSTOMCARPET_NAME + "22");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 22), Strings.CUSTOMCARPET_NAME + "23");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 23), Strings.CUSTOMCARPET_NAME + "24");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 24), Strings.CUSTOMCARPET_NAME + "25");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 25), Strings.CUSTOMCARPET_NAME + "26");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 26), Strings.CUSTOMCARPET_NAME + "27");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 27), Strings.CUSTOMCARPET_NAME + "28");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 28), Strings.CUSTOMCARPET_NAME + "29");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 29), Strings.CUSTOMCARPET_NAME + "30");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 30), Strings.CUSTOMCARPET_NAME + "31");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 31), Strings.CUSTOMCARPET_NAME + "32");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 32), Strings.CUSTOMCARPET_NAME + "33");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 33), Strings.CUSTOMCARPET_NAME + "34");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 34), Strings.CUSTOMCARPET_NAME + "35");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 35), Strings.CUSTOMCARPET_NAME + "36");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 36), Strings.CUSTOMCARPET_NAME + "37");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 37), Strings.CUSTOMCARPET_NAME + "38");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 38), Strings.CUSTOMCARPET_NAME + "39");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 39), Strings.CUSTOMCARPET_NAME + "40");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 40), Strings.CUSTOMCARPET_NAME + "41");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 41), Strings.CUSTOMCARPET_NAME + "42");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 42), Strings.CUSTOMCARPET_NAME + "43");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 43), Strings.CUSTOMCARPET_NAME + "44");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 44), Strings.CUSTOMCARPET_NAME + "45");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 45), Strings.CUSTOMCARPET_NAME + "46");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 46), Strings.CUSTOMCARPET_NAME + "47");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 47), Strings.CUSTOMCARPET_NAME + "48");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 48), Strings.CUSTOMCARPET_NAME + "49");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 49), Strings.CUSTOMCARPET_NAME + "50");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 50), Strings.CUSTOMCARPET_NAME + "51");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 51), Strings.CUSTOMCARPET_NAME + "52");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 52), Strings.CUSTOMCARPET_NAME + "53");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 53), Strings.CUSTOMCARPET_NAME + "54");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 54), Strings.CUSTOMCARPET_NAME + "55");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 55), Strings.CUSTOMCARPET_NAME + "56");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 56), Strings.CUSTOMCARPET_NAME + "57");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 57), Strings.CUSTOMCARPET_NAME + "58");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 58), Strings.CUSTOMCARPET_NAME + "59");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 59), Strings.CUSTOMCARPET_NAME + "60");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 60), Strings.CUSTOMCARPET_NAME + "61");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 61), Strings.CUSTOMCARPET_NAME + "62");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 62), Strings.CUSTOMCARPET_NAME + "63");
		LanguageRegistry.addName(new ItemStack(CustomCarpet, 1, 63), Strings.CUSTOMCARPET_NAME + "64");
		
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 0), Strings.CUSTOMSAND_NAME + "1");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 1), Strings.CUSTOMSAND_NAME + "2");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 2), Strings.CUSTOMSAND_NAME + "3");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 3), Strings.CUSTOMSAND_NAME + "4");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 4), Strings.CUSTOMSAND_NAME + "5");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 5), Strings.CUSTOMSAND_NAME + "6");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 6), Strings.CUSTOMSAND_NAME + "7");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 7), Strings.CUSTOMSAND_NAME + "8");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 8), Strings.CUSTOMSAND_NAME + "9");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 9), Strings.CUSTOMSAND_NAME + "10");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 10), Strings.CUSTOMSAND_NAME + "11");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 11), Strings.CUSTOMSAND_NAME + "12");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 12), Strings.CUSTOMSAND_NAME + "13");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 13), Strings.CUSTOMSAND_NAME + "14");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 14), Strings.CUSTOMSAND_NAME + "15");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 15), Strings.CUSTOMSAND_NAME + "16");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 16), Strings.CUSTOMSAND_NAME + "17");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 17), Strings.CUSTOMSAND_NAME + "18");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 18), Strings.CUSTOMSAND_NAME + "19");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 19), Strings.CUSTOMSAND_NAME + "20");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 20), Strings.CUSTOMSAND_NAME + "21");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 21), Strings.CUSTOMSAND_NAME + "22");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 22), Strings.CUSTOMSAND_NAME + "23");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 23), Strings.CUSTOMSAND_NAME + "24");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 24), Strings.CUSTOMSAND_NAME + "25");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 25), Strings.CUSTOMSAND_NAME + "26");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 26), Strings.CUSTOMSAND_NAME + "27");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 27), Strings.CUSTOMSAND_NAME + "28");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 28), Strings.CUSTOMSAND_NAME + "29");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 29), Strings.CUSTOMSAND_NAME + "30");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 30), Strings.CUSTOMSAND_NAME + "31");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 31), Strings.CUSTOMSAND_NAME + "32");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 32), Strings.CUSTOMSAND_NAME + "33");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 33), Strings.CUSTOMSAND_NAME + "34");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 34), Strings.CUSTOMSAND_NAME + "35");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 35), Strings.CUSTOMSAND_NAME + "36");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 36), Strings.CUSTOMSAND_NAME + "37");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 37), Strings.CUSTOMSAND_NAME + "38");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 38), Strings.CUSTOMSAND_NAME + "39");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 39), Strings.CUSTOMSAND_NAME + "40");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 40), Strings.CUSTOMSAND_NAME + "41");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 41), Strings.CUSTOMSAND_NAME + "42");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 42), Strings.CUSTOMSAND_NAME + "43");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 43), Strings.CUSTOMSAND_NAME + "44");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 44), Strings.CUSTOMSAND_NAME + "45");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 45), Strings.CUSTOMSAND_NAME + "46");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 46), Strings.CUSTOMSAND_NAME + "47");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 47), Strings.CUSTOMSAND_NAME + "48");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 48), Strings.CUSTOMSAND_NAME + "49");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 49), Strings.CUSTOMSAND_NAME + "50");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 50), Strings.CUSTOMSAND_NAME + "51");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 51), Strings.CUSTOMSAND_NAME + "52");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 52), Strings.CUSTOMSAND_NAME + "53");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 53), Strings.CUSTOMSAND_NAME + "54");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 54), Strings.CUSTOMSAND_NAME + "55");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 55), Strings.CUSTOMSAND_NAME + "56");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 56), Strings.CUSTOMSAND_NAME + "57");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 57), Strings.CUSTOMSAND_NAME + "58");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 58), Strings.CUSTOMSAND_NAME + "59");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 59), Strings.CUSTOMSAND_NAME + "60");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 60), Strings.CUSTOMSAND_NAME + "61");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 61), Strings.CUSTOMSAND_NAME + "62");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 62), Strings.CUSTOMSAND_NAME + "63");
		LanguageRegistry.addName(new ItemStack(CustomSand, 1, 63), Strings.CUSTOMSAND_NAME + "64");
		
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 0), Strings.CUSTOMGLASSBLOCK_NAME + "1");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 1), Strings.CUSTOMGLASSBLOCK_NAME + "2");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 2), Strings.CUSTOMGLASSBLOCK_NAME + "3");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 3), Strings.CUSTOMGLASSBLOCK_NAME + "4");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 4), Strings.CUSTOMGLASSBLOCK_NAME + "5");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 5), Strings.CUSTOMGLASSBLOCK_NAME + "6");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 6), Strings.CUSTOMGLASSBLOCK_NAME + "7");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 7), Strings.CUSTOMGLASSBLOCK_NAME + "8");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 8), Strings.CUSTOMGLASSBLOCK_NAME + "9");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 9), Strings.CUSTOMGLASSBLOCK_NAME + "10");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 10), Strings.CUSTOMGLASSBLOCK_NAME + "11");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 11), Strings.CUSTOMGLASSBLOCK_NAME + "12");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 12), Strings.CUSTOMGLASSBLOCK_NAME + "13");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 13), Strings.CUSTOMGLASSBLOCK_NAME + "14");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 14), Strings.CUSTOMGLASSBLOCK_NAME + "15");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 15), Strings.CUSTOMGLASSBLOCK_NAME + "16");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 16), Strings.CUSTOMGLASSBLOCK_NAME + "17");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 17), Strings.CUSTOMGLASSBLOCK_NAME + "18");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 18), Strings.CUSTOMGLASSBLOCK_NAME + "19");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 19), Strings.CUSTOMGLASSBLOCK_NAME + "20");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 20), Strings.CUSTOMGLASSBLOCK_NAME + "21");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 21), Strings.CUSTOMGLASSBLOCK_NAME + "22");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 22), Strings.CUSTOMGLASSBLOCK_NAME + "23");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 23), Strings.CUSTOMGLASSBLOCK_NAME + "24");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 24), Strings.CUSTOMGLASSBLOCK_NAME + "25");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 25), Strings.CUSTOMGLASSBLOCK_NAME + "26");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 26), Strings.CUSTOMGLASSBLOCK_NAME + "27");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 27), Strings.CUSTOMGLASSBLOCK_NAME + "28");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 28), Strings.CUSTOMGLASSBLOCK_NAME + "29");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 29), Strings.CUSTOMGLASSBLOCK_NAME + "30");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 30), Strings.CUSTOMGLASSBLOCK_NAME + "31");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 31), Strings.CUSTOMGLASSBLOCK_NAME + "32");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 32), Strings.CUSTOMGLASSBLOCK_NAME + "33");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 33), Strings.CUSTOMGLASSBLOCK_NAME + "34");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 34), Strings.CUSTOMGLASSBLOCK_NAME + "35");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 35), Strings.CUSTOMGLASSBLOCK_NAME + "36");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 36), Strings.CUSTOMGLASSBLOCK_NAME + "37");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 37), Strings.CUSTOMGLASSBLOCK_NAME + "38");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 38), Strings.CUSTOMGLASSBLOCK_NAME + "39");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 39), Strings.CUSTOMGLASSBLOCK_NAME + "40");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 40), Strings.CUSTOMGLASSBLOCK_NAME + "41");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 41), Strings.CUSTOMGLASSBLOCK_NAME + "42");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 42), Strings.CUSTOMGLASSBLOCK_NAME + "43");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 43), Strings.CUSTOMGLASSBLOCK_NAME + "44");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 44), Strings.CUSTOMGLASSBLOCK_NAME + "45");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 45), Strings.CUSTOMGLASSBLOCK_NAME + "46");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 46), Strings.CUSTOMGLASSBLOCK_NAME + "47");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 47), Strings.CUSTOMGLASSBLOCK_NAME + "48");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 48), Strings.CUSTOMGLASSBLOCK_NAME + "49");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 49), Strings.CUSTOMGLASSBLOCK_NAME + "50");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 50), Strings.CUSTOMGLASSBLOCK_NAME + "51");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 51), Strings.CUSTOMGLASSBLOCK_NAME + "52");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 52), Strings.CUSTOMGLASSBLOCK_NAME + "53");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 53), Strings.CUSTOMGLASSBLOCK_NAME + "54");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 54), Strings.CUSTOMGLASSBLOCK_NAME + "55");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 55), Strings.CUSTOMGLASSBLOCK_NAME + "56");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 56), Strings.CUSTOMGLASSBLOCK_NAME + "57");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 57), Strings.CUSTOMGLASSBLOCK_NAME + "58");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 58), Strings.CUSTOMGLASSBLOCK_NAME + "59");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 59), Strings.CUSTOMGLASSBLOCK_NAME + "60");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 60), Strings.CUSTOMGLASSBLOCK_NAME + "61");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 61), Strings.CUSTOMGLASSBLOCK_NAME + "62");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 62), Strings.CUSTOMGLASSBLOCK_NAME + "63");
		LanguageRegistry.addName(new ItemStack(CustomGlassBlock, 1, 63), Strings.CUSTOMGLASSBLOCK_NAME + "64");
		
		/* TODO
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 0), "CustomItem1");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 1), "CustomItem2");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 2), "CustomItem3");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 3), "CustomItem4");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 4), "CustomItem5");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 5), "CustomItem6");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 6), "CustomItem7");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 7), "CustomItem8");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 8), "CustomItem9");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 9), "CustomItem10");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 10), "CustomItem11");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 11), "CustomItem12");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 12), "CustomItem13");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 13), "CustomItem14");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 14), "CustomItem15");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 15), "CustomItem16");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 16), "CustomItem17");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 17), "CustomItem18");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 18), "CustomItem19");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 19), "CustomItem20");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 20), "CustomItem21");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 21), "CustomItem22");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 22), "CustomItem23");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 23), "CustomItem24");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 24), "CustomItem25");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 25), "CustomItem26");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 26), "CustomItem27");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 27), "CustomItem28");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 28), "CustomItem29");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 29), "CustomItem30");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 30), "CustomItem31");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 31), "CustomItem32");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 32), "CustomItem33");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 33), "CustomItem34");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 34), "CustomItem35");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 35), "CustomItem36");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 36), "CustomItem37");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 37), "CustomItem38");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 38), "CustomItem39");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 39), "CustomItem40");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 40), "CustomItem41");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 41), "CustomItem42");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 42), "CustomItem43");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 43), "CustomItem44");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 44), "CustomItem45");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 45), "CustomItem46");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 46), "CustomItem47");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 47), "CustomItem48");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 48), "CustomItem49");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 49), "CustomItem50");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 50), "CustomItem51");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 51), "CustomItem52");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 52), "CustomItem53");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 53), "CustomItem54");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 54), "CustomItem55");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 55), "CustomItem56");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 56), "CustomItem57");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 57), "CustomItem58");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 58), "CustomItem59");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 59), "CustomItem60");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 60), "CustomItem61");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 61), "CustomItem62");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 62), "CustomItem63");
		LanguageRegistry.addName(new ItemStack(CustomItem, 1, 63), "CustomItem64");
		*/
		
		LanguageRegistry.addName(CustomStaticItem,"Tab icon DO NOT USE");
		System.out.println("[Spoucy] Defined default names");
    }

}