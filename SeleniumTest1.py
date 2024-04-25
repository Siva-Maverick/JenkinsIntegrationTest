from selenium import webdriver
from selenium.webdriver.common.by import By
driver = webdriver.Chrome()
driver.get("https://leafground.com/")
driver.maximize_window()
print('Page title is : ',driver.title)
wb1 = driver.find_element(By.XPATH, "//li//span[text()='Element']/..")
wb1.click()
wb2 = driver.find_element(By.XPATH, "//li//span[text()='Text Box']/..")
wb2.click()
print('Page title is : ',driver.title)

# List of webelements, for loop, if condition with contains text
headers = driver.find_elements(By.TAG_NAME, "h5")
for i in headers:
    print('All headers - ', i.text)

for i in headers:
    val = i.text
    if 'name' in val:
        print('Header with name in it - ', val)
print("Headers verification done")
