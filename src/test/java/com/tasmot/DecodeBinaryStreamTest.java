package com.tasmot;

import org.junit.*;

public class DecodeBinaryStreamTest {
	DecodeBinaryStream dbs;

	@Before
	public void initialize() {
		dbs = new DecodeBinaryStream(null);
	}


	@Test
	public void OneLetterBinaryToTextTest() {
		dbs = new DecodeBinaryStream(null);

		String binary = "10000111000001101000010101001001001101011010000011010100100100110011111001110";
		String wholeThing =
				"010000111000001101000010101001001001101011010000011010100100100110011111001110010000010101001101000110100111100110100000110100111100110100000111010011010001100101010000011011011100101111001111100111100001110011111001010100000111011111010001100101111001011001010100000100100101000001110011111010111000111100011110010111100111110011110011011101011101100110110011110010100000110011011011111110101110111011001000100000111010011010001100101010000010000111000001101000010101001001001101011010000011010100100100110011111001110010000011100001110010110010111000011101101110001011011001100101010000011000011101110110010001000001001001010011111011010100000111000011100101101001110111011101001101001110111011001110100000110100111101000100000110111111101011110100010000101000010100001";

		Assert.assertEquals("C", DecodeBinaryStream.binaryToText(new StringBuilder("1000011")));
	}
	@Test
	public void OneWordBinaryToTextTest() {
		dbs = new DecodeBinaryStream(null);

		String binary = "10000111000001101000010101001001001101011010000011010100100100110011111001110";

		Assert.assertEquals("CAPTIVATION", DecodeBinaryStream.binaryToText(new StringBuilder(binary)));
	}
	@Test
	public void OnePhraseBinaryToTextTest() {
		dbs = new DecodeBinaryStream(null);

		String wholeThing =
				"1000011100000110100001010100100100110101101000001101010010010011001111" +
				"1001110010000010101001101000110100111100110100000110100111100110100000" +
				"1110100110100011001010100000110110111001011110011111001111000011100111" +
				"1100101010000011101111101000110010111100101100101010000010010010100000" +
				"1110011111010111000111100011110010111100111110011110011011101011101100" +
				"1101100111100101000001100110110111111101011101110110010001000001110100" +
				"1101000110010101000001000011100000110100001010100100100110101101000001" +
				"1010100100100110011111001110010000011100001110010110010111000011101101" +
				"1100010110110011001010100000110000111011101100100010000010010010100111" +
				"1101101010000011100001110010110100111011101110100110100111011101100111" +
				"0100000110100111101000100000110111111101011110100010000101000010100001";

		Assert.assertEquals("CAPTIVATION This is the message where I successfully found the CAPTIVATION preamble and " +
						"I'm printing it out!!!",
				DecodeBinaryStream.binaryToText(new StringBuilder(wholeThing))
		                   );
	}

}