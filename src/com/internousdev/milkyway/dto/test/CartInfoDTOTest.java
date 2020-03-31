package com.internousdev.milkyway.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.milkyway.dto.CartInfoDTO;

public class CartInfoDTOTest {

	// test getProductId()
	@Test
	public void test_getProductId_null() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_emptyCharacter() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_space() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_fullSpace() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getProductId_alphabeticCharacters() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_halfWidthDigit() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "123";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_hiragana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "てすと";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_katakana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "テスト";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_kanji() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_all() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	// test setProductId()
	@Test
	public void test_setProductId_null() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_emptyCharacter() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_space() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_fullSpace() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setProductId_alphabeticCharacters() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_halfWidthDigit() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "123";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_hiragana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "てすと";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_katakana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "テスト";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_kanji() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_all() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}

	// test setProductCount()
	@Test
	public void test_getProductCount_null() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductCount_emptyCharacter() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductCount_space() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductCount_fullSpace() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getProductCount_alphabeticCharacters() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductCount_halfWidthDigit() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "123";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductCount_hiragana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "てすと";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductCount_katakana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "テスト";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductCount_kanji() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductCount_all() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}

	// test setProductCount()
	@Test
	public void test_setProductCount_null() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductCount_emptyCharacter() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductCount_space() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductCount_fullSpace() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setProductCount_alphabeticCharacters() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductCount_halfWidthDigit() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "123";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductCount_hiragana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "てすと";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductCount_katakana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "テスト";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductCount_kanji() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductCount_all() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected,actual);
	}

	// test getProductName()
	@Test
	public void test_getProductName_null() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_emptyCharacter() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_space() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_fullSpace() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getProductName_alphabeticCharacters() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_halfWidthDigit() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_hiragana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "てすと";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_katakana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "テスト";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_kanji() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_all() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}

	// test setProductName()
	@Test
	public void test_setProductName_null() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_emptyCharacter() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_space() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_fullSpace() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setProductName_alphabeticCharacters() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_halfWidthDigit() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_hiragana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "てすと";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_katakana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "テスト";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_kanji() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_all() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}

	// test getProductNameKana()
	@Test
	public void test_getProductNameKana_null() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_emptyCharacter() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_space() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_fullSpace() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getProductNameKana_alphabeticCharacters() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_halfWidthDigit() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_hiragana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "てすと";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_katakana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "テスト";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_kanji() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_all() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	// test setProductNameKana()
	@Test
	public void test_setProductNameKana_null() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_emptyCharacter() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_space() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_fullSpace() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setProductNameKana_alphabeticCharacters() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_halfWidthDigit() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_hiragana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "てすと";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_katakana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "テスト";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_kanji() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_all() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	// test getImageFile()
	@Test
	public void test_getImageFile_null() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFile_emptyCharacter() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFile_space() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFile_fullSpace() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getImageFile_alphabeticCharacters() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFile_halfWidthDigit() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "123";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFile_hiragana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "てすと";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFile_katakana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "テスト";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFile_kanji() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFile_all() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}

	// test setImageFile()
	@Test
	public void test_setImageFile_null() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFile_emptyCharacter() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFile_space() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFile_fullSpace() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setImageFile_alphabeticCharacters() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFile_halfWidthDigit() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "123";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFile_hiragana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "てすと";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFile_katakana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "テスト";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFile_kanji() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFile_all() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}

	// test getPrice()
	@Test
	public void test_getPrice_null() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_emptyCharacter() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_space() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_fullSpace() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getPrice_alphabeticCharacters() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_halfWidthDigit() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "123";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_hiragana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "てすと";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_katakana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "テスト";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_kanji() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_all() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}

	// test setPrice()
	@Test
	public void test_setPrice_null() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_emptyCharacter() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_space() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_fullSpace() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setPrice_alphabeticCharacters() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_halfWidthDigit() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "123";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_hiragana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "てすと";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_katakana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "テスト";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_kanji() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_all() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}

	// test getReleaseCompany()
	@Test
	public void test_getReleaseCompany_null() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_emptyCharacter() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_space() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_fullSpace() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getReleaseCompany_alphabeticCharacters() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_halfWidthDigit() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_hiragana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "てすと";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_katakana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "テスト";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_kanji() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_all() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	// test setReleaseCompany()
	@Test
	public void test_setReleaseCompany_null() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_emptyCharacter() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_space() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_fullSpace() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setReleaseCompany_alphabeticCharacters() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_halfWidthDigit() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_hiragana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "てすと";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_katakana() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "テスト";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_kanji() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_all() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	// test getReleaseDate()
	@Test
	public void test_getReleaseDate_null() {
		CartInfoDTO dto = new CartInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void test_getReleaseDate_date() {
		CartInfoDTO dto = new CartInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected;
		try {
			expected = sdf.parse("20180420 12:00:00");
			dto.setReleaseDate(expected);
			assertEquals(expected, dto.getReleaseDate());
		} catch (ParseException e) {
			fail();
		}
	}

	// test setReleaseDate()
	@Test
	public void test_setReleaseDate_null() {
		CartInfoDTO dto = new CartInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void test_setReleaseDate_date() {
		CartInfoDTO dto = new CartInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected;
		try {
			expected = sdf.parse("20180420 12:00:00");
			dto.setReleaseDate(expected);
			assertEquals(expected, dto.getReleaseDate());
		} catch (ParseException e) {
			fail();
		}
	}

	// test getTotalPrice()
	@Test
	public void test_getTotalPrice_max() {
		CartInfoDTO dto = new CartInfoDTO();
		// 期待値を作成
		int expected = 2147483647;
		dto.setTotalPrice(expected);

		// テスト対象
		int actual = dto.getTotalPrice();

		// 期待値とテスト対象で取得した値が一致するかを確認
		assertEquals(expected,actual);
	}
	@Test
	public void test_getTotalPrice_min() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483648;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getTotalPrice_0() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}

	// test setTotalPrice()
	@Test
	public void test_setTotalPrice_max() {
		CartInfoDTO dto = new CartInfoDTO();
		// 期待値を作成
		int expected = 2147483647;

		// テスト対象
		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();

		// 期待値とテスト対象で設定した値が一致するかを確認
		assertEquals(expected,actual);
	}
	@Test
	public void test_setTotalPrice_min() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483648;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setTotalPrice_0() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}

}
