package jtetris.common;

import static org.assertj.core.api.Assertions.assertThat;

import jtetris.common.shapes.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

/**
 * Unit test for {@link BlockBuilder}.
 * Created by ngeor on 16/6/2017.
 */
public class BlockBuilderTest {
    private BlockBuilder blockBuilder;

    @BeforeEach
    public void before() {
        blockBuilder = new BlockBuilder();
    }

    @Test
    public void createEmpty() {
        Shape shape = blockBuilder.create(BlockType.Empty);
        assertThat(shape).isInstanceOf(EmptyShape.class);
    }

    @Test
    public void createI() {
        Shape shape = blockBuilder.create(BlockType.I);
        assertThat(shape).isInstanceOf(IShape.class);
    }

    @Test
    public void createJ() {
        Shape shape = blockBuilder.create(BlockType.J);
        assertThat(shape).isInstanceOf(JShape.class);
    }

    @Test
    public void createL() {
        Shape shape = blockBuilder.create(BlockType.L);
        assertThat(shape).isInstanceOf(LShape.class);
    }

    @Test
    public void createO() {
        Shape shape = blockBuilder.create(BlockType.O);
        assertThat(shape).isInstanceOf(OShape.class);
    }

    @Test
    public void createS() {
        Shape shape = blockBuilder.create(BlockType.S);
        assertThat(shape).isInstanceOf(SShape.class);
    }

    @Test
    public void createT() {
        Shape shape = blockBuilder.create(BlockType.T);
        assertThat(shape).isInstanceOf(TShape.class);
    }

    @Test
    public void createZ() {
        Shape shape = blockBuilder.create(BlockType.Z);
        assertThat(shape).isInstanceOf(ZShape.class);
    }

    @ParameterizedTest
    @EnumSource(BlockType.class)
    public void createAllBlocksAreSupported(BlockType blockType) {
        assertThat(blockBuilder.create(blockType)).isNotNull();
    }
}
