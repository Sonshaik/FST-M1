# Import pandas
import pandas
from pandas import ExcelWriter

# Create a dictionary that will be used to create the DataFrame
data = {
	'FirstName':["Soniya", "Aadeel", "Nadhir"],
	'LastName':["Shaik", "Mohammad ", "MD"],
	'Email':["Soniya@example.com", "Aadeel@example.com", "Nadhir@example.com"],
	'PhoneNumber':["8297357788", "8297357788", "8297357788"]
}

# Create the DataFrame that will be written to the excel file
dataframe = pandas.DataFrame(data)

# Print the dataframe
print(dataframe)

# Write the dataframe to a Excel file
writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)

# Commit data to the Excel file
writer.save()