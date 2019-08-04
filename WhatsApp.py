from selenium import webdriver
from selenium import webdriver 
from selenium.webdriver.support.ui import WebDriverWait 
from selenium.webdriver.support import expected_conditions as EC 
from selenium.webdriver.common.keys import Keys 
from selenium.webdriver.common.by import By 
import time

driver= webdriver.Chrome(executable_path=r'C:\Users\Sunny Shubham\Desktop\chromedriver.exe')
driver.get("https://web.whatsapp.com/")
wait = WebDriverWait(driver, 600)

name= input('enter ur crush name:')
msg= input('Enter your message for her:')
count= int(input('Enter how many time u wanna irritate her :'))
input('enter anything after scanning ur qr code:' )

user= driver.find_element_by_css_selector('span[title="{}"]'.format(name))

user.click()

#msg_bx= driver.find_element_by_xpath("//div[text()='Type a message']")
#msg_bx = driver.find_element_by_css_selector("div[class='_2S1VP copyable-text selectable-text']")
msg_bx = driver.find_element_by_css_selector("div[class='_3u328 copyable-text selectable-text']")


for i in range(count):
    msg_bx.click()
    msg_bx.send_keys(msg +Keys.ENTER) 
   # btn= driver.find_element_by_class_name('compose-btn-send')
    #btn.click()
    time.sleep(1)
