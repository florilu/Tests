package net.minecraft.src;

import java.util.Random;

public class Test extends WorldGenerator
{
    public boolean generate(World par1World, Random par2Random, int par1, int par2, int par3)
    {
        while (par1World.isAirBlock (par1, par2, par3) && par2 > 2)
        {
            --par2;
        }

        int var6 = par1World.getBlockId(par1, par2, par3);

        if (var6 != Block.grass.blockID)
        {
            return false;
        }
        else
        {
            int x;
            int y;
            int z;
            
            for (x = -1; x <= 1; ++x)
            {
                for (y = -1; y <= 1; ++y)
                {
                    if (x == 0 && x == 0)
                    {
                        par1World.setBlock(par1 + x, par2 + 4, par3 + y, Block.sandStone.blockID);
                    }
                    else
                    {
                        par1World.setBlockAndMetadata(par1 + x, par2 + 4, par3 + y, Block.stoneSingleSlab.blockID, 1);
                    }
                }
            }


            return true;
        }
    }
}
